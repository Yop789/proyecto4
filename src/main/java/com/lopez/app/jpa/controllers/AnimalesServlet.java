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

import com.lopez.app.jpa.dtos.AnimalesDto;

import com.lopez.app.jpa.models.Animales;
import com.lopez.app.jpa.services.IAnimalService;

@RestController
@RequestMapping("api/animales")
public class AnimalesServlet implements IControllers<Animales, AnimalesDto> {

    @Autowired
    IAnimalService iAnimalService;

    @Override
    @PostMapping
    public Map<String, String> guardar(@RequestBody AnimalesDto dto) {
        Map<String, String> response = new HashMap<>();
        iAnimalService.save(dto);
        response.put("msg", "Animal guardado");
        return response;

    }

    @Override
    @GetMapping
    public List<Animales> findAll() {
        List<Animales> animales = iAnimalService.findAll();
        return animales;
    }

    @Override
    @GetMapping("/{id}")
    public Animales findById(@PathVariable(name = "id") Long id) {
        return iAnimalService.findById(id).get();
    }

    @Override
    @DeleteMapping("/{id}")
    public Map<String, String> deleteById(@PathVariable(name = "id") Long id) {
        iAnimalService.deleteById(id);
        Map<String, String> response = new HashMap<>();
        response.put("msg", "Animal eliminado");
        return response;
    }

    @Override
    @PutMapping
    public Map<String, String> update(@RequestBody AnimalesDto dto) {
        iAnimalService.save(dto);
        Map<String, String> response = new HashMap<>();
        response.put("msg", "Animal actualizado");
        return response;
    }

    @GetMapping("/corral/{id}")
    public List<Animales> findByIdCorral(@PathVariable(name = "id") Long id) {
        return iAnimalService.findByIdCorral(id);
    }

}
