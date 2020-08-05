/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pruebatendencias.Repository;

import com.example.pruebatendencias.Modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author usuario
 */
public interface UsuarioRepository extends JpaRepository<Usuario,Long>{
     @Query("select u from Usuario u where u.correo = :correo and  u.password = :password")
    Usuario finByCorreoAndPassword(String correo, String password);
}
