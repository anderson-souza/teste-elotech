package com.elotech.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.elotech.enums.TipoProfissional;

import lombok.Data;

@Entity
@Data
public class Profissional {

	@Id
	private Long id;

	private String nome;

	private TipoProfissional tipo;

	private boolean status;

}
