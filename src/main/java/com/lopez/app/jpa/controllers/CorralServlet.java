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

import com.lopez.app.jpa.dtos.CorralDto;
import com.lopez.app.jpa.models.Corral;
import com.lopez.app.jpa.services.IService;

@RestController
@RequestMapping("api/corrales")
public class CorralServlet implements IControllers<Corral, CorralDto> {

    @Autowired
    IService<Corral, CorralDto> CorralService;

    @PostMapping
    public Map<String, String> guardar(@RequestBody CorralDto t) {
        CorralService.save(t);
        Map<String, String> response = new HashMap<>();
        response.put("msg", "Corral guardado");
        return response;

    }

    @GetMapping
    public List<Corral> findAll() {
        return CorralService.findAll();
    }

    @GetMapping("/{id}")
    public Corral findById(@PathVariable(name = "id") Long id) {
        return CorralService.findById(id).get();
    }

    @DeleteMapping("/{id}")
    public Map<String, String> deleteById(@PathVariable(name = "id") Long id) {
        CorralService.deleteById(id);
        Map<String, String> response = new HashMap<>();
        response.put("msg", "Corral eliminado");
        return response;
    }

    @PutMapping
    public Map<String, String> update(@RequestBody CorralDto t) {
        CorralService.save(t);
        Map<String, String> response = new HashMap<>();
        response.put("msg", "Corral actualizado");
        return response;
    }

}
