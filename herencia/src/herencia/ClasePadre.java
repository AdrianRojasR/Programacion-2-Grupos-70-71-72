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
public class ClasePadre {
    
    String nombre = "Clase Padre";
      
    ClasePadre(String nombre){
    this.nombre=nombre;
    }
    
    int getNivel(){
         return 1;
    }
    
//    int getNivelhija(){
//         return 0;
//    }
}
