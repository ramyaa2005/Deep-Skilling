import React from "react";

function UserDisplay({ users }) {
  return (
    <div>
      <h2>Registered Users</h2>
      {users.length === 0 ? (
        <p>No users added yet.</p>
      ) : (
        <ul>
          {users.map((user, index) => (
            <li key={index}>{user.name}</li>
          ))}
        </ul>
      )}
    </div>
  );
}

export default UserDisplay;
