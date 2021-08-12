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
public class CategoriaDTO {
    
    private int codigo;
    private String nombre;
    private String descripcion;
    private ImpuestoDTO impuesto;

    public CategoriaDTO(int codigo, String nombre, String descripcion, ImpuestoDTO impuesto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.impuesto = impuesto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ImpuestoDTO getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(ImpuestoDTO impuesto) {
        this.impuesto = impuesto;
    }
    
    
    
}
