package com.brujp.medvoll.api.controller;

import com.brujp.medvoll.api.records.DadosCadastroMedico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    //Pegando o corpo inteiro da requisição
    @PostMapping
    public void cadastrarMedicos(@RequestBody DadosCadastroMedico dados) {
        System.out.println(dados);
    }

}
