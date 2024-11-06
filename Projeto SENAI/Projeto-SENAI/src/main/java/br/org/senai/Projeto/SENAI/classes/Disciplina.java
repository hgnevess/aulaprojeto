package br.org.senai.Projeto.SENAI.classes;

import jakarta.persistence.*;

@Entity
@Table(name="disciplinas")
public class Disciplina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;
    @Column(name="Nome")
    private String nome;
    @Column(name="Carga Horária")
    private int CargaHoraria;
}
