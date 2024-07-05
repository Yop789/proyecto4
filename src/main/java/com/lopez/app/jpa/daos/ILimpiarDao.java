package com.lopez.app.jpa.daos;

import org.springframework.data.repository.CrudRepository;

import com.lopez.app.jpa.models.Limpiar;

public interface ILimpiarDao extends CrudRepository<Limpiar, Long> {

}
