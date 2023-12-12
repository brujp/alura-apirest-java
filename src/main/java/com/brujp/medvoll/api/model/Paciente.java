package com.brujp.medvoll.api.model;

import com.brujp.medvoll.api.records.DadosAtualizacaoPaciente;
import com.brujp.medvoll.api.records.DadosCadastroPaciente;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "pacientes")
@Entity(name = "Paciente")
@Getter
@NoArgsConstructor //JPA exige em todas as entidades
@AllArgsConstructor
@EqualsAndHashCode(of = "id") //Equals gerado em cima do id
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private String cpf;

    private String telefone;

    //Endereco faz parte da table Paciente
    @Embedded
    private Endereco endereco;

    //Criando construtor que trabalha com o DTO
    public Paciente(DadosCadastroPaciente dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.cpf = dados.cpf();
        this.telefone = dados.telefone();
        this.endereco = new Endereco(dados.endereco());
    }

    public void atualizarInformacoes(DadosAtualizacaoPaciente dados) {
        if(dados.nome() != null) {
            this.nome = dados.nome();
        }
        if(dados.email() != null) {
            this.email = dados.email();
        }
        if(dados.telefone() != null) {
            this.telefone = dados.telefone();
        }
        if(dados.endereco() != null) {
            this.endereco.atualizarInformacoes(dados.endereco());
        }
    }
}
