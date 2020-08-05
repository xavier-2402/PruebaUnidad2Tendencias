/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.pruebatendencias.Repository;

import com.example.pruebatendencias.Modelo.Lugar;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author usuario
 */
public interface LugarRepository extends JpaRepository<Lugar,Long>{
    
}
