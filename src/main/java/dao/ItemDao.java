package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import model.Item;

public class ItemDao {

    private EntityManager entityManager;

    public ItemDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Item salvar(Item item)  {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(item);
        transaction.commit();
        return item;
    }


}
