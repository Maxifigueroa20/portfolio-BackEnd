package com.portfolio.maximilianofigueroa.model;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Getter @Setter
@Entity
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProyecto;
    private String tituloProyecto;
    private String fechaProyecto;
    private String descripcionProyecto;
    private String imagenProyecto;
    private String urlProyecto;

    public Proyecto() {}

    public Proyecto(Long idProyecto, String tituloProyecto, String fechaProyecto, String descripcionProyecto, String imagenProyecto, String urlProyecto) {
        this.idProyecto = idProyecto;
        this.tituloProyecto = tituloProyecto;
        this.fechaProyecto = fechaProyecto;
        this.descripcionProyecto = descripcionProyecto;
        this.imagenProyecto = imagenProyecto;
        this.urlProyecto = urlProyecto;
    }
}
