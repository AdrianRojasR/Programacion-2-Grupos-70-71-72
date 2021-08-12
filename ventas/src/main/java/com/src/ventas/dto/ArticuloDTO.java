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
public class ArticuloDTO {
    
    private int codigo;
    private double precioVenta;
    private double costoArticulo;
    private int existencia;
    private String nombre;
    private String descripcion;
    private CategoriaDTO categoria;
    private String estado;

    public ArticuloDTO(int codigo, double precioVenta, double costoArticulo, int existencia, String nombre, String descripcion, CategoriaDTO categoria, String estado) {
        this.codigo = codigo;
        this.precioVenta = precioVenta;
        this.costoArticulo = costoArticulo;
        this.existencia = existencia;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getCostoArticulo() {
        return costoArticulo;
    }

    public void setCostoArticulo(double costoArticulo) {
        this.costoArticulo = costoArticulo;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
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

    public CategoriaDTO getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaDTO categoria) {
        this.categoria = categoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
