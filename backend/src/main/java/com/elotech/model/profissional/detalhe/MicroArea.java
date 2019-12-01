
package com.elotech.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "codigo",
    "nome",
    "status"
})
public class MicroArea {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("codigo")
    private Integer codigo;
    @JsonProperty("nome")
    private String nome;
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

    @JsonProperty("codigo")
    public Integer getCodigo() {
        return codigo;
    }

    @JsonProperty("codigo")
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    @JsonProperty("nome")
    public String getNome() {
        return nome;
    }

    @JsonProperty("nome")
    public void setNome(String nome) {
        this.nome = nome;
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
        return new ToStringBuilder(this).append("id", id).append("codigo", codigo).append("nome", nome).append("status", status).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(codigo).append(nome).append(id).append(status).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MicroArea) == false) {
            return false;
        }
        MicroArea rhs = ((MicroArea) other);
        return new EqualsBuilder().append(codigo, rhs.codigo).append(nome, rhs.nome).append(id, rhs.id).append(status, rhs.status).isEquals();
    }

}
