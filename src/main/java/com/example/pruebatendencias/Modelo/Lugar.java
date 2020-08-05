/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pruebatendencias.Modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author usuario
 */

@Entity
public class Lugar {
    
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_lugar;
    @ApiModelProperty(hidden = false)
    private String nombre;
    private String actividades;
    private String descripcion;
    private String imagen1;
    private String imagen2;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_direccion")
    @JsonBackReference
    private Direccion direccion;

    public long getId_lugar() {
        return id_lugar;
    }

    public void setId_lugar(long id_lugar) {
        this.id_lugar = id_lugar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getActividades() {
        return actividades;
    }

    public void setActividades(String actividades) {
        this.actividades = actividades;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
   
    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getImagen1() {
        return imagen1;
    }

    public void setImagen1(String imagen1) {
        this.imagen1 = imagen1;
    }

    public String getImagen2() {
        return imagen2;
    }

    public void setImagen2(String imagen2) {
        this.imagen2 = imagen2;
    }
    
}
