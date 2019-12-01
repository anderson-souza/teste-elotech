
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
    "nome"
})
public class OrgaoEmissor {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("codigo")
    private String codigo;
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

    @JsonProperty("codigo")
    public String getCodigo() {
        return codigo;
    }

    @JsonProperty("codigo")
    public void setCodigo(String codigo) {
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

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("codigo", codigo).append("nome", nome).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(codigo).append(nome).append(id).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrgaoEmissor) == false) {
            return false;
        }
        OrgaoEmissor rhs = ((OrgaoEmissor) other);
        return new EqualsBuilder().append(codigo, rhs.codigo).append(nome, rhs.nome).append(id, rhs.id).isEquals();
    }

}
