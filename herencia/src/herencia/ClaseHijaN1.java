/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author danie
 */
public class ClaseHijaN1 extends ClasePadre{
    
    String nombre = "Clase hija nivel dos";

    public ClaseHijaN1(String nombre) {
        super(nombre);
    }

    
    @Override
    int getNivel(){
         return 2;
    }
    
}
