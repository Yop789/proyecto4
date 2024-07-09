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

import com.lopez.app.jpa.dtos.AlimentarDto;
import com.lopez.app.jpa.dtos.AlimentarHerramientasDTO;
import com.lopez.app.jpa.dtos.DetalleAlimentarDto;
import com.lopez.app.jpa.models.Alimentar;
import com.lopez.app.jpa.models.Detalle_alimentar;
import com.lopez.app.jpa.services.IAlimentar;
import com.lopez.app.jpa.services.IDetalleAlimentar;
import com.lopez.app.jpa.services.IService;

@RestController
@RequestMapping("api/alimentar")
public class AlimentarServlet implements IControllers<Alimentar, AlimentarDto> {
    @Autowired
    IAlimentar iAlimentarService;

    @Autowired
    private IDetalleAlimentar detalleAlimentarService;

    @Override
    @PostMapping
    public Map<String, String> guardar(@RequestBody AlimentarDto dto) {
        iAlimentarService.save(dto);
        Map<String, String> response = new HashMap<>();
        response.put("msg", "Alimentar guardado");
        return response;
    }

    @Override
    @GetMapping
    public List<Alimentar> findAll() {
        List<Alimentar> alimentar = iAlimentarService.findAll();
        return alimentar;
    }

    @Override
    @GetMapping("/{id}")
    public Alimentar findById(@PathVariable(name = "id") Long id) {
        return iAlimentarService.findById(id).get();
    }

    @Override
    @DeleteMapping("/{id}")
    public Map<String, String> deleteById(@PathVariable(name = "id") Long id) {
        iAlimentarService.deleteById(id);
        Map<String, String> response = new HashMap<>();
        response.put("msg", "Alimentar eliminado");
        return response;
    }

    @Override
    public Map<String, String> update(@RequestBody AlimentarDto dto) {
        iAlimentarService.save(dto);
        Map<String, String> response = new HashMap<>();
        response.put("msg", "Alimentar actualizado");
        return response;
    }

    @PostMapping("/seven-herramienta")
    public Map<String, String> saveSevenHerramienta(@RequestBody AlimentarHerramientasDTO dto) {
        AlimentarDto alimentarDto = new AlimentarDto();
        alimentarDto.setId_alimentador(dto.getId_alimentador());
        alimentarDto.setId_comida(dto.getId_comida());
        alimentarDto.setCantidad(dto.getCantidad());
        alimentarDto.setId_corral(dto.getId_corral());
        alimentarDto.setFecha(dto.getFecha());
        alimentarDto.setFechaFinal(dto.getFechaFinal());
        alimentarDto.setEstado(dto.getEstado());

        long id = iAlimentarService.saveReturId(alimentarDto);

        List<DetalleAlimentarDto> herramientas = dto.getHerramientas();
        for (DetalleAlimentarDto herramienta : herramientas) {
            DetalleAlimentarDto detalleAlimentar = new DetalleAlimentarDto();
            detalleAlimentar.setId_herramienta(herramienta.getId_herramienta());
            detalleAlimentar.setId_alimetacion(id);
            detalleAlimentar.setFecha(LocalDateTime.now());
            detalleAlimentar.setFechaFin(LocalDateTime.now());
            detalleAlimentarService.save(detalleAlimentar);
        }
        Map<String, String> response = new HashMap<>();
        response.put("msg", "Alimentar guardada");
        return response;

    }

    @GetMapping("/actualizar/{id}")
    public void update(@PathVariable(name = "id") Long id) {
        iAlimentarService.update(id);
    }

}
