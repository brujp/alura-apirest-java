package com.brujp.medvoll.api.records;

import com.brujp.medvoll.api.enums.Especialidade;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

//NotBlank - Somente para Strings
public record DadosCadastroMedico(
    @NotBlank
    String nome,
    @NotBlank
    @Email
    String email,
    @NotBlank
    @Pattern(regexp = "\\d{4,6}")
    String crm,
    @NotNull
    Especialidade especialidade,
    @NotNull
    @Valid
    DadosEndereco endereco
) {
}
