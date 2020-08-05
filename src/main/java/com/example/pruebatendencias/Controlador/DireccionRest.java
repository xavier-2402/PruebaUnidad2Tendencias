/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pruebatendencias.Controlador;

import com.example.pruebatendencias.Modelo.Direccion;
import com.example.pruebatendencias.Repository.DireccionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author usuario
 */
@RestController
@RequestMapping("direccion")
public class DireccionRest {
    
     @Autowired
     DireccionRepository direccionrepository;
     
      @GetMapping("")
    @CrossOrigin
    public List<Direccion> listar() {
        return this.direccionrepository.findAll();
    }

    @PostMapping("")
    @CrossOrigin
    public Direccion guardar(@RequestBody Direccion d) {
        return this.direccionrepository.save(d);
    }

    @GetMapping("/{idDireccion}")
    @CrossOrigin
    public Direccion recuperar(@PathVariable Long idDireccion) {
        return this.direccionrepository.findById(idDireccion).get();
    }
    
}
