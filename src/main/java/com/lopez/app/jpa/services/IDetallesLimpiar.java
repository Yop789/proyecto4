package com.lopez.app.jpa.services;

import java.util.List;

import com.lopez.app.jpa.dtos.DetalleLimpiarDto;
import com.lopez.app.jpa.models.Detalle_limpiar;

public interface IDetallesLimpiar extends IService<Detalle_limpiar, DetalleLimpiarDto> {

    List<Detalle_limpiar> findByLimpiezaId(Long id);
}
