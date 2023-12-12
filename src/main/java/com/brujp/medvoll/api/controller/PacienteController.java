package com.brujp.medvoll.api.controller;

import com.brujp.medvoll.api.model.Paciente;
import com.brujp.medvoll.api.records.DadosCadastroPaciente;
import com.brujp.medvoll.api.repositories.PacienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    PacienteRepository repository;

    //Pegando o corpo inteiro da requisição
    //Recebo um DTO e converto para Paciente
    @PostMapping
    @Transactional //Preciso ter uma transação ativa com o banco de dados
    public void cadastrarPacientes(@RequestBody @Valid DadosCadastroPaciente dados) {
        repository.save(new Paciente(dados));
    }

}
