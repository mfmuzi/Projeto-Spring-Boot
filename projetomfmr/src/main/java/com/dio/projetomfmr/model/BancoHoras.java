package com.dio.projetomfmr.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class BancoHoras {


       @AllArgsConstructor
       @NoArgsConstructor
       @EqualsAndHashCode
       @Embeddable
       public class BancoHorasId implements Serializable {
              private Long idMovimentacao;
              private Long idUsuario;
              private Long idBancoHoras;
       }

       @EmbeddedId

       private BancoHorasId id;
       private LocalDateTime dataTrabalhada;
       private BigDecimal quantidadeHoras;
       private BigDecimal saldoHoras;

}
