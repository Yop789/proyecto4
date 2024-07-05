package com.lopez.app.jpa.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lopez.app.jpa.daos.IAnimalesDao;
import com.lopez.app.jpa.daos.ICorralDao;
import com.lopez.app.jpa.dtos.AnimalesDto;
import com.lopez.app.jpa.models.Animales;

@Component
public class AnimalService implements IService<Animales, AnimalesDto> {
    @Autowired
    private IAnimalesDao iAnimalesDao;

    @Autowired
    private ICorralDao iCorralDao;

    @Override
    public List<Animales> findAll() {
        List<Animales> animales = new ArrayList<>();
        animales = (List<Animales>) iAnimalesDao.findAll();
        return animales;
    }

    @Override
    public Optional<Animales> findById(Long id) {
        Optional<Animales> animales = iAnimalesDao.findById(id);
        return animales;
    }

    @Override
    public void save(AnimalesDto t) {
        iAnimalesDao.save(conver(t));
    }

    @Override
    public void deleteById(Long id) {
        iAnimalesDao.deleteById(id);
    }

    private Animales conver(AnimalesDto t) {
        Animales animales = new Animales();
        animales.setId(t.getId());
        animales.setSiniiga(t.getSiniiga());
        animales.setEspecie(t.getEspecie());
        animales.setGenero(t.getGenero());
        animales.setPeso(t.getPeso());
        animales.setAltura(t.getAltura());
        animales.setColor(t.getColor());
        animales.setFechaNacimiento(t.getFechaNacimiento());
        animales.setCorral(iCorralDao.findById(t.getIdCorral()).get());
        return animales;
    }

}
