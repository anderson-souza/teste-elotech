/* eslint-disable react/jsx-filename-extension */
import React from "react";
import Container from "@material-ui/core/Container";
import Header from "./components/Header/Header";
import Main from "./pages/Main/Main";

function App() {
  return (
    <div className="App">
      <Header />

      <Container>
        <Main />
      </Container>
    </div>
  );
}

export default App;
