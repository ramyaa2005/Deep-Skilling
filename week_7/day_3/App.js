import React, { Component } from 'react';
import CurrencyConverter from './CurrencyConverter';

class App extends Component {
  constructor() {
    super();
    this.state = {
      counter: 0,
    };
    this.handleWelcome = this.handleWelcome.bind(this);
    this.handleClick = this.handleClick.bind(this);
  }

  increment = () => {
    this.setState({ counter: this.state.counter + 1 });
    this.sayHello();
  };

  decrement = () => {
    this.setState({ counter: this.state.counter - 1 });
  };

  sayHello = () => {
    alert('Hello! Member1');
  };

  handleWelcome(message) {
    alert(message);
  }

  handleClick(e) {
    alert('I was clicked');
  }

  render() {
    return (
      <div style={{ padding: '20px' }}>
        <div>{this.state.counter}</div>
        <button onClick={this.increment}>Increment</button>
        <button onClick={this.decrement}>Decrement</button>
        <br /><br />
        <button onClick={() => this.handleWelcome('welcome')}>Say welcome</button>
        <br /><br />
        <button onClick={this.handleClick}>Click on me</button>
        <br /><br />
        <CurrencyConverter />
      </div>
    );
  }
}

export default App;
