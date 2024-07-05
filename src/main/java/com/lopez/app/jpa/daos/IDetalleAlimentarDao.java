package com.lopez.app.jpa.daos;

import org.springframework.data.repository.CrudRepository;

import com.lopez.app.jpa.models.Detalle_alimentar;

public interface IDetalleAlimentarDao extends CrudRepository<Detalle_alimentar, Long> {

}
