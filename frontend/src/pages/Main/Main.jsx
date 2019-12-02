import React, { useState, useEffect } from "react";
import Table from "@material-ui/core/Table";
import TableBody from "@material-ui/core/TableBody";
import TableCell from "@material-ui/core/TableCell";
import TableHead from "@material-ui/core/TableHead";
import TableRow from "@material-ui/core/TableRow";
import Paper from "@material-ui/core/Paper";
import IconButton from "@material-ui/core/IconButton";
import DeleteIcon from "@material-ui/icons/Delete";
import VisibilityIcon from "@material-ui/icons/Visibility";
import EditIcon from "@material-ui/icons/Edit";
import Tooltip from "@material-ui/core/Tooltip";
import { Button, Typography } from "@material-ui/core";

import api from "../../services/api";

import "./styles.css";

export default function Main() {
  const [profissionais, setProfissionais] = useState([]);

  async function loadProfissionais() {
    await api
      .get()
      .then(response => {
        const { data } = response;
        setProfissionais(data.content);
      })
      .catch(error => {
        console.log(error);
      });
  }

  useEffect(() => {
    document.title = "Listagem de Profissionais";
    loadProfissionais();
  }, []);

  return (
    <div className="main--root">
      <Typography variant="h4">Listagem de profissionais</Typography>
      <Paper className="paper--root">
        <Table className="table-root">
          <TableHead className="table--head">
            <TableRow className="table--row">
              <TableCell align="left">Nome</TableCell>
              <TableCell align="left">Tipo</TableCell>
              <TableCell align="left">Status</TableCell>
              <TableCell size="small">Ações</TableCell>
            </TableRow>
          </TableHead>
          <TableBody className="table--body">
            {profissionais.map(row => (
              <TableRow className="table--row" key={row.id}>
                <TableCell align="left">{row.nome}</TableCell>
                <TableCell align="left">{row.tipo}</TableCell>
                <TableCell align="left">
                  {row.status ? "Ativo" : "Inativo"}
                </TableCell>
                <TableCell align="left">
                  <Tooltip title="Detalhes">
                    <IconButton href={`/profissionais/${row.id}`}>
                      <VisibilityIcon />
                    </IconButton>
                  </Tooltip>
                  <Tooltip title="Editar">
                    <IconButton>
                      <EditIcon />
                    </IconButton>
                  </Tooltip>
                  <Tooltip title="Deletar">
                    <IconButton>
                      <DeleteIcon />
                    </IconButton>
                  </Tooltip>
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
