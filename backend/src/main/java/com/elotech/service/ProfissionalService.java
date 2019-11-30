package com.elotech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elotech.model.Profissional;
import com.elotech.repository.ProfissionalRepository;

@Service
public class ProfissionalService {

	@Autowired
	private ProfissionalRepository profissionalRepository;

	public List<Profissional> listar() {
		return profissionalRepository.findAll();
	}

	public void salvar(Profissional profissional) {
		profissionalRepository.save(profissional);
	}

}
