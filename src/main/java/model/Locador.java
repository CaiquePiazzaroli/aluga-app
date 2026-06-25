package model;

import jakarta.persistence.*;

@Entity
@Table(name = "locadores")
public class Locador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_locador")
    private Long id;

    @Column(name = "nome_locador")
    private String nome;

    public Locador() {
    }

    public Locador(String nome) {
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
