package com.brujp.medvoll.api.model;

import com.brujp.medvoll.api.enums.Especialidade;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "medicos")
@Entity(name = "Medico")
@Getter
@NoArgsConstructor //JPA exige em todas as entidades
@AllArgsConstructor
@EqualsAndHashCode(of = "id") //Equals gerado em cima do id
public class Medico {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    private String nome;

    private String email;

    private String crm;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    //Endereco faz parte da table Medico
    @Embedded
    private Endereco endereco;

}
