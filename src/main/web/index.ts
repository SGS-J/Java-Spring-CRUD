import React from "react";
import ReactDOM from "react-dom/client";
import "./scss/styles.scss";
import "bootstrap";
import App from "./App";

const root = ReactDOM.createRoot(document.getElementById("root") as Element);


root.render(React.createElement(App));
