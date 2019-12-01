
package com.elotech.model.profissional.detalhe;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "sigla", "nome" })
public class Conselho {

	@JsonProperty("id")
	private Integer id;
	@JsonProperty("sigla")
	private String sigla;
	@JsonProperty("nome")
	private String nome;

	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}

	@JsonProperty("sigla")
	public String getSigla() {
		return sigla;
	}

	@JsonProperty("sigla")
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	@JsonProperty("nome")
	public String getNome() {
		return nome;
	}

	@JsonProperty("nome")
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", id).append("sigla", sigla).append("nome", nome).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(nome).append(id).append(sigla).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Conselho) == false) {
			return false;
		}
		Conselho rhs = ((Conselho) other);
		return new EqualsBuilder().append(nome, rhs.nome).append(id, rhs.id).append(sigla, rhs.sigla).isEquals();
	}

}
