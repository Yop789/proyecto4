package com.lopez.app.jpa.daos;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.lopez.app.jpa.models.Alimentar;

import jakarta.transaction.Transactional;

public interface IAlimentoDao extends CrudRepository<Alimentar, Long> {

    @Modifying
    @Transactional
    @Query("UPDATE Alimentar d SET d.estado = ?2, d.fechaFinal = ?3 WHERE d.id = ?1")
    void update(Long id, Boolean estado, LocalDateTime fechaFin);
}
