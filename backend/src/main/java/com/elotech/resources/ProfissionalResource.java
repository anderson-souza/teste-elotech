package com.elotech.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elotech.model.Profissional;
import com.elotech.service.ProfissionalService;

@RestController
@RequestMapping("/profissionais")
public class ProfissionalResource {

	@Autowired
	private ProfissionalService profissionalService;

	@CrossOrigin
	@GetMapping
	public List<Profissional> listar() {
		return profissionalService.listar();
	}

}
