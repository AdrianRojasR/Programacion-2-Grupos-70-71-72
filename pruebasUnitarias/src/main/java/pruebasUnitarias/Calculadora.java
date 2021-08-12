/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasUnitarias;


/**
 *
 * @author danie
 */
public class Calculadora {
    
    double resultado;

    public Calculadora() {
        resultado=6.0;
    }
    
    
    
    public double cuadrado(double numero){
    resultado=-numero*numero;
        return resultado;
    }
    
    public double cubo(double numero){
     resultado= cuadrado(numero)*numero;
        return resultado;
    }
    
}
