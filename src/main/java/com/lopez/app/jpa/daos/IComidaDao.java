package com.lopez.app.jpa.daos;

import org.springframework.data.repository.CrudRepository;

import com.lopez.app.jpa.models.Comida;

public interface IComidaDao extends CrudRepository<Comida, Long> {

}
