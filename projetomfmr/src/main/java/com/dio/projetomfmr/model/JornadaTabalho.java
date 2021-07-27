package com.dio.projetomfmr.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

// COM lombok

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class JornadaTabalho {
//variáveis dessa classe
    @Id
    @GeneratedValue
    private Long id;
    private String descricao;
}


// SEM o lombok
/*public class jornadaTabalho {
    private long id;
    private String descricao;
//---------------------------------------------------------------------------------------
    //substitui por AllArgsConstructor

    public jornadaTabalho(long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
//------------------------------------------------------------------------------------------
     //Substitui por Getter e Setter

    public jornadaTabalho(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
//-----------------------------------------------------------------------------------------------------
    //Substitui por EqualsAndHashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        jornadaTabalho that = (jornadaTabalho) o;
        return id == that.id && Objects.equals(descricao, that.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descricao);
    }
//-------------------------------------------------------------------------------------------------------------
}*/
