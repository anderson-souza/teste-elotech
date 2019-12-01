
package com.elotech.model.profissional.detalhe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "equipe", "dataInicio", "dataFim", "status" })
public class ProfissionalEquipe {

	@JsonProperty("id")
	private Integer id;
	@JsonProperty("equipe")
	private Equipe equipe;
	@JsonProperty("dataInicio")
	private String dataInicio;
	@JsonProperty("dataFim")
	private String dataFim;
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

	@JsonProperty("equipe")
	public Equipe getEquipe() {
		return equipe;
	}

	@JsonProperty("equipe")
	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

	@JsonProperty("dataInicio")
	public String getDataInicio() {
		return dataInicio;
	}

	@JsonProperty("dataInicio")
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	@JsonProperty("dataFim")
	public String getDataFim() {
		return dataFim;
	}

	@JsonProperty("dataFim")
	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
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
		return new ToStringBuilder(this).append("id", id).append("equipe", equipe).append("dataInicio", dataInicio)
				.append("dataFim", dataFim).append("status", status).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(id).append(dataInicio).append(equipe).append(dataFim).append(status)
				.toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof ProfissionalEquipe) == false) {
			return false;
		}
		ProfissionalEquipe rhs = ((ProfissionalEquipe) other);
		return new EqualsBuilder().append(id, rhs.id).append(dataInicio, rhs.dataInicio).append(equipe, rhs.equipe)
				.append(dataFim, rhs.dataFim).append(status, rhs.status).isEquals();
	}

}
