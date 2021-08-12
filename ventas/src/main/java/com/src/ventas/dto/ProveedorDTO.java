/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.src.ventas.dto;

/**
 *
 * @author danie
 */
public class ProveedorDTO extends PersonaDTO{
    
    private String rut;
    private String actividadComercial;

    public ProveedorDTO(String rut, String actividadComercial, String nombre, String apellidos, int documento, String direccion, int telefono, String ciudad, String email) {
        super(nombre, apellidos, documento, direccion, telefono, ciudad, email);
        this.rut = rut;
        this.actividadComercial = actividadComercial;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getActividadComercial() {
        return actividadComercial;
    }

    public void setActividadComercial(String actividadComercial) {
        this.actividadComercial = actividadComercial;
    }

  
    
    
    
}
