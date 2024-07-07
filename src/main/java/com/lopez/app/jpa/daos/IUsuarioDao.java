package com.lopez.app.jpa.daos;

import org.springframework.data.repository.CrudRepository;

import com.lopez.app.jpa.models.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {
    Usuario findByusername(String username);
}
