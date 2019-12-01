import React, { Component } from 'react'
import api from "./../../services/api";
import { Typography } from '@material-ui/core';

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
            <div className="profissional-info">
                <Typography variant="h4">{profissional.nome}</Typography>
                
            </div>
        )
    }
}

