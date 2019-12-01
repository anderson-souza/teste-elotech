import React, { Component } from 'react'
import api from "./../../services/api";
import { Typography } from '@material-ui/core';
import Paper from '@material-ui/core/Paper';

import "./styles.css";


export default class Profissional extends Component {

    state = {
        profissional: {},
    };

    async componentDidMount() {
        const { id } = this.props.match.params;

        const response = await api.get(`/${id}`);

        this.setState({ profissional: response.data });
        console.log(this.state)
    }

    render() {        
        const {profissional} = this.state;
        console.log(profissional)
        return (
            <Paper>
            <div className="profissional-info">
                <Typography variant="h4">{profissional.nome}</Typography>            
                <Typography><b>Sexo:</b> {profissional.sexo}</Typography>
                <Typography><b>Endereço:</b> {profissional.logradouro}, {profissional.numero}, {profissional.bairro}</Typography>
                <Typography><b>Tipo:</b> {profissional.interno ? "Interno" : "Externo"}</Typography>
                <Typography><b>Status:</b> {profissional.status ? "Ativo" : "Inativo"}</Typography>
                
            </div>
            </Paper>
        )
    }
}

