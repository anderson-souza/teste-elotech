
package com.elotech.model.profissional.page;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "nome", "tipo", "status" })
public class Content {

	@JsonProperty("id")
	private Integer id;
	@JsonProperty("nome")
	private String nome;
	@JsonProperty("tipo")
	private String tipo;
	@JsonProperty("status")
	private Boolean status;

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

	@JsonProperty("tipo")
	public String getTipo() {
		return tipo;
	}

	@JsonProperty("tipo")
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@JsonProperty("status")
	public Boolean getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(Boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", id).append("nome", nome).append("tipo", tipo)
				.append("status", status).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(nome).append(tipo).append(id).append(status).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Content) == false) {
			return false;
		}
		Content rhs = ((Content) other);
		return new EqualsBuilder().append(nome, rhs.nome).append(tipo, rhs.tipo).append(id, rhs.id)
				.append(status, rhs.status).isEquals();
	}

}
