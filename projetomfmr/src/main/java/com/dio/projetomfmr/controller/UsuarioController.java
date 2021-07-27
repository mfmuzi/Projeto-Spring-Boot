package com.dio.projetomfmr.controller;

import com.dio.projetomfmr.Service.UsuarioService;
import com.dio.projetomfmr.model.JornadaTabalho;
import com.dio.projetomfmr.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario){
        return usuarioService.saveUsuario(usuario);
    }

    @GetMapping
    public List<Usuario> getUsuarioList(){ return usuarioService.findAll(); }


    @GetMapping("/{idUsuario}")
    public ResponseEntity<Usuario> getUsuarioByID(@PathVariable("idUsuario") Long idusuario) throws Exception {
        return ResponseEntity.ok(usuarioService.getById(idusuario).orElseThrow(() -> new Exception("Usuário não encontrado.")));

    }

    @PutMapping
    public Usuario updateUsuario(@RequestBody Usuario usuario){
        return usuarioService.updateUsuario(usuario);
    }

    @DeleteMapping("/{idUsuario}")
    public ResponseEntity deleteByID(@PathVariable("idUsuario") Long idUsuario) throws Exception {
        try {
            usuarioService.deleteUsuario(idUsuario);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<JornadaTabalho>) ResponseEntity.ok();

    }
}
