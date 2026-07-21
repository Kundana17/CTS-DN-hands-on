import ListofPlayers from "./Components/ListofPlayers";
import IndianPlayers from "./Components/IndianPlayers";

function App() {

  const flag = false;

  return (
      <div>

        {
          flag
              ? <ListofPlayers />
              : <IndianPlayers />
        }

      </div>
  );

}

export default App;