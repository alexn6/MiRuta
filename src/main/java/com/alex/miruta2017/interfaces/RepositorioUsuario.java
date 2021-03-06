/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.miruta2017.interfaces;

import com.alex.miruta2017.model.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author alextc6
 */
//public interface RepositorioUsuario extends JpaRepository<Usuario, Long>{
public interface RepositorioUsuario extends CrudRepository<Usuario, Long>{
    // los metodos de busqueda deben ser iguales a la propiedad que se busca (finByNombre busca la prop "nombre")
    Optional<Usuario> findByNombre(String nombre);
}
