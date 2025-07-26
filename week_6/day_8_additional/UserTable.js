import React from 'react';

function UserTable({ users }) {
  return (
    <table border="1" cellPadding="10">
      <thead>
        <tr>
          <th>Name</th><th>Email</th><th>Age</th>
        </tr>
      </thead>
      <tbody>
        {users.map((u, i) => (
          <tr key={i}>
            <td>{u.name}</td>
            <td>{u.email}</td>
            <td>{u.age}</td>
          </tr>
        ))}
      </tbody>
    </table>
  );
}

export default UserTable;
