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
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClasePadre cpadre = new ClaseHijaN2("Nuevo nombre");
        
        System.out.println(cpadre.nombre);
        System.out.println(cpadre.getNivel());
//        System.out.println(cpadre.getNivel(1000));
//        System.out.println(cpadre.getNivelhija());
//        System.out.println(cpadre.getNivelhija2());
    }
    
}
