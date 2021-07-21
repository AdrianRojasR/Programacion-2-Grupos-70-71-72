/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlflujo;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Ejemplo {
    Scanner teclado;
    String[] estudiantes;
    int notas[][];
    double promedios[];
     String miArray2[]= {"uno","dos","tres"};
     
  Ejemplo(){
  }

  
  public void cargaTeclado(){
   teclado = new Scanner(System.in);
   estudiantes = new String[4];
   notas = new int[4][3]; //[filas][columnas]
   
      for (int i = 0; i < estudiantes.length; i++) {
          System.out.println("Ingrese el nombre del estudiante: ");
          estudiantes[i]=teclado.next();
          for (int j = 0; j < notas[i].length; j++) {
              System.out.println("ingrese nota: ");
              notas[i][j] = teclado.nextInt();
              //notas[i][j] = Integer.parseInt(teclado.next());
              
           } 
          }
      }
  
  public void calcularPromedio(){
  
      promedios = new double[4];
      for (int i = 0; i < notas.length; i++) {
          double promedio=0;
          int suma=0;
          for (int j = 0; j < notas[i].length; j++) {
             suma = suma +notas[i][j];
          }
          promedio = (double) suma/notas[i].length;
          promedios[i] =promedio;
      }
  }
  
  public void imprimir(){
      for (int i = 0; i < estudiantes.length; i++) {
          System.out.println("Estudiante: "+estudiantes[i] + "  Nota: "+ promedios[i]);
          
      }
  }
  public int suma(int a, int b){
      return a+b;
  }
  
  public double pi(){
      return 3.1416;
  }
  
    public static void main (String[] arg){
        Ejemplo ejemplo = new Ejemplo();
        ejemplo.cargaTeclado();
        ejemplo.calcularPromedio();
        ejemplo.imprimir();
        //System.out.println(ejemplo.suma(123, 245));
        //System.out.println(ejemplo.pi());
        
        
        

    }
}
