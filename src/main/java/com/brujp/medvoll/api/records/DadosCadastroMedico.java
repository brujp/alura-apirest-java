package com.brujp.medvoll.api.records;

import com.brujp.medvoll.api.enums.Especialidade;

public record DadosCadastroMedico(
    String nome,
    String email,
    String crm,
    Especialidade especialidade,
    DadosEndereco endereco
) {
}
