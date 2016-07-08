package br.com.elojademusica.model;

/**
 * Created by valdirborges on 06/07/2016.
 */
public class Produto {

    private String id;
    private String nome;
    private String categoria;
    private String descricao;
    private double preco;
    private String condicao;
    private String status;
    private int unidadeEmEstoque;
    private String manufaturador;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getUnidadeEmEstoque() {
        return unidadeEmEstoque;
    }

    public void setUnidadeEmEstoque(int unidadeEmEstoque) {
        this.unidadeEmEstoque = unidadeEmEstoque;
    }

    public String getManufaturador() {
        return manufaturador;
    }

    public void setManufaturador(String manufaturador) {
        this.manufaturador = manufaturador;
    }
}
