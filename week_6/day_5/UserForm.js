import React, { useState } from 'react';

const UserForm = ({ onAddUser }) => {
  const [name, setName] = useState('');
  const [email, setEmail] = useState('');

  const submitHandler = (e) => {
    e.preventDefault();
    if (name && email) {
      onAddUser({ name, email });
      setName('');
      setEmail('');
    }
  };

  return (
    <form onSubmit={submitHandler} style={{ marginBottom: '20px' }}>
      <h2>Add New User</h2>
      <input
        type="text"
        placeholder="Name"
        value={name}
        onChange={(e) => setName(e.target.value)}
        style={{ marginRight: '10px' }}
      />
      <input
        type="email"
        placeholder="Email"
        value={email}
        onChange={(e) => setEmail(e.target.value)}
        style={{ marginRight: '10px' }}
      />
      <button type="submit">Add</button>
    </form>
  );
};

export default UserForm;
