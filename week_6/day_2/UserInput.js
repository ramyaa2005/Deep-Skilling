import React, { useState } from "react";

function UserInput({ onAddUser }) {
  const [username, setUsername] = useState("");

  const handleSubmit = (e) => {
    e.preventDefault();
    if (username.trim() === "") {
      alert("Please enter a name.");
      return;
    }
    onAddUser({ name: username.trim() });
    setUsername("");
  };

  return (
    <form onSubmit={handleSubmit}>
      <input
        type="text"
        value={username}
        placeholder="Enter name"
        onChange={(e) => setUsername(e.target.value)}
      />
      <button type="submit">Add User</button>
    </form>
  );
}

export default UserInput;
