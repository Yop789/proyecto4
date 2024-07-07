package com.lopez.app.jpa.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lopez.app.jpa.enums.EnumCategoriaComida;

@RestController
@RequestMapping("api/Categoria-Comida")
public class CategoriaComidaSevlet {

    @GetMapping
    public List<String> findAll() {
        List<String> categorias = new ArrayList<>();
        for (EnumCategoriaComida e : EnumCategoriaComida.values()) {
            categorias.add(e.toString());
        }
        return categorias;
    }

}
