package model;

import jakarta.persistence.*;

@Entity
@Table(name = "Locatarios")
public class Locatario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_locatario")
    private String nome;


    public Locatario() {}

    public Locatario(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
