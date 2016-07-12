package br.com.elojademusica.controller;

import br.com.elojademusica.dao.ProdutoDao;
import br.com.elojademusica.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

/**
 * Created by valdirborges on 22/06/2016.
 */
@Controller
public class HomeController {

    @Autowired
    private ProdutoDao produtoDao;

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping("/listaProdutos")
    public String getProdutos(Model model) {
        List<Produto> produtos = produtoDao.getTodosProdutos();
        model.addAttribute("produtos", produtos);

        return "listaProdutos";
    }

    @RequestMapping("/listaProdutos/visaoProduto/{idProduto}")
    public String visaoProduto(@PathVariable String idProduto, Model model) throws IOException {
        Produto produto = produtoDao.getProdutoPorId(idProduto);
        model.addAttribute(produto);

        return "visaoProduto";
    }

    @RequestMapping("/admin")
    public String paginaAdmin() {
        return "admin";
    }

    @RequestMapping("/admin/inventarioProdutos")
    public String inventarioProduto(Model model) {
        List<Produto> produtos = produtoDao.getTodosProdutos();
        model.addAttribute("produtos", produtos);

        return "inventarioProdutos";
    }

    @RequestMapping("/admin/inventarioProdutos/adicionarProduto")
    public String adicionarProduto(Model model) {
        Produto produto = new Produto();
        produto.setCategoria("instrumento");
        produto.setCondicao("novo");
        produto.setStatus("ativo");

        model.addAttribute("produto", produto);

        return "adicionarProduto";
    }
}
