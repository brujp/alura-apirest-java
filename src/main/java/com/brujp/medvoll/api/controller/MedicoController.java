package com.brujp.medvoll.api.controller;

import com.brujp.medvoll.api.model.Medico;
import com.brujp.medvoll.api.records.DadosAtualizacaoMedico;
import com.brujp.medvoll.api.records.DadosCadastroMedico;
import com.brujp.medvoll.api.records.DadosDetalhamentoMedico;
import com.brujp.medvoll.api.records.DadosListagemMedico;
import com.brujp.medvoll.api.repositories.MedicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

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
    public ResponseEntity cadastrarMedicos(@RequestBody @Valid DadosCadastroMedico dados, UriComponentsBuilder uriBuilder) {
        var medico = new Medico(dados);
        repository.save(medico);

        var uri = uriBuilder.path("/medicos/{id}").buildAndExpand(medico.getId()).toUri();

        return ResponseEntity.created(uri).body(new DadosDetalhamentoMedico(medico));
    }

    @GetMapping
    public ResponseEntity<Page<DadosListagemMedico>> listarMedicos(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao) {
        //Converter de uma lista Medico para uma lista de DadosListagemMedico
        var page = repository.findAllByAtivoTrue(paginacao).map(DadosListagemMedico::new);
        return ResponseEntity.ok(page);
    }

    @PutMapping
    @Transactional
    public ResponseEntity atualizarMedicos(@RequestBody @Valid DadosAtualizacaoMedico dados) {
        //Carregar o médico do banco de dados e sobrescrever de acordo com os dados do DTO
        var medico = repository.getReferenceById(dados.id());
        medico.atualizarInformacoes(dados);

        return ResponseEntity.ok(new DadosDetalhamentoMedico(medico));
    }

    //Exclusão lógica - Eu não apago o registro do banco de dados
    @DeleteMapping("/{id}") //Parâmetro dinâmico
    @Transactional
    public ResponseEntity excluirMedicos(@PathVariable Long id) {
        var medico = repository.getReferenceById(id);

        medico.excluir();

        return ResponseEntity.noContent().build();
    }

    //Exclusão lógica - Eu não apago o registro do banco de dados
    @GetMapping("/{id}") //Parâmetro dinâmico
    public ResponseEntity detalharMedicos(@PathVariable Long id) {
        var medico = repository.getReferenceById(id);

        return ResponseEntity.ok(new DadosDetalhamentoMedico(medico));
    }

}
