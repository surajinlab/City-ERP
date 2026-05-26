import { Link } from "react-router-dom";

function Navbar() {
  return (
    <nav className="navbar">

      <div className="logo">
        City College of Management
      </div>

      <ul className="nav-links">
        <li>
          <Link to="/">Home</Link>
        </li>

        <li>
          <Link to="/students">Students</Link>
        </li>

        <li>
          <Link to="/attendance">Attendance</Link>
        </li>

        <li>
          <Link to="/fees">Fees</Link>
        </li>

        <li>
          <Link to="/results">Results</Link>
        </li>

        <li>
          <Link to="/login">Login</Link>
        </li>
      </ul>

    </nav>
  );
}

export default Navbar;