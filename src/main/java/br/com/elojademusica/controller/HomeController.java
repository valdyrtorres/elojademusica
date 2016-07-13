package br.com.elojademusica.controller;

import br.com.elojademusica.dao.ProdutoDao;
import br.com.elojademusica.model.Produto;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by valdirborges on 22/06/2016.
 */
@Controller
public class HomeController {

    private Path caminho;

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

    /*
    @RequestMapping(value = "/admin/inventarioProdutos/adicionarProduto", method = RequestMethod.POST)
    public String adicionarProdutoPost(@ModelAttribute("produto") Produto produto) {
        produtoDao.adicionarProduto(produto);

        return "redirect:/admin/inventarioProdutos";
    }
    */

    @RequestMapping(value = "/admin/inventarioProdutos/adicionarProduto", method = RequestMethod.POST)
    public String adicionarProdutoPost(@ModelAttribute("produto") Produto produto, HttpServletRequest request) {
        produtoDao.adicionarProduto(produto);

        MultipartFile imagemProduto = produto.getImagemProduto();

        String diretorioRaiz = request.getSession().getServletContext().getRealPath("/");
        caminho = Paths.get(diretorioRaiz + "\\WEB-INF\\resources\\imagens\\"+produto.getIdProduto()+".png");

        if(imagemProduto != null && !imagemProduto.isEmpty()) {
            try {
                imagemProduto.transferTo(new File(caminho.toString()));
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("Falha ao salvar a imagem do produto", e);
            }
        }

        return "redirect:/admin/inventarioProdutos";
    }

    @RequestMapping("/admin/inventarioProdutos/deleteProduto/{id}")
    public String deleteProduto(@PathVariable String id, Model model, HttpServletRequest request) {
        String diretorioRaiz = request.getSession().getServletContext().getRealPath("/");
        caminho = Paths.get(diretorioRaiz + "\\WEB-INF\\resources\\imagens\\"+id+".png");

        if (Files.exists(caminho)) {
            try {
                Files.delete(caminho);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        produtoDao.deleteProduto(id);

        return "redirect:/admin/inventarioProdutos";
    }

}
