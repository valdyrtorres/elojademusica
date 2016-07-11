package br.com.elojademusica.dao.impl;

import br.com.elojademusica.dao.ProdutoDao;
import br.com.elojademusica.model.Produto;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by valdirborges on 11/07/2016.
 */
@Repository
@Transactional
public class ProdutoDaoImpl implements ProdutoDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void adicionarProduto(Produto produto) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(produto);
        session.flush();
    }

    public Produto getProdutoPorId(String id) {
        Session session = sessionFactory.getCurrentSession();
        Produto produto = (Produto) session.get(Produto.class, id);
        session.flush();

        return produto;
    }

    public List<Produto> getTodosProdutos() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("From Produto");
        List<Produto> produtos = query.list();
        session.flush();

        return produtos;

    }

    public void deleteProduto(String id) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(getProdutoPorId(id));

        session.flush();
    }
}
