package com.lopez.app.jpa.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lopez.app.jpa.daos.IHerramientasDao;
import com.lopez.app.jpa.dtos.HerramientasDto;
import com.lopez.app.jpa.models.Herramienta;

@Component
public class HerramientasService implements IService<Herramienta, HerramientasDto> {

    @Autowired
    private IHerramientasDao iHerramientaRepository;

    @Override
    public List<Herramienta> findAll() {
        List<Herramienta> herramientas = new ArrayList<>();
        herramientas = (List<Herramienta>) iHerramientaRepository.findAll();
        return herramientas;
    }

    @Override
    public Optional<Herramienta> findById(Long id) {
        Optional<Herramienta> herramienta = iHerramientaRepository.findById(id);
        return herramienta;
    }

    @Override
    public void save(HerramientasDto t) {
        iHerramientaRepository.save(conver(t));
    }

    @Override
    public void deleteById(Long id) {
        iHerramientaRepository.deleteById(id);
    }

    private Herramienta conver(HerramientasDto t) {
        Herramienta h = new Herramienta();
        h.setId(t.getId());
        h.setCodigo(t.getCodigo());
        h.setNombre(t.getNombre());
        h.setDescripcion(t.getDescripcion());
        h.setDisponibilidad(t.getDisponibilidad());
        h.setMarca(t.getMarca());
        h.setColor(t.getColor());
        h.setTipoHerramienta(t.getTipoHerramienta());
        h.setEstado(t.getEstado());
        return h;
    }

}
