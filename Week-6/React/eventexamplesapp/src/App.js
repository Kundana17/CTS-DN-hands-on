import { useState } from "react";
import "./App.css";

function App() {
  const [count, setCount] = useState(0);
  const [amount, setAmount] = useState("");

  function increment() {
    setCount(count + 1);
    alert("Hello! Member!");
  }

  function decrement() {
    setCount(count - 1);
  }

  function welcome(msg) {
    alert(msg);
  }

  function clicked() {
    alert("I was clicked");
  }

  function convert(e) {
    e.preventDefault();

    const euro = (Number(amount) / 90).toFixed(2);

    alert("Converting to Euro Amount is " + euro);
  }

  return (
      <div className="container">
        <h2>{count}</h2>

        <button onClick={increment}>Increment</button>
        <br /><br />

        <button onClick={decrement}>Decrement</button>
        <br /><br />

        <button onClick={() => welcome("Welcome")}>
          Say Welcome
        </button>
        <br /><br />

        <button onClick={clicked}>
          Click on me
        </button>

        <h1>Currency Convertor!!!</h1>

        <form onSubmit={convert}>
          <label>Amount:</label>
          <input
              type="number"
              value={amount}
              onChange={(e) => setAmount(e.target.value)}
          />

          <br /><br />

          <label>Currency:</label>
          <input value="Euro" readOnly />

          <br /><br />

          <button type="submit">
            Submit
          </button>
        </form>
      </div>
  );
}

export default App;