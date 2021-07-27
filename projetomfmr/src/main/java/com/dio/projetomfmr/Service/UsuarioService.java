package com.dio.projetomfmr.Service;

import com.dio.projetomfmr.Repository.UsuarioRepository;
import com.dio.projetomfmr.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario saveUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> getById(Long idusuario) {
        return usuarioRepository.findById(idusuario);
    }

    public Usuario updateUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public void deleteUsuario(Long idusuario) {
        usuarioRepository.deleteById(idusuario);
    }

}
