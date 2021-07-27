package com.dio.projetomfmr.controller;

import com.dio.projetomfmr.Service.JornadaService;
import com.dio.projetomfmr.model.JornadaTabalho;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/jornada")
@Api(value="Api REST")
@CrossOrigin(origins="*")

public class jornadaTrabalhoController {

    @Autowired
    JornadaService jornadaService;

    @PostMapping
    @ApiOperation(value="Insere um tipo de jornada")
    public JornadaTabalho createJornada(@RequestBody JornadaTabalho jornadaTabalho){
        return jornadaService.saveJornada(jornadaTabalho);
    }

    @GetMapping
    @ApiOperation(value="Retrona uma lista de tipos de jornada de trabalho")
    public List<JornadaTabalho> getJornadaList(){ return jornadaService.findAll(); }


    @GetMapping("/{idJornada}")
    @ApiOperation(value="Retrona um unico tipo de jornada")
    public ResponseEntity<JornadaTabalho> getJornadaByID(@PathVariable("idJornada") Long idjornada) throws Exception {
        return ResponseEntity.ok(jornadaService.getById(idjornada).orElseThrow(() -> new Exception("Jornada não encontrada.")));

    }

    @PutMapping
    @ApiOperation(value="Atualiza o tipo de jornada")
    public JornadaTabalho updateJornada(@RequestBody JornadaTabalho jornadaTabalho){
        return jornadaService.updateJornada(jornadaTabalho);
    }

    @DeleteMapping ("/{idJornada}")
    @ApiOperation(value="Delete um tipo de jornada")
    public ResponseEntity deleteByID(@PathVariable("idJornada") Long idJornada) throws Exception {
        try {
            jornadaService.deleteJornada(idJornada);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<JornadaTabalho>) ResponseEntity.ok();

    }
}
