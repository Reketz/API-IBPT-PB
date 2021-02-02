package br.com.ibpt.apiibpt.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ibpt implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String uf;    
    private String codigo;
    private String ex;
    private String tipo;
    @Column(length = 500)
    private String descricao;
    private BigDecimal nacionalfederal;
    private BigDecimal importadosfederal;
    private BigDecimal estadual;
    private BigDecimal municipal;
    private String vigenciainicio;
    private String vigenciafim;
    private String chave;
    private String versao;
    private String fonte;
    private BigDecimal valor;
    private BigDecimal valorTributoEstadual;
    private BigDecimal valorTributoImportado;
    private BigDecimal valorTributoMunicipal;
    private BigDecimal valorTributoNacional;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEx() {
        return ex;
    }

    public void setEx(String ex) {
        this.ex = ex;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getNacionalfederal() {
        return nacionalfederal;
    }

    public void setNacionalfederal(BigDecimal nacionalfederal) {
        this.nacionalfederal = nacionalfederal;
    }

    public BigDecimal getImportadosfederal() {
        return importadosfederal;
    }

    public void setImportadosfederal(BigDecimal importadosfederal) {
        this.importadosfederal = importadosfederal;
    }

    public BigDecimal getEstadual() {
        return estadual;
    }

    public void setEstadual(BigDecimal estadual) {
        this.estadual = estadual;
    }

    public BigDecimal getMunicipal() {
        return municipal;
    }

    public void setMunicipal(BigDecimal municipal) {
        this.municipal = municipal;
    }

    public String getVigenciainicio() {
        return vigenciainicio;
    }

    public void setVigenciainicio(String vigenciainicio) {
        this.vigenciainicio = vigenciainicio;
    }

    public String getVigenciafim() {
        return vigenciafim;
    }

    public void setVigenciafim(String vigenciafim) {
        this.vigenciafim = vigenciafim;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getFonte() {
        return fonte;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getValorTributoEstadual() {
        return valorTributoEstadual;
    }

    public void setValorTributoEstadual(BigDecimal valorTributoEstadual) {
        this.valorTributoEstadual = valorTributoEstadual;
    }

    public BigDecimal getValorTributoImportado() {
        return valorTributoImportado;
    }

    public void setValorTributoImportado(BigDecimal valorTributoImportado) {
        this.valorTributoImportado = valorTributoImportado;
    }

    public BigDecimal getValorTributoMunicipal() {
        return valorTributoMunicipal;
    }

    public void setValorTributoMunicipal(BigDecimal valorTributoMunicipal) {
        this.valorTributoMunicipal = valorTributoMunicipal;
    }

    public BigDecimal getValorTributoNacional() {
        return valorTributoNacional;
    }

    public void setValorTributoNacional(BigDecimal valorTributoNacional) {
        this.valorTributoNacional = valorTributoNacional;
    }

    
    
    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return id.equals(o);
    }
}
