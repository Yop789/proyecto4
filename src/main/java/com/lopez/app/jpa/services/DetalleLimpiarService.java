package com.lopez.app.jpa.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lopez.app.jpa.daos.IDetalleLimpiarDao;
import com.lopez.app.jpa.daos.IHerramientasDao;
import com.lopez.app.jpa.daos.ILimpiarDao;
import com.lopez.app.jpa.dtos.DetalleLimpiarDto;

import com.lopez.app.jpa.models.Detalle_limpiar;

@Component
public class DetalleLimpiarService implements IService<Detalle_limpiar, DetalleLimpiarDto> {
    @Autowired
    private IDetalleLimpiarDao iDetalleLimpiarDao;

    @Autowired
    private ILimpiarDao iLimpiarDao;
    @Autowired
    private IHerramientasDao iHerramientasDao;

    @Override
    public List<Detalle_limpiar> findAll() {
        List<Detalle_limpiar> limpiar = new ArrayList<>();
        limpiar = (List<Detalle_limpiar>) iDetalleLimpiarDao.findAll();
        return limpiar;
    }

    @Override
    public Optional<Detalle_limpiar> findById(Long id) {
        Optional<Detalle_limpiar> limpiar = iDetalleLimpiarDao.findById(id);
        return limpiar;
    }

    @Override
    public void save(DetalleLimpiarDto t) {
        iDetalleLimpiarDao.save(conver(t));
    }

    @Override
    public void deleteById(Long id) {
        iDetalleLimpiarDao.deleteById(id);
    }

    private Detalle_limpiar conver(DetalleLimpiarDto t) {
        Detalle_limpiar limpiar = new Detalle_limpiar();
        limpiar.setId(t.getId());
        limpiar.setHerramienta(iHerramientasDao.findById(t.getId_herramienta()).get());
        limpiar.setLimpieza(iLimpiarDao.findById(t.getId_limpiador()).get());
        limpiar.setFecha(t.getFecha());
        limpiar.setFechaFin(t.getFechaFin());
        return limpiar;
    }

}
