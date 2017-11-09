/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.miruta2017.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
//import javax.validation.constraints.NotNull;

/**
 *
 * @author alextc6
 */
@Entity
public class Usuario implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private long id;

    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "pass")
    private String pass;
    
    @Column(name = "mail")
    private String mail;
    
    public Usuario(){
        
    }
    
    public Usuario(String nombre, String pass, String mail){
        this.nombre = nombre;
        this.pass = pass;
        this.mail = mail;
    }

    public long getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", mail=" + mail + '}';
    }
    
    
}
