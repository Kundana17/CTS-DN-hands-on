function IndianPlayers() {

    const players = [
        "Virat",
        "Rohit",
        "Gill",
        "Rahul",
        "Pant",
        "Hardik"
    ];

    const oddTeam = players.filter((_, index) => index % 2 === 0);
    const evenTeam = players.filter((_, index) => index % 2 !== 0);

    const t20Players = ["Sky", "Tilak"];
    const ranjiPlayers = ["Pujara", "Rahane"];

    const mergedPlayers = [...t20Players, ...ranjiPlayers];

    return (
        <div>

            <h2>Odd Team</h2>

            <ul>
                {
                    oddTeam.map((player, index) => (
                        <li key={index}>{player}</li>
                    ))
                }
            </ul>

            <h2>Even Team</h2>

            <ul>
                {
                    evenTeam.map((player, index) => (
                        <li key={index}>{player}</li>
                    ))
                }
            </ul>

            <h2>Merged Players</h2>

            <ul>
                {
                    mergedPlayers.map((player, index) => (
                        <li key={index}>{player}</li>
                    ))
                }
            </ul>

        </div>
    );
}

export default IndianPlayers;