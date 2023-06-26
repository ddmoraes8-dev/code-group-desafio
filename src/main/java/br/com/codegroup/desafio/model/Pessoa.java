package br.com.codegroup.desafio.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
public class Pessoa {

    public Pessoa() {

    }

    public Pessoa(String nome, LocalDate dataNascimento, String cpf, Boolean funcionario) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.funcionario = funcionario;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String nome;

    private LocalDate dataNascimento;

    private String cpf;

    private Boolean funcionario;


}
