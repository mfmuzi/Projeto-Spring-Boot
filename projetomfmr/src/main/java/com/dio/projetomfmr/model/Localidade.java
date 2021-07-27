package com.dio.projetomfmr.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Localidade {
//variáveis dessa classe
    @Id
    @GeneratedValue
    private Long id;
    private String descricao;

//se relaciona com a classe

   @ManyToOne //nivel de acesso dessa classe. Essa classe localidade pode ser acessada por várias outras.
    private NivelAcesso nivelAcesso;

}
