package com.dio.projetomfmr.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Ocorrencia {
// variáveis dessa classe
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String descricao;


}
