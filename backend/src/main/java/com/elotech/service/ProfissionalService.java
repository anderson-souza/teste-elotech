package com.elotech.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.elotech.client.consumer.ProfissionalAPIConsumer;
import com.elotech.model.Profissional;
import com.elotech.model.ProfissionalDetalhe;

@Service
public class ProfissionalService {

	public List<Profissional> listar() {

		ProfissionalAPIConsumer consumer = new ProfissionalAPIConsumer();
		return consumer.listarRegistros();

	}

	public ProfissionalDetalhe buscar(Long id) {
		ProfissionalAPIConsumer consumer = new ProfissionalAPIConsumer();
		return consumer.buscarRegistro(id);
	}

}
