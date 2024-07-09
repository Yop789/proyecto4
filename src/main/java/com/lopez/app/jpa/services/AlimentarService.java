package com.lopez.app.jpa.services;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lopez.app.jpa.daos.IAlimentoDao;
import com.lopez.app.jpa.daos.IComidaDao;
import com.lopez.app.jpa.daos.ICorralDao;
import com.lopez.app.jpa.daos.IUsuarioDao;
import com.lopez.app.jpa.dtos.AlimentarDto;
import com.lopez.app.jpa.models.Alimentar;

@Component
public class AlimentarService implements IAlimentar {
    @Autowired
    private IAlimentoDao iAlimentarDao;

    @Autowired
    private IComidaDao iComidaDao;

    @Autowired
    private IUsuarioDao iUsuarioDao;

    @Autowired
    private ICorralDao iCorralDao;

    @Override
    public List<Alimentar> findAll() {
        List<Alimentar> alimentar = new ArrayList<>();
        alimentar = (List<Alimentar>) iAlimentarDao.findAll();
        return alimentar;
    }

    @Override
    public Optional<Alimentar> findById(Long id) {
        Optional<Alimentar> alimentar = iAlimentarDao.findById(id);
        return alimentar;
    }

    @Override
    public void save(AlimentarDto t) {
        iAlimentarDao.save(conver(t));
    }

    @Override
    public void deleteById(Long id) {
        iAlimentarDao.deleteById(id);
    }

    private Alimentar conver(AlimentarDto t) {
        Alimentar alimentar = new Alimentar();
        alimentar.setId(t.getId());
        alimentar.setAlimentador(iUsuarioDao.findById(t.getId_alimentador()).get());
        alimentar.setComida(iComidaDao.findById(t.getId_comida()).get());
        alimentar.setCantidad(t.getCantidad());
        alimentar.setCorral(iCorralDao.findById(t.getId_corral()).get());
        alimentar.setFecha(t.getFecha());
        alimentar.setFechaFinal(t.getFechaFinal());
        alimentar.setEstado(t.getEstado());
        return alimentar;
    }

    @Override
    public Long saveReturId(AlimentarDto t) {
        Alimentar d = iAlimentarDao.save(conver(t));
        return d.getId();
    }

    @Override
    public void update(Long id) {
        iAlimentarDao.update(id, false, LocalDateTime.now());
    }
}
