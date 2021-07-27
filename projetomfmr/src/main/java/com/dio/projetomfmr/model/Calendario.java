package com.dio.projetomfmr.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Calendario {
//variáveis dessa classe
    @Id
    @GeneratedValue
    private Long id;
    private String descricao;
    private LocalDateTime dataEspecial;

// se relaciona com a classe
    @ManyToOne
    private TipoData tipoData;

}
