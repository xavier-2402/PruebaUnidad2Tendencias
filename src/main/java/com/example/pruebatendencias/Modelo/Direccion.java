/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pruebatendencias.Modelo;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author usuario
 */

@Entity 
@Table(name = "direccion")
public class Direccion {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
      @Column(name = "id_direccion")
    private long id_direccion;
    private String pais;
    private String provincia;
    private String ciudad;
    private String parroquia;
    
    @OneToOne(mappedBy = "direccion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference
    private Lugar lugar;
    
    public long getId_direccion() {
        return id_direccion;
    }

    public void setId_direccion(long id_direccion) {
        this.id_direccion = id_direccion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getParroquia() {
        return parroquia;
    }

    public void setParroquia(String parroquia) {
        this.parroquia = parroquia;
    }
    

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }
    
    
}
