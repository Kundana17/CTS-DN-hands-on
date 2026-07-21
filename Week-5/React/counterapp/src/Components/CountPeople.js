import React, { Component } from "react";

class CountPeople extends Component {

    constructor() {
        super();

        this.state = {
            entrycount: 0,
            exitcount: 0
        };
    }

    updateEntry = () => {
        this.setState({
            entrycount: this.state.entrycount + 1
        });
    };

    updateExit = () => {
        this.setState({
            exitcount: this.state.exitcount + 1
        });
    };

    render() {
        return (
            <div style={{ padding: "20px" }}>
                <h2>Mall Entry Counter</h2>

                <h3>People Entered : {this.state.entrycount}</h3>
                <button onClick={this.updateEntry}>Login</button>

                <br /><br />

                <h3>People Exited : {this.state.exitcount}</h3>
                <button onClick={this.updateExit}>Exit</button>
            </div>
        );
    }
}

export default CountPeople;