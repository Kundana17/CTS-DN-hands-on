import "./App.css";
import office from "./images/office.avif";

function App() {
  const offices = [
    {
      id: 1,
      name: "DBS",
      rent: 50000,
      address: "Chennai"
    },
    {
      id: 2,
      name: "Infosys",
      rent: 75000,
      address: "Hyderabad"
    },
    {
      id: 3,
      name: "Cognizant",
      rent: 65000,
      address: "Bangalore"
    }
  ];

  return (
      <div className="container">
        <h1>Office Space, at Affordable Range</h1>

        <img src={office} alt="Office" className="office-img" />

        {offices.map((o) => (
            <div key={o.id} className="office-card">
              <h2>Name: {o.name}</h2>

              <h3
                  style={{
                    color: o.rent <= 60000 ? "red" : "green"
                  }}
              >
                Rent: Rs. {o.rent}
              </h3>

              <h3>Address: {o.address}</h3>
            </div>
        ))}
      </div>
  );
}

export default App;