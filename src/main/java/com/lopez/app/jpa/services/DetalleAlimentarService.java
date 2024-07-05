package com.lopez.app.jpa.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lopez.app.jpa.daos.IAlimentoDao;
import com.lopez.app.jpa.daos.IDetalleAlimentarDao;
import com.lopez.app.jpa.daos.IHerramientasDao;
import com.lopez.app.jpa.dtos.DetalleAlimentarDto;
import com.lopez.app.jpa.models.Detalle_alimentar;

@Component
public class DetalleAlimentarService implements IService<Detalle_alimentar, DetalleAlimentarDto> {

    @Autowired
    private IDetalleAlimentarDao iDetalleAlimentarDao;
    @Autowired
    private IAlimentoDao iAlimentarDao;

    @Autowired
    private IHerramientasDao iHerramientasDao;

    @Override
    public List<Detalle_alimentar> findAll() {
        List<Detalle_alimentar> alimentar = new ArrayList<>();
        alimentar = (List<Detalle_alimentar>) iDetalleAlimentarDao.findAll();
        return alimentar;
    }

    @Override
    public Optional<Detalle_alimentar> findById(Long id) {
        Optional<Detalle_alimentar> alimentar = iDetalleAlimentarDao.findById(id);
        return alimentar;
    }

    @Override
    public void save(DetalleAlimentarDto t) {
        iDetalleAlimentarDao.save(conver(t));
    }

    @Override
    public void deleteById(Long id) {
        iDetalleAlimentarDao.deleteById(id);
    }

    private Detalle_alimentar conver(DetalleAlimentarDto t) {
        Detalle_alimentar alimentar = new Detalle_alimentar();
        alimentar.setId(t.getId());
        alimentar.setAlimentar(iAlimentarDao.findById(t.getId_alimetacion()).get());
        alimentar.setHerramienta(iHerramientasDao.findById(t.getId_herramienta()).get());
        alimentar.setFecha(t.getFecha());
        alimentar.setFechaFin(t.getFechaFin());
        return alimentar;
    }

}
