package clases;


import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danie
 */
public class ServicioValidacion {
    
    private List<Validacion> listaDocumento = new ArrayList<Validacion>();
    
    public void addDocumento(Validacion documento){
    listaDocumento.add(documento);
    }
    
    public void validar(){
    
        for (Validacion documento : listaDocumento) {
            documento.validar();
        }
    }
    
}
