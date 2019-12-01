/* eslint-disable react/jsx-filename-extension */
import React from "react";
import Container from "@material-ui/core/Container";
import Header from "./components/Header/Header";
import Main from "./pages/Main/Main";
import Footer from "./components/Footer/Footer";
import './AppStyles.css';

function App() {
  return (
    <div className="App">
      <Header />

      <Container maxWidth="xl">
        <Main />
      </Container>
      <Footer />
    </div>
  );
}

export default App;
