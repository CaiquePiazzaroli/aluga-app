import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class AlugaApp {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aluga.app");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        try {
            System.out.println("--- Inicializando o Hibernate e criando tabelas... ---");
        } finally {
            entityManager.close();
            entityManagerFactory.close();
            System.out.println("--- Recursos fechados com sucesso! ---");
        }
    }
}
