package controlflujo; 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Matriz {
    private Scanner teclado;
    private String[] estudiantes;
    private String[] estudiantesE = {"Pedro","Lina","Andres","Diana"};
    private int[][] notas;
    private int[][] notasE ={{5,2,3},{1,4,4},{2,1,3},{3,5,5}};
    private double[] promedios;
    
    public void iniciar(){
         Matriz m=new Matriz();
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("ingresar Valor, 1 cargue por teclado, 2 valores por defecto ");
            int opcion = Integer.parseInt(in.readLine());
            switch(opcion){
                case 1:
                    m.cargarTeclado();
                    break;
                case 2:
                    m.cargar();
                    break;
                default :
                     System.out.println("valor invalido.");
                     m.iniciar();
                 break;   
            }
        } catch (IOException ex) {
            Logger.getLogger(Matriz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cargarTeclado() {
        teclado=new Scanner(System.in);
        estudiantes=new String[4];
        notas=new int[4][3];//int[filas][columnas]
        for(int f=0;f<estudiantes.length;f++){
            System.out.print("Ingrese el nombre del estudiante:");
            estudiantes[f]=teclado.next();
            for(int c=0;c<notas[f].length;c++) {
                System.out.print("Ingrese nota:");
                notas[f][c]=teclado.nextInt();
            }
        }
    }
    public void cargar(){
        estudiantes = new String[4];
        notas=new int[4][3];
        for (int i = 0; i < estudiantesE.length; i++) {
             estudiantes[i] = estudiantesE[i];
             for (int j = 0; j < notas[i].length; j++) {
                 notas[i][j] = notasE[i][j];
            }
            
        }
    }
    
    public void calcularPromedios() {
    	promedios=new double[4];
        for(int f=0;f<notas.length;f++) {
          int suma=0;
          for(int c=0;c<notas[f].length;c++) {
              suma=suma+notas[f][c];
          }
          promedios[f]= (double) suma/notas[f].length;
        }
    }
    
    public void imprimir() {
        for(int f=0;f<promedios.length;f++) {
            System.out.println(estudiantes[f]+" - "+promedios[f]);
        }
    }
    
    public void estudianteMayorPromedio() {
        double may=promedios[0];
        String nom=estudiantes[0];
        for(int f=0;f<promedios.length;f++) {
            if (promedios[f]>may) {
                may=promedios[f];
                nom=estudiantes[f];
            }
        }
        System.out.println("El estudiante con mayor promedio: "+ nom + " promedio: "+may);
    }
    
    public static void main(String[] ar){
        Matriz ma=new Matriz();
        ma.iniciar();
        ma.calcularPromedios();
        ma.imprimir();
        ma.estudianteMayorPromedio();
    }
}