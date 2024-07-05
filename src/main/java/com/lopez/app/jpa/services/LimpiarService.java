package com.lopez.app.jpa.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lopez.app.jpa.daos.ICorralDao;
import com.lopez.app.jpa.daos.ILimpiarDao;
import com.lopez.app.jpa.daos.IUsuarioDao;
import com.lopez.app.jpa.dtos.LimpiarDto;
import com.lopez.app.jpa.models.Limpiar;

@Component
public class LimpiarService implements IService<Limpiar, LimpiarDto> {
    @Autowired
    private ILimpiarDao iLimpiarDao;
    private IUsuarioDao iUsuarioDao;

    private ICorralDao iCorralDao;

    @Override
    public List<Limpiar> findAll() {
        List<Limpiar> limpiar = new ArrayList<>();
        limpiar = (List<Limpiar>) iLimpiarDao.findAll();

        return limpiar;

    }

    @Override
    public Optional<Limpiar> findById(Long id) {
        Optional<Limpiar> limpiar = iLimpiarDao.findById(id);
        return limpiar;
    }

    @Override
    public void save(LimpiarDto t) {
        iLimpiarDao.save(conver(t));
    }

    @Override
    public void deleteById(Long id) {
        iLimpiarDao.deleteById(id);
    }

    private Limpiar conver(LimpiarDto t) {
        Limpiar limpiar = new Limpiar();
        limpiar.setId(t.getId());
        limpiar.setLimpiador(iUsuarioDao.findById(t.getId_limpiador()).get());
        limpiar.setCorral(iCorralDao.findById(t.getId_corral()).get());
        limpiar.setFecha(t.getFecha());
        limpiar.setFechaFinal(t.getFechaFin());
        limpiar.setEstado(t.getEstado());
        return limpiar;
    }

}
