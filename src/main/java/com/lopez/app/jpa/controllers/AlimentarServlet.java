package com.lopez.app.jpa.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lopez.app.jpa.dtos.AlimentarDto;
import com.lopez.app.jpa.models.Alimentar;
import com.lopez.app.jpa.services.IService;

@RestController
@RequestMapping("api/alimentar")
public class AlimentarServlet implements IControllers<Alimentar, AlimentarDto> {
    @Autowired
    IService<Alimentar, AlimentarDto> iAlimentarService;

    @Override
    @PostMapping
    public Map<String, String> guardar(@RequestBody AlimentarDto dto) {
        iAlimentarService.save(dto);
        Map<String, String> response = new HashMap<>();
        response.put("msg", "Alimentar guardado");
        return response;
    }

    @Override
    @GetMapping
    public List<Alimentar> findAll() {
        List<Alimentar> alimentar = iAlimentarService.findAll();
        return alimentar;
    }

    @Override
    @GetMapping("/{id}")
    public Alimentar findById(@PathVariable(name = "id") Long id) {
        return iAlimentarService.findById(id).get();
    }

    @Override
    @DeleteMapping("/{id}")
    public Map<String, String> deleteById(@PathVariable(name = "id") Long id) {
        iAlimentarService.deleteById(id);
        Map<String, String> response = new HashMap<>();
        response.put("msg", "Alimentar eliminado");
        return response;
    }

    @Override
    public Map<String, String> update(@RequestBody AlimentarDto dto) {
        iAlimentarService.save(dto);
        Map<String, String> response = new HashMap<>();
        response.put("msg", "Alimentar actualizado");
        return response;
    }

}
