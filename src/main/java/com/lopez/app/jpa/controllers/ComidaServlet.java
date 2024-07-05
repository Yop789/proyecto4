package com.lopez.app.jpa.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lopez.app.jpa.dtos.ComidaDto;
import com.lopez.app.jpa.models.Comida;
import com.lopez.app.jpa.services.IService;

@RestController
@RequestMapping("api/comida")
public class ComidaServlet implements IControllers<Comida, ComidaDto> {
    @Autowired
    private IService<Comida, ComidaDto> iComidaDao;

    @Override
    @PostMapping
    public Map<String, String> guardar(@RequestBody ComidaDto dto) {
        iComidaDao.save(dto);
        Map<String, String> response = new HashMap<>();
        response.put("msg", "Comida guardada");
        return response;
    }

    @Override
    public List<Comida> findAll() {
        return iComidaDao.findAll();
    }

    @Override
    @PostMapping("/{id}")
    public Comida findById(@PathVariable(name = "id") Long id) {
        return iComidaDao.findById(id).get();
    }

    @Override
    @DeleteMapping("/{id}")
    public Map<String, String> deleteById(@PathVariable(name = "id") Long id) {
        iComidaDao.deleteById(id);
        Map<String, String> response = new HashMap<>();
        response.put("msg", "Comida eliminada");
        return response;
    }

    @Override
    @PutMapping
    public Map<String, String> update(@RequestBody ComidaDto dto) {
        iComidaDao.save(dto);
        Map<String, String> response = new HashMap<>();
        response.put("msg", "Comida actualizada");
        return response;
    }

}
