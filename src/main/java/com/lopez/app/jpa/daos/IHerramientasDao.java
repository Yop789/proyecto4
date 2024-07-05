package com.lopez.app.jpa.daos;

import org.springframework.data.repository.CrudRepository;

import com.lopez.app.jpa.models.Herramienta;

public interface IHerramientasDao extends CrudRepository<Herramienta, Long> {

}
