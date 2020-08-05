/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pruebatendencias.Controlador;

import com.example.pruebatendencias.Modelo.Lugar;
import com.example.pruebatendencias.Repository.LugarRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
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
@RequestMapping("lugar")
public class LugarRest {
    
     @Autowired
    LugarRepository lugarrepository;

    @GetMapping("")
    @CrossOrigin
    public List<Lugar> listar() {
        return this.lugarrepository.findAll();
    }

    @PostMapping("")
    @CrossOrigin
    public Lugar guardar(@RequestBody Lugar e) {
        return this.lugarrepository.save(e);
    }

    @GetMapping("/{idLugar}")
    @CrossOrigin
    public Lugar recuperar(@PathVariable Long idLugar) {
        return this.lugarrepository.findById(idLugar).get();
    }

    @DeleteMapping("/{idLugar}")
    @CrossOrigin
    public void eliminar(@PathVariable Long idLugar) {
        this.lugarrepository.deleteById(idLugar);
    }

    
}
