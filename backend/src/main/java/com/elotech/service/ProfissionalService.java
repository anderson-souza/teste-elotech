package com.elotech.service;

import org.springframework.stereotype.Service;

import com.elotech.client.consumer.ProfissionalAPIConsumer;
import com.elotech.model.profissional.detalhe.ProfissionalDetalhe;
import com.elotech.model.profissional.page.ProfissionalPage;

@Service
public class ProfissionalService {

	public ProfissionalPage listarPage() {
		ProfissionalAPIConsumer consumer = new ProfissionalAPIConsumer();
		return consumer.listarRegistrosProfissional();
	}

	public ProfissionalDetalhe buscar(Long id) {
		ProfissionalAPIConsumer consumer = new ProfissionalAPIConsumer();
		return consumer.buscarRegistro(id);
	}

}
