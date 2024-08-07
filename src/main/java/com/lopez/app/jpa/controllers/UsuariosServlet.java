package com.lopez.app.jpa.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lopez.app.jpa.dtos.UsuarioDto;
import com.lopez.app.jpa.enums.EnumEstadoUsuario;
import com.lopez.app.jpa.enums.EnumRoles;
import com.lopez.app.jpa.models.Usuario;
import com.lopez.app.jpa.services.IService;

@RestController
@RequestMapping("api/users")
public class UsuariosServlet implements IControllers<Usuario, UsuarioDto> {
    @Autowired
    private IService<Usuario, UsuarioDto> service;

    @Override
    @PostMapping
    public Map<String, String> guardar(@RequestBody UsuarioDto dto) {
        service.save(dto);
        Map<String, String> response = new HashMap<>();
        response.put("msg", "Usuario registrado");
        return response;
    }

    @Override
    @GetMapping
    public List<Usuario> findAll() {
        return service.findAll();
    }

    @Override
    @GetMapping("/{id}")
    public Usuario findById(@PathVariable(name = "id") Long id) {
        return service.findById(id).get();
    }

    @Override
    @DeleteMapping("/{id}")
    public Map<String, String> deleteById(@PathVariable(name = "id") Long id) {
        service.deleteById(id);
        Map<String, String> response = new HashMap<>();
        response.put("msg", "Usuario eliminado");
        return response;
    }

    @Override
    @PutMapping
    public Map<String, String> update(@RequestBody UsuarioDto dto) {
        service.save(dto);
        Map<String, String> response = new HashMap<>();
        response.put("msg", "Usuario actualizado");
        return response;
    }

    @GetMapping("/roles")
    public List<String> getRoles() {
        List<String> tipos = new ArrayList<>();
        for (EnumRoles e : EnumRoles.values()) {
            tipos.add(e.toString());
        }
        return tipos;
    }

    @GetMapping("/estatus")
    public List<String> getEstatus() {
        List<String> tipos = new ArrayList<>();
        for (EnumEstadoUsuario e : EnumEstadoUsuario.values()) {
            tipos.add(e.toString());
        }
        return tipos;
    }

}
