/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

/**
 *
 * @author danie
 */
public class Variables {

    
    public static void main(String[] args) {
       byte bit =23;
       byte bit2 = -22;
       
        System.out.println("suma de bytes: " + (bit + bit2));
        System.out.println("suma de bytes: " + bit + bit2);
        
        int a = 5;
        int b = 3;
        int res_int;
        double res_double;
        float res_float;
        
        int c = a * b++;   // posfix
        int d = a * ++b;   // prefix
        System.out.println("c:"+ c);
        System.out.println("d:"+ d);
        System.out.println(11%4);
         double valor1=550;
         double valor2=7;
        res_double=valor2/valor1;
        res_float=(float)22/3;
        System.out.println(res_double);
        System.out.println(res_float);
        
    }
    
}
