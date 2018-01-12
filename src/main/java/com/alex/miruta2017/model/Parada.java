/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.miruta2017.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.postgis.Geometry;
import org.postgis.Point;

/**
 *
 * @author alextc6
 */
@Entity(name = "parada")
@Table(name = "parada")
public class Parada implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
//    @GeneratedValue(strategy=GenerationType.AUTO)
    @GeneratedValue
    private Long id;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "coordenada")
    private Point coordenada;
    
    @ManyToOne(cascade = CascadeType.MERGE)
    // los recorridos no son solo de las unidades de transporte, puede ser con puntos q no sean paradas
    @JoinColumn(name="Recorrido_ID", nullable = true)
    private Recorrido recorrido;
    
    public Parada(){        
    }
    
    public Parada(String nombre, Point coordenada){
        this.nombre = nombre;
        this.coordenada = coordenada;
    }

    public Long getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Point getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(Point coordenada) {
        this.coordenada = coordenada;
    }

    public Recorrido getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(Recorrido recorrido) {
        this.recorrido = recorrido;
    }
    
    @Override
    public String toString() {
        return this.coordenada.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
