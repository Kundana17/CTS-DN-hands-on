import "../Stylesheets/mystyle.css";

function CalculateScore(props) {

    const avg = props.total / props.goal;

    return (
        <div className="box">
            <h2>Student Details</h2>

            <p><b>Name :</b> {props.name}</p>
            <p><b>School :</b> {props.school}</p>
            <p><b>Total :</b> {props.total}</p>
            <p><b>Goal :</b> {props.goal}</p>
            <p><b>Average :</b> {avg.toFixed(2)}</p>
        </div>
    );
}

export default CalculateScore;