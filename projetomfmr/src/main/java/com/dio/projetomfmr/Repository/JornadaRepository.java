package com.dio.projetomfmr.Repository;


import com.dio.projetomfmr.model.JornadaTabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTabalho, Long> {
}
