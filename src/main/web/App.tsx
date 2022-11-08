import React, { FC, useState } from "react";
import { BrowserRouter, Link, Route, Routes } from "react-router-dom";
import { Navbar, Nav, Container } from "react-bootstrap";
import Home from "./components/Home";
import LogIn from "./components/LogIn";
import SpringLogo from "./public/assets/download.png";

const App: FC = () => {
  const [isOpen, setIsOpen] = useState(true);
  const toggle = () => setIsOpen(!isOpen);
  const logo: Logo = {
    url: SpringLogo,
    width: 30,
    height: 30,
  };

  return (
    <BrowserRouter>
      <Navbar bg="light" expand="lg">
        <Container>
          <Navbar.Brand href="#home">
            <img
              className="d-inline align-top"
              src={logo.url}
              width={logo.width}
              height={logo.height}
            />
            {"  "}Spring boot React App
          </Navbar.Brand>
          <Navbar.Toggle aria-controls="basic-navbar-nav" />
          <Navbar.Collapse id="basic-navbar-nav">
            <Nav className="me-auto">
              <Link className="nav-link" to="/">
                Home
              </Link>
              <Link className="nav-link" to="login">
                Log In
              </Link>
            </Nav>
          </Navbar.Collapse>
        </Container>
      </Navbar>

      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="login" element={<LogIn />} />
      </Routes>

      <Container className="d-flex justify-content-center bottom-100">
        <img
          className="d-inline align-top"
          src={logo.url}
          width={logo.width}
          height={logo.height}
        />
      </Container>
    </BrowserRouter>
  );
};

export default App;