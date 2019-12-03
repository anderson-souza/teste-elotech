import React, { Component } from "react";
import api from "../../services/api";
import { Typography } from "@material-ui/core";
import Paper from "@material-ui/core/Paper";
import Divider from "@material-ui/core/Divider";
import Grid from "@material-ui/core/Grid";
import "./styles.css";

export default class Profissional extends Component<any, any> {
  constructor(props: any) {
    super(props);
    this.state = {
      profissional: []
    };
  }

  async componentDidMount() {
    let { id } = this.props.match.params;
    const response = await api.get(`/${id}`);
    this.setState({ profissional: response.data });
  }

  render() {
    document.title = "Detalhes do Profissional";

    const { profissional } = this.state;
    console.log(profissional);
    return (
      <div className='profissional-info'>
        <div>
          <Typography variant='h4'>Detalhes do profissional</Typography>
          <Divider />
          <br />
        </div>

        <div>
          <Typography variant='h6'>Dados Pessoais</Typography>
          <Paper className='div--dados'>
            <div className='div--dados--detalhe'>
              <Typography>
                <b>Nome</b>
              </Typography>
              <Typography>{profissional.nome}</Typography>
              <Divider />
            </div>
            <div className='div--dados--detalhe'>
              <Typography>
                <b>CPF</b>
              </Typography>
              <Typography>{profissional.cpf}</Typography>
              <Divider />
            </div>
            <div className='div--dados--detalhe'>
              <Typography>
                <b>Identidade</b>
              </Typography>
              <Typography>{profissional.identidade}</Typography>
              <Divider />
            </div>
            <div>
              <Typography>
                <b>Cartão Nacional de Saúde (CNS)</b>
              </Typography>
              <Typography>{profissional.cns}</Typography>              
            </div>
          </Paper>
        </div>

        <br />

        <div>
          <Grid container spacing={3}>
            <Grid item xs={6}>
              <Typography variant='h6'>Endereço</Typography>
              <Paper>
                <div className='div--dados'>
                  <Typography>
                    {profissional.logradouro}, {profissional.numero}
                  </Typography>
                  <Typography>
                    {profissional.complemento} - {profissional.bairro}
                  </Typography>
                  <Typography>CEP {profissional.cep}</Typography>
                </div>
              </Paper>
            </Grid>
            <Grid item xs={6}>
              <Typography variant='h6'>Contato</Typography>
              <Paper>
                <div className='div--dados'>
                  <div className='div--dados--detalhe'>
                    <Typography>
                      <b>Telefone</b>
                    </Typography>
                    <Typography>{profissional.telefone}</Typography>
                    <Divider />
                  </div>
                  <div>
                    <Typography>
                      <b>E-mail</b>
                    </Typography>
                    <Typography>{profissional.email}</Typography>
                  </div>
                </div>
              </Paper>
            </Grid>
          </Grid>
        </div>

        <br />

        <div>
          <Typography variant='h6'>Outras Informações</Typography>
          <Paper>
            <div className='div--dados'>
              <div className='div--dados--detalhe'>
                <Typography>
                  <b>Tipo</b>
                </Typography>
                <Typography>
                  {profissional.interno ? "Interno" : "Externo"}
                </Typography>
                <Divider />
              </div>
              <div>
                <Typography>
                  <b>Status</b>
                </Typography>
                <Typography>
                  {profissional.status ? "Ativo" : "Inativo"}
                </Typography>
              </div>
            </div>
          </Paper>
        </div>
      </div>
    );
  }
}
