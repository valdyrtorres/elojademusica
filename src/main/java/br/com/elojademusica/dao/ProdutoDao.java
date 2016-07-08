package br.com.elojademusica.dao;

import br.com.elojademusica.model.Produto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by valdirborges on 06/07/2016.
 */
public class ProdutoDao {

    private List<Produto> listaProdutos;

    public List<Produto> getListaProdutos() {

        Produto produto1 = new Produto();
        produto1.setId("P123");
        produto1.setNome("Guitarra1");
        produto1.setCategoria("Instrumento");
        produto1.setDescricao("Este é um instrumento Fender");
        produto1.setPreco(1200);
        produto1.setCondicao("novo");
        produto1.setStatus("Active");
        produto1.setUnidadeEmEstoque(11);
        produto1.setManufaturador("Fender");

        Produto produto2 = new Produto();
        produto2.setId("P124");
        produto2.setNome("Gravador1");
        produto2.setCategoria("Gravador");
        produto2.setDescricao("Este é um incrível mix do século 20");
        produto2.setPreco(25);
        produto2.setCondicao("novo");
        produto2.setStatus("Active");
        produto2.setUnidadeEmEstoque(51);
        produto2.setManufaturador("EMI");

        Produto produto3 = new Produto();
        produto3.setId("P125");
        produto3.setNome("Alto-Falante");
        produto3.setCategoria("Acessório");
        produto3.setDescricao("Alto-Falante de prateleira Polk");
        produto3.setPreco(355);
        produto3.setCondicao("novo");
        produto3.setStatus("Active");
        produto3.setUnidadeEmEstoque(9);
        produto3.setManufaturador("Polk");

        listaProdutos = new ArrayList<Produto>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        return listaProdutos;
    }

    public Produto getProdutoPorId(String idProduto) throws IOException {
        for(Produto produto: getListaProdutos()) {
            if(produto.getId().equals(idProduto)) {
                return produto;
            }
        }

        throw new IOException("Produto não encontrado.");
    }
}
