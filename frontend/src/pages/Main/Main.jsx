import React, { useState, useEffect } from "react";
import Table from "@material-ui/core/Table";
import TableBody from "@material-ui/core/TableBody";
import TableCell from "@material-ui/core/TableCell";
import TableHead from "@material-ui/core/TableHead";
import TableRow from "@material-ui/core/TableRow";
import Paper from "@material-ui/core/Paper";
import api from "../../services/api";

export default function Main() {
  const [profissionais, setProfissionais] = useState([]);

  useEffect(async () => {
    api
      .get()
      .then(response => {
        const { data } = response;
        setProfissionais(data);
      })
      .catch(error => {
        console.log(error);
      });
  }, []);

  return (
    <div>
      <Paper>
        <Table>
          <TableHead>
            <TableRow>
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
                <TableCell align="left">{row.status.toString()}</TableCell>
              </TableRow>
            ))}
          </TableBody>
        </Table>
      </Paper>
    </div>
  );
}
