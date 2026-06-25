package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.transaction.Transaction;
import model.Locador;

public class LocadorDao {

    private EntityManager entityManager;

    public LocadorDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Locador salvar(Locador locador)  {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(locador);
        transaction.commit();
        return locador;
    }


}
