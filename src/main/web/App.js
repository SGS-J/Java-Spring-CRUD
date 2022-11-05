import React, { useState } from "react";
import {
  Navbar,
  NavbarBrand,
  NavbarToggler,
  Collapse,
  NavItem,
  Nav,
} from "reactstrap";
import { BrowserRouter, Link, Route, Routes } from "react-router-dom";
import Home from "./components/Home";
import LogIn from "./components/LogIn";

const App = (args) => {
  const [isOpen, setIsOpen] = useState(true);
  const toggle = () => setIsOpen(!isOpen);
  const MainNav = (
    <Nav className="me-auto" navbar>
      <NavItem>
        <Link to="/">Home</Link>
      </NavItem>
      <NavItem>
        <Link to="login">Log In</Link>
      </NavItem>
    </Nav>
  );

  return (
    <BrowserRouter>
      <Navbar {...args}>
        <NavbarBrand href="/">Spring Example App</NavbarBrand>
        <MainNav />
        <NavbarToggler onClick={toggle} className="md" />
        <Collapse isOpen={isOpen} navbar className="md">
          <MainNav />
        </Collapse>
      </Navbar>

      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="login" element={<LogIn />} />
      </Routes>
    </BrowserRouter>
  );
};

export default App;
