package com.brujp.medvoll.api.repositories;

import com.brujp.medvoll.api.model.Medico;
import com.brujp.medvoll.api.model.Paciente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

//No Generics eu preciso passar a entidade e o tipo do atributo da chave primária
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    Page<Paciente> findAllByAtivoTrue(Pageable paginacao);
}
