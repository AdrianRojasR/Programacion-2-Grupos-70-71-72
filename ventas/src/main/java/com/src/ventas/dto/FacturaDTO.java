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
public class FacturaDTO {
    
    private int codigo;
    private String vendedor;
    private Date fecha;
    private String idCliente;
    public FacturaDTO(){}
    public FacturaDTO(int codigo, String vendedor, Date fecha, String idCliente) {
        this.codigo = codigo;
        this.vendedor = vendedor;
        this.fecha = fecha;
        this.idCliente = idCliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }
    
    
}
