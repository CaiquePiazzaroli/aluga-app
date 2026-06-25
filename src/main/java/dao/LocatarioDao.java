package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import model.Locador;
import model.Locatario;

public class LocatarioDao {

    private EntityManager entityManager;

    public LocatarioDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Locatario salvar(Locatario locatario)  {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(locatario);
        transaction.commit();
        return locatario;
    }
}
