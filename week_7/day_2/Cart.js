import React from 'react';

function Cart() {
  const restaurantList = [
    { name: 'The Spicy Grill', rent: 40000, address: 'Anna Nagar, Chennai' },
    { name: 'Chennai Dine', rent: 65000, address: 'T. Nagar, Chennai' },
    { name: 'Royal Curry', rent: 80000, address: 'Adyar, Chennai' },
  ];

  return (
    <div>
      <h2>Restaurant Spaces</h2>
      {restaurantList.map((restaurant, index) => (
        <div key={index} style={{
          margin: '10px',
          padding: '10px',
          border: '1px solid gray',
          borderRadius: '8px',
          backgroundColor: '#f9f9f9'
        }}>
          <p><strong>Name:</strong> {restaurant.name}</p>
          <p><strong>Rent:</strong> <span style={{ color: restaurant.rent > 60000 ? 'green' : 'red' }}>{restaurant.rent}</span></p>
          <p><strong>Address:</strong> {restaurant.address}</p>
        </div>
      ))}
    </div>
  );
}

export default Cart;
