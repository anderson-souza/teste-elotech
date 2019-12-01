
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
    "nome",
    "sigla",
    "codigo"
})
public class Pais_ {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("nome")
    private String nome;
    @JsonProperty("sigla")
    private String sigla;
    @JsonProperty("codigo")
    private String codigo;

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

    @JsonProperty("codigo")
    public String getCodigo() {
        return codigo;
    }

    @JsonProperty("codigo")
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("nome", nome).append("sigla", sigla).append("codigo", codigo).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nome).append(codigo).append(id).append(sigla).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Pais_) == false) {
            return false;
        }
        Pais_ rhs = ((Pais_) other);
        return new EqualsBuilder().append(nome, rhs.nome).append(codigo, rhs.codigo).append(id, rhs.id).append(sigla, rhs.sigla).isEquals();
    }

}
