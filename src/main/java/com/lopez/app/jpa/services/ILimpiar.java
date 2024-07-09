package com.lopez.app.jpa.services;

import com.lopez.app.jpa.dtos.LimpiarDto;
import com.lopez.app.jpa.models.Limpiar;

public interface ILimpiar extends IService<Limpiar, LimpiarDto> {

    Long saveReturId(LimpiarDto t);

    void update(Long id);
}
