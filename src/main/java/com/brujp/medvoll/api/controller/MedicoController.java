package com.brujp.medvoll.api.controller;

import com.brujp.medvoll.api.model.Medico;
import com.brujp.medvoll.api.records.DadosCadastroMedico;
import com.brujp.medvoll.api.records.DadosListagemMedico;
import com.brujp.medvoll.api.repositories.MedicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    //Pegando o corpo inteiro da requisição
    //Recebo um DTO e converto para Medico
    @PostMapping
    @Transactional //Preciso ter uma transação ativa com o banco de dados
    public void cadastrarMedicos(@RequestBody @Valid DadosCadastroMedico dados) {
        repository.save(new Medico(dados));
    }

    @GetMapping
    public List<DadosListagemMedico> listarMedicos() {
        //Converter de uma lista Medico para uma lista de DadosListagemMedico
        return repository.findAll().stream().map(DadosListagemMedico::new).toList();
    }

}
