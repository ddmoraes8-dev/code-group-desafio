package br.com.codegroup.desafio.service;

import br.com.codegroup.desafio.model.Pessoa;
import br.com.codegroup.desafio.model.dto.PessoaDTO;
import br.com.codegroup.desafio.repository.PessoaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@Service
public class PessoaService {

    private PessoaRepository pessoaRepository;

    public void listAllPeople(){
        ModelMapper mapper = new ModelMapper();
        List<Pessoa> pessoas = pessoaRepository.findAll();

        pessoas.stream().forEach(
                p -> {
                    PessoaDTO map = mapper.map(p, PessoaDTO.class);
                }
        );
    }
}
