
package com.elotech.model.profissional.detalhe;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "ine", "nome", "area", "estabelecimento", "tipo", "dataAtivacao", "dataDesativacao",
		"status", "microAreas" })
public class Equipe {

	@JsonProperty("id")
	private Integer id;
	@JsonProperty("ine")
	private String ine;
	@JsonProperty("nome")
	private String nome;
	@JsonProperty("area")
	private Object area;
	@JsonProperty("estabelecimento")
	private Object estabelecimento;
	@JsonProperty("tipo")
	private Object tipo;
	@JsonProperty("dataAtivacao")
	private Object dataAtivacao;
	@JsonProperty("dataDesativacao")
	private Object dataDesativacao;
	@JsonProperty("status")
	private Boolean status;
	@JsonProperty("microAreas")
	private List<Object> microAreas = null;

	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}

	@JsonProperty("ine")
	public String getIne() {
		return ine;
	}

	@JsonProperty("ine")
	public void setIne(String ine) {
		this.ine = ine;
	}

	@JsonProperty("nome")
	public String getNome() {
		return nome;
	}

	@JsonProperty("nome")
	public void setNome(String nome) {
		this.nome = nome;
	}

	@JsonProperty("area")
	public Object getArea() {
		return area;
	}

	@JsonProperty("area")
	public void setArea(Object area) {
		this.area = area;
	}

	@JsonProperty("estabelecimento")
	public Object getEstabelecimento() {
		return estabelecimento;
	}

	@JsonProperty("estabelecimento")
	public void setEstabelecimento(Object estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	@JsonProperty("tipo")
	public Object getTipo() {
		return tipo;
	}

	@JsonProperty("tipo")
	public void setTipo(Object tipo) {
		this.tipo = tipo;
	}

	@JsonProperty("dataAtivacao")
	public Object getDataAtivacao() {
		return dataAtivacao;
	}

	@JsonProperty("dataAtivacao")
	public void setDataAtivacao(Object dataAtivacao) {
		this.dataAtivacao = dataAtivacao;
	}

	@JsonProperty("dataDesativacao")
	public Object getDataDesativacao() {
		return dataDesativacao;
	}

	@JsonProperty("dataDesativacao")
	public void setDataDesativacao(Object dataDesativacao) {
		this.dataDesativacao = dataDesativacao;
	}

	@JsonProperty("status")
	public Boolean getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(Boolean status) {
		this.status = status;
	}

	@JsonProperty("microAreas")
	public List<Object> getMicroAreas() {
		return microAreas;
	}

	@JsonProperty("microAreas")
	public void setMicroAreas(List<Object> microAreas) {
		this.microAreas = microAreas;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", id).append("ine", ine).append("nome", nome).append("area", area)
				.append("estabelecimento", estabelecimento).append("tipo", tipo).append("dataAtivacao", dataAtivacao)
				.append("dataDesativacao", dataDesativacao).append("status", status).append("microAreas", microAreas)
				.toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(area).append(dataAtivacao).append(ine).append(tipo).append(estabelecimento)
				.append(microAreas).append(nome).append(dataDesativacao).append(id).append(status).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Equipe) == false) {
			return false;
		}
		Equipe rhs = ((Equipe) other);
		return new EqualsBuilder().append(area, rhs.area).append(dataAtivacao, rhs.dataAtivacao).append(ine, rhs.ine)
				.append(tipo, rhs.tipo).append(estabelecimento, rhs.estabelecimento).append(microAreas, rhs.microAreas)
				.append(nome, rhs.nome).append(dataDesativacao, rhs.dataDesativacao).append(id, rhs.id)
				.append(status, rhs.status).isEquals();
	}

}
