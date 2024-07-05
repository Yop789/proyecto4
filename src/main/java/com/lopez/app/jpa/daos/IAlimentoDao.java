package com.lopez.app.jpa.daos;

import org.springframework.data.repository.CrudRepository;

import com.lopez.app.jpa.models.Alimentar;

public interface IAlimentoDao extends CrudRepository<Alimentar, Long> {

}
