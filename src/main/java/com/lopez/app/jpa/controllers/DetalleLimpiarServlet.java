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

import com.lopez.app.jpa.dtos.DetalleLimpiarDto;
import com.lopez.app.jpa.models.Detalle_limpiar;
import com.lopez.app.jpa.services.IService;

@RestController
@RequestMapping("api/detallelimpiar")
public class DetalleLimpiarServlet implements IControllers<Detalle_limpiar, DetalleLimpiarDto> {

    @Autowired
    private IService<Detalle_limpiar, DetalleLimpiarDto> service;

    @Override
    @PostMapping
    public Map<String, String> guardar(@RequestBody DetalleLimpiarDto dto) {
        service.save(dto);
        Map<String, String> response = new HashMap<>();
        response.put("msg", "Detalle guardada");
        return response;
    }

    @Override
    @GetMapping
    public List<Detalle_limpiar> findAll() {
        return service.findAll();
    }

    @Override
    @GetMapping("/{id}")
    public Detalle_limpiar findById(@PathVariable(name = "id") Long id) {
        return service.findById(id).get();
    }

    @Override
    @DeleteMapping("/{id}")
    public Map<String, String> deleteById(@PathVariable(name = "id") Long id) {
        service.deleteById(id);
        Map<String, String> response = new HashMap<>();
        response.put("msg", "Detalle eliminada");
        return response;

    }

    @Override
    @PutMapping
    public Map<String, String> update(@RequestBody DetalleLimpiarDto dto) {
        service.save(dto);
        Map<String, String> response = new HashMap<>();
        response.put("msg", "Alimentar actualizado");
        return response;
    }

}
