package com.portfolio.maximilianofigueroa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "habilidad")
public class Habilidad implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idHabilidad;

    @Column(name = "titulo")
    private String tituloHabilidad;

    @Column(name = "porcentaje")
    private Integer porcentajeHabilidad;

    @Column(name = "imagen")
    private String imagenHabilidad;
}