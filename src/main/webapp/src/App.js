import React from "react";
import { Navbar, Container } from "react-bootstrap";

export default App = () => {
  return (
    <Navbar bg="light">
      <Container>
        <Navbar.Brand href="/login">Java Spring Simple Crud</Navbar.Brand>
        <Navbar.Toggle aria-controls="basic-navbar-nav" />
        <Navbar.Collapse id="basic-navbar-nav">
          <Nav className="me-auto">
            <Nav.Link href="/login">Home</Nav.Link>
            <Nav.Link href="#link">Register</Nav.Link>
          </Nav>
        </Navbar.Collapse>
      </Container>
    </Navbar>
  );
};
