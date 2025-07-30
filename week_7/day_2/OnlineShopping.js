import React from "react";
import Cart from "./Cart";
import officeImg from "./imggg1.webp"; // Ensure this is placed inside src/

class OnlineShopping extends React.Component {
  render() {
    return (
      <div style={{ textAlign: "center" }}>
        <h1><b>Restaurant, at affordable price</b></h1>
        <img
          src={officeImg}
          alt="Office space"
          style={{ width: "400px", height: "auto" }}
        />
        <Cart /> {/* Only one render of restaurant list */}
      </div>
    );
  }
}

export default OnlineShopping;
