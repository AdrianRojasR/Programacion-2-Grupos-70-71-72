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
public class DetalleFacturaDTO {
    
   private ArticuloDTO articulo;
   private FacturaDTO codigoFactura;
   private int Cantidad;
   private double iva;
   private double descuento;
   private double precioVenta;

    public DetalleFacturaDTO(ArticuloDTO articulo, FacturaDTO codigoFactura, int Cantidad, double iva, double descuento, double precioVenta) {
        this.articulo = articulo;
        this.codigoFactura = codigoFactura;
        this.Cantidad = Cantidad;
        this.iva = iva;
        this.descuento = descuento;
        this.precioVenta = precioVenta;
    }

    public ArticuloDTO getArticulo() {
        return articulo;
    }

    public void setArticulo(ArticuloDTO articulo) {
        this.articulo = articulo;
    }

    public FacturaDTO getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(FacturaDTO codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
   
   
    
}
