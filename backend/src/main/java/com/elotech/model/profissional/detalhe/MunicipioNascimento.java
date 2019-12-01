
package com.elotech.model.profissional.detalhe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "nome", "abreviacao", "ibge", "uf" })
public class MunicipioNascimento {

	@JsonProperty("id")
	private Integer id;
	@JsonProperty("nome")
	private String nome;
	@JsonProperty("abreviacao")
	private String abreviacao;
	@JsonProperty("ibge")
	private String ibge;
	@JsonProperty("uf")
	private Uf uf;

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

	@JsonProperty("abreviacao")
	public String getAbreviacao() {
		return abreviacao;
	}

	@JsonProperty("abreviacao")
	public void setAbreviacao(String abreviacao) {
		this.abreviacao = abreviacao;
	}

	@JsonProperty("ibge")
	public String getIbge() {
		return ibge;
	}

	@JsonProperty("ibge")
	public void setIbge(String ibge) {
		this.ibge = ibge;
	}

	@JsonProperty("uf")
	public Uf getUf() {
		return uf;
	}

	@JsonProperty("uf")
	public void setUf(Uf uf) {
		this.uf = uf;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", id).append("nome", nome).append("abreviacao", abreviacao)
				.append("ibge", ibge).append("uf", uf).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(uf).append(nome).append(id).append(abreviacao).append(ibge).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof MunicipioNascimento) == false) {
			return false;
		}
		MunicipioNascimento rhs = ((MunicipioNascimento) other);
		return new EqualsBuilder().append(uf, rhs.uf).append(nome, rhs.nome).append(id, rhs.id)
				.append(abreviacao, rhs.abreviacao).append(ibge, rhs.ibge).isEquals();
	}

}
