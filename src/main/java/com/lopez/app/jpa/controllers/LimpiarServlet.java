package com.lopez.app.jpa.controllers;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lopez.app.jpa.dtos.DetalleLimpiarDto;
import com.lopez.app.jpa.dtos.LimpiarDto;
import com.lopez.app.jpa.dtos.LimpiarHeramientaDTO;
import com.lopez.app.jpa.models.Detalle_limpiar;
import com.lopez.app.jpa.models.Limpiar;
import com.lopez.app.jpa.services.ILimpiar;
import com.lopez.app.jpa.services.IService;

@RestController
@RequestMapping("api/limpiar")
public class LimpiarServlet implements IControllers<Limpiar, LimpiarDto> {
    @Autowired
    private ILimpiar service;

    @Autowired
    private IService<Detalle_limpiar, DetalleLimpiarDto> detalleLimpiarService;

    @Override
    @PostMapping
    public Map<String, String> guardar(@RequestBody LimpiarDto dto) {
        service.save(dto);
        Map<String, String> response = new HashMap<>();
        response.put("msg", "Limpiar guardada");
        return response;
    }

    @Override
    @GetMapping
    public List<Limpiar> findAll() {
        return service.findAll();
    }

    @Override
    @GetMapping("/{id}")
    public Limpiar findById(@PathVariable(name = "id") Long id) {
        return service.findById(id).get();
    }

    @Override
    @DeleteMapping("/{id}")
    public Map<String, String> deleteById(@PathVariable(name = "id") Long id) {
        service.deleteById(id);
        Map<String, String> response = new HashMap<>();
        response.put("msg", "Limpiar eliminada");
        return response;
    }

    @PostMapping("/seven-herramienta")
    public Map<String, String> saveSevenHerramienta(@RequestBody LimpiarHeramientaDTO dto) {
        LimpiarDto limpiarDto = new LimpiarDto();
        limpiarDto.setId_corral(dto.getId_corral());
        limpiarDto.setId_limpiador(dto.getId_limpiador());
        limpiarDto.setFecha(dto.getFecha());
        limpiarDto.setFechaFin(dto.getFechaFin());
        limpiarDto.setEstado(dto.getEstado());

        long id = service.saveReturId(limpiarDto);

        List<DetalleLimpiarDto> herramientas = dto.getHerramientas();
        for (DetalleLimpiarDto herramienta : herramientas) {
            DetalleLimpiarDto detalleLimpiar = new DetalleLimpiarDto();
            detalleLimpiar.setId_herramienta(herramienta.getId_herramienta());
            detalleLimpiar.setId_limpiador(id);
            detalleLimpiar.setFecha(LocalDateTime.now());
            detalleLimpiar.setFechaFin(LocalDateTime.now());
            detalleLimpiarService.save(detalleLimpiar);
        }
        Map<String, String> response = new HashMap<>();
        response.put("msg", "Limpiar guardada");
        return response;
    }

    @GetMapping("/actualizar/{id}")
    public Map<String, String> actualizar(@PathVariable(name = "id") Long id) {
        service.update(id);
        Map<String, String> response = new HashMap<>();
        response.put("msg", "Limpiar actualizada");
        return response;
    }

    @Override
    public Map<String, String> update(LimpiarDto dto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

}
