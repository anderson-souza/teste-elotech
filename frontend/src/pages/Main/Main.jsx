import React, { useState, useEffect } from "react";
import Table from "@material-ui/core/Table";
import TableBody from "@material-ui/core/TableBody";
import TableCell from "@material-ui/core/TableCell";
import TableHead from "@material-ui/core/TableHead";
import TableRow from "@material-ui/core/TableRow";
import Paper from "@material-ui/core/Paper";
import { Button, Typography } from "@material-ui/core";
import api from "../../services/api";
import "./styles.css";

export default function Main() {
  const [profissionais, setProfissionais] = useState([]);

  async function loadProfissionais() {
    console.log("Profissionais Carregados");
    await api
      .get()
      .then(response => {
        const { data } = response;
        setProfissionais(data);
      })
      .catch(error => {
        console.log(error);
      });
  }

  useEffect(() => {
    loadProfissionais();
  }, []);

  return (
    <div className="main--root">
      <Typography variant="h4">Listagem de Profissionais</Typography>
      <Paper className="paper--root">
        <Table>
          <TableHead>
            <TableRow className="table--row">
              <TableCell align="left">Nome</TableCell>
              <TableCell align="left">Tipo</TableCell>
              <TableCell align="left">Status</TableCell>
            </TableRow>
          </TableHead>
          <TableBody>
            {profissionais.map(row => (
              <TableRow key={row.id}>
                <TableCell component="th">{row.nome}</TableCell>
                <TableCell align="left">{row.tipo}</TableCell>
                <TableCell align="left">
                  {row.status ? "Ativo" : "Inativo"}
                </TableCell>
              </TableRow>
            ))}
          </TableBody>
        </Table>
      </Paper>
      <Button
        onClick={() => loadProfissionais()}
        className="tabela--botao"
        variant="contained"
        color="primary"
      >
        Atualizar Dados
      </Button>
    </div>
  );
}
