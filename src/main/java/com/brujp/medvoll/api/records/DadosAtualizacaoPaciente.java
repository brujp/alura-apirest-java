package com.brujp.medvoll.api.records;

public record DadosAtualizacaoPaciente(
        Long id,
        String nome,
        String email,
        String telefone,
        DadosEndereco endereco
) {
}
