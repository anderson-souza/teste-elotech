import React from "react";
import { AppBar, Toolbar, Typography, Link } from "@material-ui/core";
import "./styles.css";

export default function Header() {
  return (
    <div className='header'>
      <AppBar position='static'>
        <Toolbar className='header--toolbar'>
          <Typography className='header--toolbar--typhograpy' variant='h6'>
            <Link underline='none' color='inherit' href='/'>
              Teste Elotech
            </Link>
          </Typography>
        </Toolbar>
      </AppBar>
    </div>
  );
}
