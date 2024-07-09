package com.lopez.app.jpa.daos;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.lopez.app.jpa.models.Limpiar;

import jakarta.transaction.Transactional;

public interface ILimpiarDao extends CrudRepository<Limpiar, Long> {

    @Modifying
    @Transactional
    @Query("UPDATE Limpiar d SET d.estado = ?2, d.fechaFinal = ?3 WHERE d.id = ?1")
    void update(Long id, Boolean estado, LocalDateTime fechaFin);

}
