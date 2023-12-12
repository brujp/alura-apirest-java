package com.brujp.medvoll.api.controller;

import com.brujp.medvoll.api.model.Endereco;
import com.brujp.medvoll.api.model.Medico;
import com.brujp.medvoll.api.records.DadosCadastroMedico;
import com.brujp.medvoll.api.repositories.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    //Pegando o corpo inteiro da requisição
    //Recebo um DTO e converto para Medico
    @PostMapping
    @Transactional //Preciso ter uma transação ativa com o banco de dados
    public void cadastrarMedicos(@RequestBody DadosCadastroMedico dados) {
        repository.save(new Medico(dados));
    }

}
