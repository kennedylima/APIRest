package com.apirest.Produto;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

@Repository
@Transactional
public class ProdutoDAO implements ProdutoRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void salvar(Produto produto) {
        entityManager.persist(produto);
    }

    @Override
    public Produto editar(Produto produto) {
        return entityManager.merge(produto);
    }

    @Override
    public Collection<Produto> buscarTodos() {
        return entityManager.createQuery("from Produto p").getResultList();
    }

    @Override
    public Produto buscarPor(int id) {
        return entityManager.find(Produto.class, id);
    }

    @Override
    public void remover(int id) {
        entityManager.remove(entityManager.getReference(Produto.class, id));
    }
}
