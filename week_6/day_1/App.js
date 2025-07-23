import React, { useState } from 'react';
import './App.css';

function App() {
  const [form, setForm] = useState({ name: '', email: '', feedback: '' });
  const [submitted, setSubmitted] = useState(false);

  const handleChange = (e) => {
    setForm({ ...form, [e.target.name]: e.target.value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    setSubmitted(true);
  };

  return (
    <div className="App">
      <h2>User Feedback Form</h2>

      {!submitted ? (
        <form onSubmit={handleSubmit}>
          <input
            name="name"
            placeholder="Enter your name"
            value={form.name}
            onChange={handleChange}
            required
          /><br />

          <input
            name="email"
            type="email"
            placeholder="Enter your email"
            value={form.email}
            onChange={handleChange}
            required
          /><br />

          <textarea
            name="feedback"
            placeholder="Enter your feedback"
            value={form.feedback}
            onChange={handleChange}
            required
          ></textarea><br />

          <button type="submit">Submit</button>
        </form>
      ) : (
        <div className="result">
          <h3>Thank you for your feedback!</h3>
          <p><strong>Name:</strong> {form.name}</p>
          <p><strong>Email:</strong> {form.email}</p>
          <p><strong>Feedback:</strong> {form.feedback}</p>
        </div>
      )}
    </div>
  );
}

export default App;
