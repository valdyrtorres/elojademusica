package br.com.elojademusica.dao;

import br.com.elojademusica.model.Produto;

import java.util.List;

/**
 * Created by valdirborges on 11/07/2016.
 */
public interface ProdutoDao {
    void adicionarProduto(Produto produto);

    Produto getProdutoPorId(String id);

    List<Produto> getTodosProdutos();

    void deleteProduto(String id);

    void editarProduto(Produto produto);
}
