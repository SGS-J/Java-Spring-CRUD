import React, { FC, useState } from 'react';
import { BrowserRouter, Link, Route, Routes } from 'react-router-dom';
import { Navbar, Nav, Container } from 'react-bootstrap';
import Home from './components/Home';
import LogIn from './components/LogIn';
import { AssetURL } from './asset';

const App: FC = () => {
  const [isOpen, setIsOpen] = useState(true);
  const toggle = () => setIsOpen(!isOpen);
  const logo: Logo = {
    url: AssetURL.MAIN_LOGO.toString(),
    width: 30,
    height: 30,
  };

  return (
    <BrowserRouter>
      <Navbar className="shadow" bg="light" expand="lg">
        <Container>
          <Navbar.Brand href="/">
            <img
              className="d-inline align-top"
              src={logo.url}
              width={logo.width}
              height={logo.height}
            />
            {'  '}Spring boot React App
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
        <Route
          path="/"
          element={<Home mainbg={AssetURL.MAIN_BG.toString()} />}
        />
        <Route
          path="login"
          element={<LogIn mainbg={AssetURL.MAIN_BG.toString()} />}
        />
      </Routes>

      <Container
        fluid
        className="d-flex justify-content-center bottom-100 py-5 shadow"
      >
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
