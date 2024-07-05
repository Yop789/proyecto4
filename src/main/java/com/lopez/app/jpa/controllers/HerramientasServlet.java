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

import com.lopez.app.jpa.dtos.HerramientasDto;
import com.lopez.app.jpa.models.Herramienta;
import com.lopez.app.jpa.services.IService;

@RestController
@RequestMapping("api/herramientas")
public class HerramientasServlet implements IControllers<Herramienta, HerramientasDto> {
    @Autowired
    private IService<Herramienta, HerramientasDto> service;

    @Override
    @PostMapping
    public Map<String, String> guardar(@RequestBody HerramientasDto dto) {
        service.save(dto);
        Map<String, String> response = new HashMap<>();
        response.put("msg", "Herramienta guardada");
        return response;
    }

    @Override
    @GetMapping
    public List<Herramienta> findAll() {
        return service.findAll();
    }

    @Override
    @GetMapping("/{id}")
    public Herramienta findById(@PathVariable(name = "id") Long id) {
        return service.findById(id).get();
    }

    @Override
    @DeleteMapping("/{id}")
    public Map<String, String> deleteById(@PathVariable(name = "id") Long id) {
        service.deleteById(id);
        Map<String, String> response = new HashMap<>();
        response.put("msg", "Herramienta eliminada");
        return response;

    }

    @Override
    @PutMapping
    public Map<String, String> update(@RequestBody HerramientasDto dto) {
        service.save(dto);
        Map<String, String> response = new HashMap<>();
        response.put("msg", "Herramienta actualizada");
        return response;
    }

}
