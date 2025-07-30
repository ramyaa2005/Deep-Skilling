import React, { Component } from 'react';

class CurrencyConverter extends Component {
  constructor() {
    super();
    this.state = {
      amount: '',
      currency: '',
    };
  }

  handleChange = (e) => {
    this.setState({
      [e.target.name]: e.target.value,
    });
  };

  handleSubmit = (e) => {
    e.preventDefault();
    const { amount, currency } = this.state;
    let convertedAmount = 0;

    if (currency.toLowerCase() === 'euro') {
      convertedAmount = amount * 80; // Assuming 1 Euro = 80 INR
    }

    alert(`Converting to ${currency} Amount is ${convertedAmount}`);
  };

  render() {
    return (
      <div>
        <h1 style={{ color: 'green' }}>Currency Convertor!!!</h1>
        <form onSubmit={this.handleSubmit}>
          <label>Amount:</label>
          <input
            type="text"
            name="amount"
            value={this.state.amount}
            onChange={this.handleChange}
          />
          <br /><br />
          <label>Currency:</label>
          <textarea
            name="currency"
            value={this.state.currency}
            onChange={this.handleChange}
          />
          <br /><br />
          <button type="submit">Submit</button>
        </form>
      </div>
    );
  }
}

export default CurrencyConverter;
