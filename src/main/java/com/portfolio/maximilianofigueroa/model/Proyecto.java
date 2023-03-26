package com.portfolio.maximilianofigueroa.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

import java.io.Serializable;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "proyecto")
public class Proyecto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idProyecto;

    @Column(name = "titulo")
    private String tituloProyecto;

    @Column(name = "fecha_inicio")
    private Integer fechaInicioProyecto;

    @Column(name = "fecha_fin")
    private Integer fechaFinProyecto;

    @Column(name = "descripcion")
    private String descripcionProyecto;

    @Column(name = "imagen")
    private String imagenProyecto;

    @Column(name = "url")
    private String urlProyecto;
}
