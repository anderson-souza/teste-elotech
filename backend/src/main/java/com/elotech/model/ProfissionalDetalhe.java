
package com.elotech.model;

import java.util.List;
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
    "mae",
    "pai",
    "cns",
    "cpf",
    "senha",
    "identidade",
    "orgaoEmissor",
    "identidadeUf",
    "dataEmissao",
    "pisPasep",
    "conselho",
    "conselhoRegistro",
    "conselhoUf",
    "dataNascimento",
    "municipioNascimento",
    "sexo",
    "tipo",
    "escolaridade",
    "email",
    "telefone",
    "logradouro",
    "numero",
    "complemento",
    "bairro",
    "cep",
    "status",
    "foto",
    "profissionalCboEstabelecimentos",
    "profissionalEquipes",
    "microArea",
    "interno"
})
public class ProfissionalDetalhe {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("codigo")
    private Integer codigo;
    @JsonProperty("nome")
    private String nome;
    @JsonProperty("mae")
    private String mae;
    @JsonProperty("pai")
    private String pai;
    @JsonProperty("cns")
    private String cns;
    @JsonProperty("cpf")
    private String cpf;
    @JsonProperty("senha")
    private String senha;
    @JsonProperty("identidade")
    private String identidade;
    @JsonProperty("orgaoEmissor")
    private OrgaoEmissor orgaoEmissor;
    @JsonProperty("identidadeUf")
    private IdentidadeUf identidadeUf;
    @JsonProperty("dataEmissao")
    private String dataEmissao;
    @JsonProperty("pisPasep")
    private String pisPasep;
    @JsonProperty("conselho")
    private Conselho conselho;
    @JsonProperty("conselhoRegistro")
    private String conselhoRegistro;
    @JsonProperty("conselhoUf")
    private ConselhoUf conselhoUf;
    @JsonProperty("dataNascimento")
    private String dataNascimento;
    @JsonProperty("municipioNascimento")
    private MunicipioNascimento municipioNascimento;
    @JsonProperty("sexo")
    private String sexo;
    @JsonProperty("tipo")
    private Tipo tipo;
    @JsonProperty("escolaridade")
    private Escolaridade escolaridade;
    @JsonProperty("email")
    private String email;
    @JsonProperty("telefone")
    private String telefone;
    @JsonProperty("logradouro")
    private String logradouro;
    @JsonProperty("numero")
    private String numero;
    @JsonProperty("complemento")
    private String complemento;
    @JsonProperty("bairro")
    private String bairro;
    @JsonProperty("cep")
    private String cep;
    @JsonProperty("status")
    private Boolean status;
    @JsonProperty("foto")
    private String foto;
    @JsonProperty("profissionalCboEstabelecimentos")
    private List<Object> profissionalCboEstabelecimentos = null;
    @JsonProperty("profissionalEquipes")
    private List<ProfissionalEquipe> profissionalEquipes = null;
    @JsonProperty("microArea")
    private List<MicroArea> microArea = null;
    @JsonProperty("interno")
    private Boolean interno;

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

    @JsonProperty("mae")
    public String getMae() {
        return mae;
    }

    @JsonProperty("mae")
    public void setMae(String mae) {
        this.mae = mae;
    }

    @JsonProperty("pai")
    public String getPai() {
        return pai;
    }

    @JsonProperty("pai")
    public void setPai(String pai) {
        this.pai = pai;
    }

    @JsonProperty("cns")
    public String getCns() {
        return cns;
    }

    @JsonProperty("cns")
    public void setCns(String cns) {
        this.cns = cns;
    }

    @JsonProperty("cpf")
    public String getCpf() {
        return cpf;
    }

    @JsonProperty("cpf")
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @JsonProperty("senha")
    public String getSenha() {
        return senha;
    }

    @JsonProperty("senha")
    public void setSenha(String senha) {
        this.senha = senha;
    }

    @JsonProperty("identidade")
    public String getIdentidade() {
        return identidade;
    }

    @JsonProperty("identidade")
    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    @JsonProperty("orgaoEmissor")
    public OrgaoEmissor getOrgaoEmissor() {
        return orgaoEmissor;
    }

