import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.Locatario;

public class AlugaApp {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aluga.app");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        // Salvando um Locatario (CREATE)
//        Locatario locatario1 = new Locatario();
//        // locatario1.setId(7985L); -> Sem ID
//        locatario1.setNome("Jose Roberto Gomes");
//
//        entityManager.getTransaction().begin();
//        entityManager.persist(locatario1);
//        entityManager.getTransaction().commit();


        // Salvando um Locatario (CREATE) mas usando Merge
//        Locatario locatarioCriarComMerge = new Locatario();
//        locatarioCriarComMerge.setNome("Matematico Pereira Portugues");
//
//        entityManager.getTransaction().begin();
//        entityManager.merge(locatarioCriarComMerge);
//        entityManager.getTransaction().commit();

            // Atualizando um Locatario (UPDATE)
//            Locatario locatarioAtualizar = new Locatario();
//            locatarioAtualizar.setNome("Jose Almeida");
//            locatarioAtualizar.setId(1L); // OBRIGATÓRIO PARA UPDATE
//
//            entityManager.getTransaction().begin();
//            entityManager.merge(locatarioAtualizar);
//            entityManager.getTransaction().commit();


          // Buscando um Locatario por id (READ)
//            Locatario l1 = entityManager.find(Locatario.class, 1);
//            System.out.println(l1.getId());
//            System.out.println(l1.getNome());

        // Deletando um objeto (DELETE)
        Locatario objetoExistente = entityManager.find(Locatario.class, 2);
        entityManager.getTransaction().begin();
        entityManager.remove(objetoExistente);
        entityManager.getTransaction().commit();


        entityManager.close();
        entityManagerFactory.close();

    }
}
