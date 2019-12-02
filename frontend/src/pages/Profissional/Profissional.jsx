import React, { Component } from 'react'
import api from "../../services/api";
import { Typography } from '@material-ui/core';
import Paper from '@material-ui/core/Paper';
import Divider from '@material-ui/core/Divider';
import TextField from '@material-ui/core/TextField';

import "./styles.css";


export default class Profissional extends Component {

    state = {
        profissional: {},
    };

    async componentDidMount() {
        document.title = "Detalhes do Profissional"

        const { id } = this.props.match.params;

        const response = await api.get(`/${id}`);

        this.setState({ profissional: response.data });
        console.log(this.state)
    }

    render() {
        const { profissional } = this.state;
        console.log(profissional)
        return (
            <div className="profissional-info">

                <div>
                    <Typography variant="h4">Detalhes do profissional</Typography>
                    <Divider /><br />
                </div>

                <div>
                    <Typography variant="h6">Dados Pessoais</Typography>
                    <Paper className="div--dados">
                        <div className="div--dados--detalhe">
                            <Typography ><b>Nome</b></Typography>
                            <Typography >{profissional.nome}</Typography>
                            <Divider />
                        </div>

                        <div className="div--dados--detalhe">
                            <Typography ><b>Documento</b></Typography>
                            <Typography >{profissional.identidade}</Typography>
                            <Divider />
                        </div>

                        <div className="div--dados--detalhe">
                            <Typography ><b>Telefone</b></Typography>
                            <Typography >{profissional.telefone}</Typography>
                            <Divider />
                        </div>

                        <div>
                            <Typography ><b>E-mail</b></Typography>
                            <Typography >{profissional.email}</Typography>
                        </div>
                    </Paper>
                </div>

                <br />

                <div>
                    <Typography variant="h6">Endereço</Typography>
                    <Paper>
                        <div className="div--dados">
                            <Typography>{profissional.logradouro}, {profissional.numero}</Typography>
                            <Typography>{profissional.complemento} -  {profissional.bairro}</Typography>
                            <Typography>CEP {profissional.cep}</Typography>
                        </div>
                    </Paper>
                </div>
                <br />
                <div>
                    <Typography variant="h6">Outras Informações</Typography>
                    <Paper>
                        <div className="div--dados">
                            <div className="div--dados--detalhe">
                                <Typography ><b>Tipo</b></Typography>
                                <Typography>{profissional.interno ? "Interno" : "Externo"}</Typography>
                                <Divider />
                            </div>
                            <div>
                                <Typography ><b>Status</b></Typography>
                                <Typography>{profissional.status ? "Ativo" : "Inativo"}</Typography>
                            </div>
                        </div>
                    </Paper>
                </div>
            </div>
        )
    }
}

