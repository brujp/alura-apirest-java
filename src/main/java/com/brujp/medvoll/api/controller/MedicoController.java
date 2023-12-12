package com.brujp.medvoll.api.controller;

import com.brujp.medvoll.api.model.Medico;
import com.brujp.medvoll.api.records.DadosAtualizacaoMedico;
import com.brujp.medvoll.api.records.DadosCadastroMedico;
import com.brujp.medvoll.api.records.DadosListagemMedico;
import com.brujp.medvoll.api.repositories.MedicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
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
    public Page<DadosListagemMedico> listarMedicos(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao) {
        //Converter de uma lista Medico para uma lista de DadosListagemMedico
        return repository.findAll(paginacao).map(DadosListagemMedico::new);
    }

    @PutMapping
    @Transactional
    public void atualizarMedicos(@RequestBody @Valid DadosAtualizacaoMedico dados) {
        //Carregar o médico do banco de dados e sobrescrever de acordo com os dados do DTO
        var medico = repository.getReferenceById(dados.id());
        medico.atualizarInformacoes(dados);
    }


}
