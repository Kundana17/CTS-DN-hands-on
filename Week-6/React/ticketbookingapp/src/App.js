import { useState } from "react";
import "./App.css";

function GuestPage() {
  return (
      <div>
        <h2>Flight Details</h2>
        <table border="1" cellPadding="8">
          <thead>
          <tr>
            <th>Flight</th>
            <th>From</th>
            <th>To</th>
            <th>Fare</th>
          </tr>
          </thead>
          <tbody>
          <tr>
            <td>AI101</td>
            <td>Hyderabad</td>
            <td>Delhi</td>
            <td>₹4500</td>
          </tr>
          <tr>
            <td>6E205</td>
            <td>Chennai</td>
            <td>Bangalore</td>
            <td>₹2800</td>
          </tr>
          </tbody>
        </table>

        <p>Please login to book tickets.</p>
      </div>
  );
}

function UserPage() {
  return (
      <div>
        <h2>Welcome Back</h2>
        <p>You can now book your flight tickets.</p>

        <table border="1" cellPadding="8">
          <thead>
          <tr>
            <th>Flight</th>
            <th>From</th>
            <th>To</th>
            <th>Fare</th>
          </tr>
          </thead>
          <tbody>
          <tr>
            <td>AI101</td>
            <td>Hyderabad</td>
            <td>Delhi</td>
            <td>₹4500</td>
          </tr>
          <tr>
            <td>6E205</td>
            <td>Chennai</td>
            <td>Bangalore</td>
            <td>₹2800</td>
          </tr>
          </tbody>
        </table>

        <button>Book Ticket</button>
      </div>
  );
}

function App() {
  const [loggedIn, setLoggedIn] = useState(false);

  return (
      <div className="container">
        {loggedIn ? <UserPage /> : <GuestPage />}

        <br />

        {loggedIn ? (
            <button onClick={() => setLoggedIn(false)}>Logout</button>
        ) : (
            <button onClick={() => setLoggedIn(true)}>Login</button>
        )}
      </div>
  );
}

export default App;