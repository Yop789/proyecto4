package com.lopez.app.jpa.controllers;

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

import com.lopez.app.jpa.dtos.LimpiarDto;
import com.lopez.app.jpa.models.Limpiar;
import com.lopez.app.jpa.services.IService;

@RestController
@RequestMapping("api/limpiar")
public class LimpiarServlet implements IControllers<Limpiar, LimpiarDto> {
    @Autowired
    private IService<Limpiar, LimpiarDto> service;

    @Override
    @PostMapping
    public Map<String, String> guardar(@RequestBody LimpiarDto dto) {
        service.save(dto);
        Map<String, String> response = new HashMap<>();
        response.put("msg", "Limpiar guardada");
        return response;
    }

    @Override
    @GetMapping
    public List<Limpiar> findAll() {
        return service.findAll();
    }

    @Override
    @GetMapping("/{id}")
    public Limpiar findById(@PathVariable(name = "id") Long id) {
        return service.findById(id).get();
    }

    @Override
    @DeleteMapping("/{id}")
    public Map<String, String> deleteById(@PathVariable(name = "id") Long id) {
        service.deleteById(id);
        Map<String, String> response = new HashMap<>();
        response.put("msg", "Limpiar eliminada");
        return response;
    }

    @Override
    @PutMapping
    public Map<String, String> update(@RequestBody LimpiarDto dto) {
        service.save(dto);
        Map<String, String> response = new HashMap<>();
        response.put("msg", "Limpiar actualizada");
        return response;
    }

}
