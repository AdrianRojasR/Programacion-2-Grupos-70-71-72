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
public class ClaseHijaN2 extends ClaseHijaN1{
    
    String nombre = "Clase hija nivel tres";

    public ClaseHijaN2(String nombre) {
        super(nombre);
    }

    @Override
    int getNivel(){
         return 3;
    }
    int getNivel(int numero){
         return numero;
    }
    
//    int getNivelhija2(){
//         return 3;
//    }
    
}
