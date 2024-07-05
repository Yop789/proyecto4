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

import com.lopez.app.jpa.dtos.DetalleAlimentarDto;
import com.lopez.app.jpa.models.Detalle_alimentar;
import com.lopez.app.jpa.services.IService;

@RestController
@RequestMapping("api/detallealimentar")
public class DetalleAlimentarServlet implements IControllers<Detalle_alimentar, DetalleAlimentarDto> {

    @Autowired
    IService<Detalle_alimentar, DetalleAlimentarDto> iService;

    @Override
    @PostMapping
    public Map<String, String> guardar(@RequestBody DetalleAlimentarDto dto) {
        iService.save(dto);
        Map<String, String> response = new HashMap<>();
        response.put("msg", "Alimentar guardado");
        return response;
    }

    @Override
    @GetMapping
    public List<Detalle_alimentar> findAll() {
        return iService.findAll();
    }

    @Override
    @GetMapping("/{id}")
    public Detalle_alimentar findById(@PathVariable(name = "id") Long id) {
        return iService.findById(id).get();
    }

    @Override
    @DeleteMapping("/{id}")
    public Map<String, String> deleteById(@PathVariable(name = "id") Long id) {
        iService.deleteById(id);
        Map<String, String> response = new HashMap<>();
        response.put("msg", "Alimentar eliminado");
        return response;

    }

    @Override
    @PutMapping
    public Map<String, String> update(@RequestBody DetalleAlimentarDto dto) {
        iService.save(dto);
        Map<String, String> response = new HashMap<>();
        response.put("msg", "Alimentar actualizado");
        return response;
    }

}
