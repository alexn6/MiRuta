/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.miruta2017.interfaces;

import com.alex.miruta2017.model.PuntoInteres;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author alextc6
 */
public interface RepositorioPtoInteres extends CrudRepository<PuntoInteres, Long>{
    Optional<PuntoInteres> findByNombre(String nombre);
}
