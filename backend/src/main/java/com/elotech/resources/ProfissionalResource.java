package com.elotech.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elotech.model.profissional.detalhe.ProfissionalDetalhe;
import com.elotech.model.profissional.page.ProfissionalPage;
import com.elotech.service.ProfissionalService;

@RestController
@RequestMapping("/profissionais")
public class ProfissionalResource {

	@Autowired
	private ProfissionalService profissionalService;

	/*
	 * @CrossOrigin
	 * 
	 * @GetMapping public List<Profissional> listar() { return
	 * profissionalService.listar(); }
	 */

	@CrossOrigin
	@GetMapping
	public ProfissionalPage listar() {
		return profissionalService.listarPage();
	}

	@CrossOrigin
	@GetMapping("/{id}")
	public ProfissionalDetalhe buscar(@PathVariable Long id) {
		return profissionalService.buscar(id);
	}

}
