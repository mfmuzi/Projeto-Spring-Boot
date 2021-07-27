package com.dio.projetomfmr.Service;

import com.dio.projetomfmr.Repository.JornadaRepository;
import com.dio.projetomfmr.model.JornadaTabalho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {

    JornadaRepository jornadaRepository;

    @Autowired
    public JornadaService(JornadaRepository jornadaRepository){
        this.jornadaRepository = jornadaRepository;
    }

    public JornadaTabalho saveJornada(JornadaTabalho jornadaTabalho){
       return jornadaRepository.save(jornadaTabalho);
    }

    public List<JornadaTabalho> findAll() {
       return jornadaRepository.findAll();
    }

    public Optional<JornadaTabalho> getById(Long idjornada) {
        return jornadaRepository.findById(idjornada);
    }

    public JornadaTabalho updateJornada(JornadaTabalho jornadaTabalho){
        return jornadaRepository.save(jornadaTabalho);
    }

    public void deleteJornada(Long idjornada) {
        jornadaRepository.deleteById(idjornada);
    }
}
