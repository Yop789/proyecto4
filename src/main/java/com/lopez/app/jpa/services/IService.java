package com.lopez.app.jpa.services;

import java.util.List;
import java.util.Optional;

public interface IService<T, S> {
    List<T> findAll();

    Optional<T> findById(Long id);

    void save(S t);

    void deleteById(Long id);

}
