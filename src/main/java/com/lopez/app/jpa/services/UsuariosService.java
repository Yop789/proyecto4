package com.lopez.app.jpa.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lopez.app.jpa.daos.IUsuarioDao;
import com.lopez.app.jpa.dtos.UsuarioDto;
import com.lopez.app.jpa.models.Usuario;

@Component
public class UsuariosService implements IService<Usuario, UsuarioDto> {
    @Autowired
    private IUsuarioDao iUsuarioRepository;

    @Override
    public List<Usuario> findAll() {
        List<Usuario> usuarios = new ArrayList<>();
        usuarios = (List<Usuario>) iUsuarioRepository.findAll();

        return usuarios;

    }

    @Override
    public Optional<Usuario> findById(Long id) {
        Optional<Usuario> usuario = iUsuarioRepository.findById(id);
        return usuario;

    }

    @Override
    public void save(UsuarioDto t) {
        iUsuarioRepository.save(conver(t));
    }

    @Override
    public void deleteById(Long id) {
        iUsuarioRepository.deleteById(id);
    }

    private Usuario conver(UsuarioDto t) {
        Usuario usuario = new Usuario();
        usuario.setId(t.getId());
        usuario.setNombre(t.getNombre());
        usuario.setPassword(t.getPassword());
        usuario.setUsername(t.getUsername());
        usuario.setApPaterno(t.getApPaterno());
        usuario.setApMaterno(t.getApMaterno());
        usuario.setTelefono(t.getTelefono());
        usuario.setEdad(t.getEdad());
        usuario.setRol(t.getRol());
        return usuario;
    }

}
