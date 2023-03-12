package com.portfolio.maximilianofigueroa.controller;


import com.portfolio.maximilianofigueroa.model.Proyecto;
import com.portfolio.maximilianofigueroa.service.ProyectoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proyecto")
public class ProyectoController {
    private final ProyectoService proyectoService;

    public ProyectoController(ProyectoService proyectoService) {
        this.proyectoService = proyectoService;
    }

    @GetMapping("/id/{id}")
    @ResponseBody
    public Proyecto buscarProyecto(@PathVariable("id") Long id) {
        return proyectoService.buscarProyecto(id);
    }

    @GetMapping("/ver")
    @ResponseBody
    public List<Proyecto> verProyectos() {
        return proyectoService.verProyectos();
    }

    @PostMapping("/agregar")
    public void agregarProyecto(@RequestBody Proyecto proyecto) {
        proyectoService.agregarProyecto(proyecto);
    }

    @PutMapping("/editar")
    public void editarProyecto(@RequestBody Proyecto proyecto) {
        proyectoService.editarProyecto(proyecto);
    }

    @DeleteMapping("/borrar/{id}")
    public void borrarProyecto(@PathVariable("id") Long id) {
        proyectoService.borrarProyecto(id);
    }
}
