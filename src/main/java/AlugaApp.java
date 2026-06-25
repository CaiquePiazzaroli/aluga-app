import dao.ItemDao;
import dao.LocacaoDao;
import dao.LocadorDao;
import dao.LocatarioDao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.Item;
import model.Locacao;
import model.Locador;
import model.Locatario;

import java.math.BigDecimal;
import java.time.LocalDate;

public class AlugaApp {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aluga.app");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Salvando um locador no banco de dados
        //LocadorDao locadorDao = new LocadorDao(entityManager);
        //Locador locador = new Locador("Caique Mendes");
        //locadorDao.salvar(locador);

        // Salvando um locatario
        //LocatarioDao locatarioDao = new LocatarioDao(entityManager);
        //Locatario locatario = new Locatario("Joao Pereira");
        //locatarioDao.salvar(locatario);

        // Salvando um item
        //ItemDao itemDao = new ItemDao(entityManager);
        //Item item = new Item("Chave de Roda");
        //itemDao.salvar(item);

        // Salvando a locacao
        LocacaoDao locacaoDao = new LocacaoDao(entityManager);
//        Locador locador = entityManager.find(Locador.class, 1);
//        Item item = entityManager.find(Item.class, 1);
//        Locatario locatario = entityManager.find(Locatario.class, 1);
//        Locacao novaLocacao = new Locacao(locador, locatario, item, new BigDecimal("40.00"), LocalDate.now());
//        locacaoDao.salvar(novaLocacao);

        // Buscando uma locacao
        Locacao locacaoBanco = locacaoDao.buscar(1L);

        // Exibindo dados da locacao
        System.out.println("O locador foi: " + locacaoBanco.getLocador().getNome());
        System.out.println("O locatario foi: " + locacaoBanco.getLocatario().getNome());
        System.out.println("Na data: " + locacaoBanco.getData().toString());
        System.out.println("Item: " + locacaoBanco.getItem().getDescricao());
        System.out.println("Valor: " + locacaoBanco.getPreco());


        entityManager.close();
        entityManagerFactory.close();

    }
}
