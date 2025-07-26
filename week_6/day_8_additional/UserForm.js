import React, { useState } from 'react';

function UserForm({ onSubmit, checkDuplicate }) {
  const [user, setUser] = useState({ name: '', email: '', age: '' });
  const [error, setError] = useState('');

  const handleChange = (e) => {
    setUser({ ...user, [e.target.name]: e.target.value });
  };

  const handleSubmit = () => {
    const { name, email, age } = user;
    if (!name || !email || !age) {
      setError('⚠️ All fields are required!');
      return;
    }

    if (checkDuplicate(user)) {
      setError('⚠️ Already Registered!');
      return;
    }

    onSubmit(user);
    setUser({ name: '', email: '', age: '' });
    setError('');
  };

  return (
    <div style={{ marginBottom: '20px' }}>
      <input
        type="text"
        name="name"
        placeholder="Name"
        value={user.name}
        onChange={handleChange}
      />{' '}
      <input
        type="email"
        name="email"
        placeholder="Email"
        value={user.email}
        onChange={handleChange}
      />{' '}
      <input
        type="number"
        name="age"
        placeholder="Age"
        value={user.age}
        onChange={handleChange}
      />{' '}
      <button onClick={handleSubmit}>Register</button>
      {error && <p style={{ color: 'red' }}>{error}</p>}
    </div>
  );
}

export default UserForm;
