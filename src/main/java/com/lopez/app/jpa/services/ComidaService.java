package com.lopez.app.jpa.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lopez.app.jpa.daos.IComidaDao;
import com.lopez.app.jpa.dtos.ComidaDto;
import com.lopez.app.jpa.models.Comida;

@Component
public class ComidaService implements IService<Comida, ComidaDto> {
    @Autowired
    private IComidaDao iComidaDao;

    @Override
    public List<Comida> findAll() {
        List<Comida> comidas = new ArrayList<>();
        comidas = (List<Comida>) iComidaDao.findAll();
        return comidas;
    }

    @Override
    public Optional<Comida> findById(Long id) {
        Optional<Comida> comidas = iComidaDao.findById(id);
        return comidas;
    }

    @Override
    public void save(ComidaDto t) {
        iComidaDao.save(conver(t));
    }

    @Override
    public void deleteById(Long id) {
        iComidaDao.deleteById(id);
    }

    private Comida conver(ComidaDto t) {
        Comida comidas = new Comida();
        comidas.setId(t.getId());
        comidas.setNombre(t.getNombre());
        comidas.setDescripcion(t.getDescripcion());
        comidas.setDisponibilidad(t.getDisponibilidad());
        comidas.setCategoria(t.getCategoria());
        comidas.setCantidad(t.getCantidad());
        comidas.setFechaReabasteciendo(t.getFechaReabasteciendo());
        return comidas;

    }

}
