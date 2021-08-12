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
public class ClienteDTO extends PersonaDTO{
    
    public ClienteDTO(String nombre, String apellidos, int documento, String direccion, int telefono, String ciudad, String email) {
        super(nombre, apellidos, documento, direccion, telefono, ciudad, email);
    }
    
}
