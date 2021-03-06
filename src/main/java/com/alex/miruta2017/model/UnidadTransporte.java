/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alex.miruta2017.model;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


/**
 *
 * @author alextc6
 */
@Entity(name = "unidadtransporte")
@Table(name = "unidadtransporte")
public class UnidadTransporte implements Serializable{
    
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "Recorrido_ID", nullable = true)
    private Recorrido recorrido;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Empresa_ID", nullable = false)
    private Empresa empresa;
    
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
//    @GeneratedValue(strategy=GenerationType.AUTO)
    @GeneratedValue
    private Long id;
    
    @Column(name = "nombre")
    private String nombre;
    
//    @Column(name = "horaInicio")
    @Column(name = "horainicio")
    private LocalTime horaInicio;
    
//    @Column(name = "horaFin")
    @Column(name = "horafin")
    private LocalTime horaFin;
    
    @Column(name = "frecuencia")
    private String frecuencia;
    
//    @Column(name = "precioBoleto")
    @Column(name = "precioboleto")
    private String precioBoleto;
    
    public UnidadTransporte(){        
    }
    
    public UnidadTransporte(String nombre, LocalTime horaInicio, LocalTime horaFin, String frecuenacia, String precioBoleto, Empresa empresa){
        this.nombre = nombre;
        this.empresa = empresa;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.frecuencia = frecuenacia;
        this.precioBoleto = precioBoleto;
        // se p
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

    public Recorrido getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(Recorrido recorrido) {
        this.recorrido = recorrido;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getPrecioBoleto() {
        return precioBoleto;
    }

    public void setPrecioBoleto(String precioBoleto) {
        this.precioBoleto = precioBoleto;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
    @Override
    public String toString() {
        return nombre + "\n horaInicio=" + horaInicio + "\n horaFin=" + horaFin + "\n frecuencia=" + frecuencia + "\n precioBoleto=" + precioBoleto;
    }
    
    
}
