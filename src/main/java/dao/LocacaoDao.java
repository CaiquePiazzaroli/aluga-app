package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import model.Locacao;


public class LocacaoDao {

    private EntityManager entityManager;


    public LocacaoDao(EntityManager em) {
        this.entityManager = em;
    }


    public Locacao salvar (Locacao locacao) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(locacao);
        transaction.commit();
        return locacao;
    }

    public Locacao buscar(Long id) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Locacao locacao = entityManager.find(Locacao.class, id);
        transaction.commit();
        return locacao;
    }

}
