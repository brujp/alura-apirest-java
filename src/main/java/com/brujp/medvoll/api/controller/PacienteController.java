package com.brujp.medvoll.api.controller;

import com.brujp.medvoll.api.model.Paciente;
import com.brujp.medvoll.api.records.*;
import com.brujp.medvoll.api.repositories.PacienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping
    public Page<DadosListagemPaciente> listarPacientes(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao) {
        //Converter de uma lista Paciente para uma lista de DadosListagemPaciente
        return repository.findAllByAtivoTrue(paginacao).map(DadosListagemPaciente::new);
    }

    @PutMapping
    @Transactional
    public void atualizarPacientes(@RequestBody @Valid DadosAtualizacaoPaciente dados) {
        //Carregar o paciente do banco de dados e sobrescrever de acordo com os dados do DTO
        var paciente = repository.getReferenceById(dados.id());
        paciente.atualizarInformacoes(dados);
    }

    //Exclusão lógica - Eu não apago o registro do banco de dados
    @DeleteMapping("/{id}") //Parâmetro dinâmico
    @Transactional
    public void excluirPacientes(@PathVariable Long id) {
        var paciente = repository.getReferenceById(id);
        paciente.excluir();
    }

}
