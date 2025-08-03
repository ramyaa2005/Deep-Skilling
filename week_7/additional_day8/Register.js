import React, { Component } from "react";
import "./Register.css"; // Optional: for styling

class Register extends Component {
  constructor(props) {
    super(props);
    this.state = {
      fullName: "",
      email: "",
      password: "",
      errors: {
        fullName: "",
        email: "",
        password: "",
      },
    };
  }

  handleChange = (event) => {
    const { name, value } = event.target;
    let errors = this.state.errors;

    switch (name) {
      case "fullName":
        errors.fullName =
          value.length < 5 ? "Full Name must be 5 characters long!" : "";
        break;

      case "email":
        const validEmailRegex = RegExp(
          /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@(([^<>()[\]\\.,;:\s@"]+\.)+[^<>()[\]\\.,;:\s@"]{2,})$/i
        );
        errors.email = validEmailRegex.test(value)
          ? ""
          : "Email is not valid!";
        break;

      case "password":
        errors.password =
          value.length < 8 ? "Password must be 8 characters long!" : "";
        break;

      default:
        break;
    }

    this.setState({ errors, [name]: value });
  };

  validateForm = (errors) => {
    return (
      errors.fullName === "" && errors.email === "" && errors.password === ""
    );
  };

  handleSubmit = (event) => {
    event.preventDefault();
    const { errors, fullName, email, password } = this.state;

    if (this.validateForm(errors)) {
      alert("Valid Form");
      console.log("Form Data:", { fullName, email, password });
    } else {
      if (errors.fullName !== "") alert(errors.fullName);
      if (errors.email !== "") alert(errors.email);
      if (errors.password !== "") alert(errors.password);
    }
  };

  render() {
    const { fullName, email, password } = this.state;

    return (
      <div style={{ textAlign: "center", marginTop: "40px" }}>
        <h2 style={{ color: "red" }}>Register Here!!!</h2>
        <form onSubmit={this.handleSubmit}>
          <div>
            <label>Name:</label>
            <input
              type="text"
              name="fullName"
              value={fullName}
              onChange={this.handleChange}
            />
          </div>
          <div>
            <label>Email:</label>
            <input
              type="text"
              name="email"
              value={email}
              onChange={this.handleChange}
            />
          </div>
          <div>
            <label>Password:</label>
            <input
              type="password"
              name="password"
              value={password}
              onChange={this.handleChange}
            />
          </div>
          <div>
            <button type="submit">Submit</button>
          </div>
        </form>
      </div>
    );
  }
}

export default Register;
