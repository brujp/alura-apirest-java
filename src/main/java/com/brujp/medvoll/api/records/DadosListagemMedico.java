package com.brujp.medvoll.api.records;

import com.brujp.medvoll.api.enums.Especialidade;
import com.brujp.medvoll.api.model.Medico;

//Só quero devolver isso ao chamar o método para listar os médicos
public record DadosListagemMedico(
        String nome,
        String email,
        String crm,
        Especialidade especialidade
) {
    public DadosListagemMedico(Medico medico) {
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
