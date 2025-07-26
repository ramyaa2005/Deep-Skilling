import React, { useState } from 'react';
import UserForm from './components/UserForm';
import UserTable from './components/UserTable';

function App() {
  const [users, setUsers] = useState([]);

  const addUser = (user) => {
    setUsers([...users, user]);
  };

  const checkDuplicateUser = (user) => {
    return users.some(
      (u) => u.name.toLowerCase() === user.name.toLowerCase() ||
             u.email.toLowerCase() === user.email.toLowerCase()
    );
  };

  return (
    <div style={{ padding: '20px' }}>
      <h2>👤 User Registration</h2>
      <UserForm onSubmit={addUser} checkDuplicate={checkDuplicateUser} />
      <UserTable users={users} />
    </div>
  );
}

export default App;
