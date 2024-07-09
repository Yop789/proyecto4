package com.lopez.app.jpa.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lopez.app.jpa.daos.ICorralDao;
import com.lopez.app.jpa.dtos.CorralDto;
import com.lopez.app.jpa.enums.EstatusCorral;
import com.lopez.app.jpa.enums.TipoEspecie;
import com.lopez.app.jpa.models.Corral;

@Component
public class CorralService implements ICorralEService {

    @Autowired
    private ICorralDao iCorralDao;

    @Override
    public List<Corral> findAll() {
        List<Corral> corral = new ArrayList<>();
        corral = (List<Corral>) iCorralDao.findAll();
        return corral;
    }

    @Override
    public Optional<Corral> findById(Long id) {
        Optional<Corral> corral = iCorralDao.findById(id);
        return corral;
    }

    @Override
    public void save(CorralDto t) {
        iCorralDao.save(conver(t));
    }

    @Override
    public void deleteById(Long id) {
        iCorralDao.deleteById(id);
    }

    private Corral conver(CorralDto t) {
        Corral corral = new Corral();
        corral.setId(t.getId());
        corral.setTipo(t.getTipo());
        corral.setCapacidad(t.getCapacidad());
        corral.setUbicacion(t.getUbicacion());
        corral.setEstatus(t.getEstatus());
        corral.setTamano(t.getTamano());
        corral.setTipoValla(t.getTipoValla());
        corral.setTipoAnimal(t.getTipoAnimal());
        return corral;
    }

    @Override
    public List<Corral> findByEspecie(String especie, String estatus) {

        return iCorralDao.findByEspecie(TipoEspecie.valueOf(especie), EstatusCorral.valueOf(estatus));
    }

}
