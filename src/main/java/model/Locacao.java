package model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "locacoes")
public class Locacao {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_locacao")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_locador", nullable = false)
    private Locador locador;

    @ManyToOne
    @JoinColumn(name = "id_locatario", nullable = false)
    private Locatario locatario;

    @ManyToOne
    @JoinColumn(name = "id_item", nullable = false)
    private Item item;

    @Column(name = "preco_locacao")
    private BigDecimal preco;

    private LocalDate data;

    public Locacao() {
    }

    public Locacao(Locador locador, Locatario locatario, Item item, BigDecimal preco, LocalDate data) {
        this.locador = locador;
        this.locatario = locatario;
        this.item = item;
        this.preco = preco;
        this.data = data;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLocador(Locador locador) {
        this.locador = locador;
    }

    public void setLocatario(Locatario locatario) {
        this.locatario = locatario;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public Locador getLocador() {
        return locador;
    }

    public Locatario getLocatario() {
        return locatario;
    }

    public Item getItem() {
        return item;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}
