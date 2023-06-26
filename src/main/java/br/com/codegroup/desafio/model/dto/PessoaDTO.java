package br.com.codegroup.desafio.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@AllArgsConstructor
@Data
public class PessoaDTO {

    private long id;
    private String nome;
    private LocalDate dataNascimento;
    private String cpf;
    private Boolean funcionario;
}
