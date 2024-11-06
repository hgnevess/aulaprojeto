package br.org.senai.Projeto.SENAI.classes;

import jakarta.persistence.*;

@Entity
@Table(name="alunos")

public class Estudante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Matricula")
    private int id;
    @Column(name="Nome")
    private String nome;
    @Column(name="Email")
    private String email;

}
