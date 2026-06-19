package model;

import jakarta.persistence.*;

@Entity
@Table(name = "Locatarios")
public class Locatario {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "nome_locatario")
    private String nome;
}
