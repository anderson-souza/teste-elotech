/* eslint-disable react/jsx-filename-extension */
import React from "react";

import { BrowserRouter, Switch, Route } from "react-router-dom";

import Main from "./pages/Main/Main";
import Profissional from "./pages/Profissional/Profissional";

const Routes = () => (
  <BrowserRouter>
    <Switch>
      <Route exact path="/" component={Main} />
      <Route path="/profissionais/:id" component={Profissional} />
    </Switch>
  </BrowserRouter>
);

export default Routes;
