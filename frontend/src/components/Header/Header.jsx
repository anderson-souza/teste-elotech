import React from 'react'
import { AppBar, Toolbar, Typography } from '@material-ui/core'
import './style.css'

export default function Header() {
    return (
        <div className="header">
            <AppBar position="static">
                <Toolbar className="header--toolbar">
                    <Typography className="header--toolbar--typhograpy" variant="h6">Listagem de Profissionais</Typography>
                </Toolbar>
            </AppBar>
        </div>
    )
}
