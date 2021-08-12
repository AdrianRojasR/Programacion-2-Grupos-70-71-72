/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.src.ventas.dto;

import java.util.Date;

/**
 *
 * @author danie
 */
public class DevolucionDTO {
   
    private int codigo;
    private int codigoFactura;
    private int codigoArticulo;
    private Date fecha;
    private String motivo;
    private int cantidad;

    public DevolucionDTO(int codigo, int codigoFactura, int codigoArticulo, Date fecha, String motivo, int cantidad) {
        this.codigo = codigo;
        this.codigoFactura = codigoFactura;
        this.codigoArticulo = codigoArticulo;
        this.fecha = fecha;
        this.motivo = motivo;
        this.cantidad = cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(int codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public int getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(int codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
   
    
}