    @JsonProperty("orgaoEmissor")
    public void setOrgaoEmissor(OrgaoEmissor orgaoEmissor) {
        this.orgaoEmissor = orgaoEmissor;
    }

    @JsonProperty("identidadeUf")
    public IdentidadeUf getIdentidadeUf() {
        return identidadeUf;
    }

    @JsonProperty("identidadeUf")
    public void setIdentidadeUf(IdentidadeUf identidadeUf) {
        this.identidadeUf = identidadeUf;
    }

    @JsonProperty("dataEmissao")
    public String getDataEmissao() {
        return dataEmissao;
    }

    @JsonProperty("dataEmissao")
    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    @JsonProperty("pisPasep")
    public String getPisPasep() {
        return pisPasep;
    }

    @JsonProperty("pisPasep")
    public void setPisPasep(String pisPasep) {
        this.pisPasep = pisPasep;
    }

    @JsonProperty("conselho")
    public Conselho getConselho() {
        return conselho;
    }

    @JsonProperty("conselho")
    public void setConselho(Conselho conselho) {
        this.conselho = conselho;
    }

    @JsonProperty("conselhoRegistro")
    public String getConselhoRegistro() {
        return conselhoRegistro;
    }

    @JsonProperty("conselhoRegistro")
    public void setConselhoRegistro(String conselhoRegistro) {
        this.conselhoRegistro = conselhoRegistro;
    }

    @JsonProperty("conselhoUf")
    public ConselhoUf getConselhoUf() {
        return conselhoUf;
    }

    @JsonProperty("conselhoUf")
    public void setConselhoUf(ConselhoUf conselhoUf) {
        this.conselhoUf = conselhoUf;
    }

    @JsonProperty("dataNascimento")
    public String getDataNascimento() {
        return dataNascimento;
    }

    @JsonProperty("dataNascimento")
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @JsonProperty("municipioNascimento")
    public MunicipioNascimento getMunicipioNascimento() {
        return municipioNascimento;
    }

    @JsonProperty("municipioNascimento")
    public void setMunicipioNascimento(MunicipioNascimento municipioNascimento) {
        this.municipioNascimento = municipioNascimento;
    }

    @JsonProperty("sexo")
    public String getSexo() {
        return sexo;
    }

    @JsonProperty("sexo")
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @JsonProperty("tipo")
    public Tipo getTipo() {
        return tipo;
    }

    @JsonProperty("tipo")
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @JsonProperty("escolaridade")
    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    @JsonProperty("escolaridade")
    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("telefone")
    public String getTelefone() {
        return telefone;
    }

    @JsonProperty("telefone")
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @JsonProperty("logradouro")
    public String getLogradouro() {
        return logradouro;
    }

    @JsonProperty("logradouro")
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    @JsonProperty("numero")
    public String getNumero() {
        return numero;
    }

    @JsonProperty("numero")
    public void setNumero(String numero) {
        this.numero = numero;
    }

    @JsonProperty("complemento")
    public String getComplemento() {
        return complemento;
    }

    @JsonProperty("complemento")
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @JsonProperty("bairro")
    public String getBairro() {
        return bairro;
    }

    @JsonProperty("bairro")
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @JsonProperty("cep")
    public String getCep() {
        return cep;
    }

    @JsonProperty("cep")
    public void setCep(String cep) {
        this.cep = cep;
    }

