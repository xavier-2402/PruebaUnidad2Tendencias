/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pruebatendencias.Controlador;

import com.example.pruebatendencias.Modelo.Usuario;
import com.example.pruebatendencias.Repository.UsuarioRepository;
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
@RequestMapping("usuario")
public class UsuarioRest {
    
     @Autowired
    UsuarioRepository usuariorepository;
    
     @GetMapping("")
    @CrossOrigin
    public List<Usuario> listar() {
        return this.usuariorepository.findAll();
    }
    @PostMapping("")
	@CrossOrigin
	public Usuario guardar( @RequestBody Usuario e) {
		return this.usuariorepository.save(e);
	}
    
         @GetMapping("/{idUsuario}")
    @CrossOrigin
    public Usuario recuperar(@PathVariable Long idUsuario) {
        return this.usuariorepository.findById(idUsuario).get();
    }
    
     @PostMapping("/login")
    @CrossOrigin
    public Usuario login(@RequestBody Usuario usuario) {
        return this.usuariorepository.finByCorreoAndPassword(usuario.getCorreo(), usuario.getPassword());
    }

}
