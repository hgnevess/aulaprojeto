package br.org.senai.Projeto.SENAI.classes;

import jakarta.persistence.*;

@Entity
@Table(name="profssores")
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    @Column(name = "Nome")
    private int nome;
    @Column(name = "Departamento")
    private int departamento;
}
