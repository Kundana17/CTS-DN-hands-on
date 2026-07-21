function ListofPlayers() {

    const players = [
        { name: "Virat", score: 90 },
        { name: "Rohit", score: 82 },
        { name: "Gill", score: 55 },
        { name: "Rahul", score: 73 },
        { name: "Pant", score: 61 },
        { name: "Hardik", score: 88 },
        { name: "Jadeja", score: 49 },
        { name: "Ashwin", score: 77 },
        { name: "Bumrah", score: 25 },
        { name: "Shami", score: 68 },
        { name: "Siraj", score: 80 }
    ];

    const lowScore = players.filter(player => player.score < 70);

    return (
        <div>
            <h2>Players List</h2>

            <ul>
                {
                    players.map((player, index) => (
                        <li key={index}>
                            {player.name} - {player.score}
                        </li>
                    ))
                }
            </ul>

            <h2>Players Below 70</h2>

            <ul>
                {
                    lowScore.map((player, index) => (
                        <li key={index}>
                            {player.name} - {player.score}
                        </li>
                    ))
                }
            </ul>
        </div>
    );
}

export default ListofPlayers;