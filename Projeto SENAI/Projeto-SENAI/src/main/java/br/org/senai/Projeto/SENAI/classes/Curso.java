package br.org.senai.Projeto.SENAI.classes;


import jakarta.persistence.*;

@Entity
@Table(name="cursos")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    @Column(name = "Titulo")
    private String titulo;
    @Column(name = "Duracao")
    private int duracao;
}
