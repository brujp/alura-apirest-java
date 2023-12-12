package com.brujp.medvoll.api.records;

import com.brujp.medvoll.api.enums.Especialidade;
import com.brujp.medvoll.api.model.Medico;

//Só quero devolver isso ao chamar o método para listar os médicos
public record DadosListagemMedico(
        Long id,
        String nome,
        String email,
        String crm,
        String telefone,
        Especialidade especialidade
) {
    public DadosListagemMedico(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getTelefone(), medico.getEspecialidade());
    }
}
