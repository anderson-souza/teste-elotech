
package com.elotech.model.profissional.detalhe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "nome", "sigla", "dne", "pais" })
public class IdentidadeUf {

	@JsonProperty("id")
	private Integer id;
	@JsonProperty("nome")
	private String nome;
	@JsonProperty("sigla")
	private String sigla;
	@JsonProperty("dne")
	private String dne;
	@JsonProperty("pais")
	private Pais pais;

	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}

	@JsonProperty("nome")
	public String getNome() {
		return nome;
	}

	@JsonProperty("nome")
	public void setNome(String nome) {
		this.nome = nome;
	}

	@JsonProperty("sigla")
	public String getSigla() {
		return sigla;
	}

	@JsonProperty("sigla")
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	@JsonProperty("dne")
	public String getDne() {
		return dne;
	}

	@JsonProperty("dne")
	public void setDne(String dne) {
		this.dne = dne;
	}

	@JsonProperty("pais")
	public Pais getPais() {
		return pais;
	}

	@JsonProperty("pais")
	public void setPais(Pais pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", id).append("nome", nome).append("sigla", sigla).append("dne", dne)
				.append("pais", pais).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(nome).append(dne).append(id).append(sigla).append(pais).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof IdentidadeUf) == false) {
			return false;
		}
		IdentidadeUf rhs = ((IdentidadeUf) other);
		return new EqualsBuilder().append(nome, rhs.nome).append(dne, rhs.dne).append(id, rhs.id)
				.append(sigla, rhs.sigla).append(pais, rhs.pais).isEquals();
	}

}