    @JsonProperty("status")
    public Boolean getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Boolean status) {
        this.status = status;
    }

    @JsonProperty("foto")
    public String getFoto() {
        return foto;
    }

    @JsonProperty("foto")
    public void setFoto(String foto) {
        this.foto = foto;
    }

    @JsonProperty("profissionalCboEstabelecimentos")
    public List<Object> getProfissionalCboEstabelecimentos() {
        return profissionalCboEstabelecimentos;
    }

    @JsonProperty("profissionalCboEstabelecimentos")
    public void setProfissionalCboEstabelecimentos(List<Object> profissionalCboEstabelecimentos) {
        this.profissionalCboEstabelecimentos = profissionalCboEstabelecimentos;
    }

    @JsonProperty("profissionalEquipes")
    public List<ProfissionalEquipe> getProfissionalEquipes() {
        return profissionalEquipes;
    }

    @JsonProperty("profissionalEquipes")
    public void setProfissionalEquipes(List<ProfissionalEquipe> profissionalEquipes) {
        this.profissionalEquipes = profissionalEquipes;
    }

    @JsonProperty("microArea")
    public List<MicroArea> getMicroArea() {
        return microArea;
    }

    @JsonProperty("microArea")
    public void setMicroArea(List<MicroArea> microArea) {
        this.microArea = microArea;
    }

    @JsonProperty("interno")
    public Boolean getInterno() {
        return interno;
    }

    @JsonProperty("interno")
    public void setInterno(Boolean interno) {
        this.interno = interno;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("codigo", codigo).append("nome", nome).append("mae", mae).append("pai", pai).append("cns", cns).append("cpf", cpf).append("senha", senha).append("identidade", identidade).append("orgaoEmissor", orgaoEmissor).append("identidadeUf", identidadeUf).append("dataEmissao", dataEmissao).append("pisPasep", pisPasep).append("conselho", conselho).append("conselhoRegistro", conselhoRegistro).append("conselhoUf", conselhoUf).append("dataNascimento", dataNascimento).append("municipioNascimento", municipioNascimento).append("sexo", sexo).append("tipo", tipo).append("escolaridade", escolaridade).append("email", email).append("telefone", telefone).append("logradouro", logradouro).append("numero", numero).append("complemento", complemento).append("bairro", bairro).append("cep", cep).append("status", status).append("foto", foto).append("profissionalCboEstabelecimentos", profissionalCboEstabelecimentos).append("profissionalEquipes", profissionalEquipes).append("microArea", microArea).append("interno", interno).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(profissionalCboEstabelecimentos).append(tipo).append(telefone).append(numero).append(dataEmissao).append(conselhoRegistro).append(cep).append(mae).append(senha).append(complemento).append(orgaoEmissor).append(pisPasep).append(municipioNascimento).append(cpf).append(pai).append(id).append(escolaridade).append(dataNascimento).append(identidadeUf).append(email).append(codigo).append(bairro).append(interno).append(cns).append(nome).append(conselhoUf).append(identidade).append(profissionalEquipes).append(foto).append(logradouro).append(microArea).append(sexo).append(conselho).append(status).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProfissionalDetalhe) == false) {
            return false;
        }
        ProfissionalDetalhe rhs = ((ProfissionalDetalhe) other);
        return new EqualsBuilder().append(profissionalCboEstabelecimentos, rhs.profissionalCboEstabelecimentos).append(tipo, rhs.tipo).append(telefone, rhs.telefone).append(numero, rhs.numero).append(dataEmissao, rhs.dataEmissao).append(conselhoRegistro, rhs.conselhoRegistro).append(cep, rhs.cep).append(mae, rhs.mae).append(senha, rhs.senha).append(complemento, rhs.complemento).append(orgaoEmissor, rhs.orgaoEmissor).append(pisPasep, rhs.pisPasep).append(municipioNascimento, rhs.municipioNascimento).append(cpf, rhs.cpf).append(pai, rhs.pai).append(id, rhs.id).append(escolaridade, rhs.escolaridade).append(dataNascimento, rhs.dataNascimento).append(identidadeUf, rhs.identidadeUf).append(email, rhs.email).append(codigo, rhs.codigo).append(bairro, rhs.bairro).append(interno, rhs.interno).append(cns, rhs.cns).append(nome, rhs.nome).append(conselhoUf, rhs.conselhoUf).append(identidade, rhs.identidade).append(profissionalEquipes, rhs.profissionalEquipes).append(foto, rhs.foto).append(logradouro, rhs.logradouro).append(microArea, rhs.microArea).append(sexo, rhs.sexo).append(conselho, rhs.conselho).append(status, rhs.status).isEquals();
    }

}
