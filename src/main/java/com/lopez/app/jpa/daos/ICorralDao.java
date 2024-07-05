package com.lopez.app.jpa.daos;

import org.springframework.data.repository.CrudRepository;

import com.lopez.app.jpa.models.Corral;

public interface ICorralDao extends CrudRepository<Corral, Long> {

}
