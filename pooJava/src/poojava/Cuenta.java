/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poojava;

/**
 *
 * @author danie
 */
public class Cuenta {

    public TipoCuenta tipo;
    public int numeroCuenta;
    private String nombre;
    public double saldo;

    public Cuenta(TipoCuenta tipo, int numeroCuenta, String nombre, double saldo) {
        this.tipo = tipo;
        this.numeroCuenta = numeroCuenta;
        this.nombre = nombre;
        this.saldo = saldo;
    }
    
    public void depositar(double monto){
    saldo =+ monto;
    }
    
    public String retirar(double monto){
     String respuesta;
       if(!(saldo<monto)){
           saldo -= monto;
           respuesta ="Nuevo saldo: " + saldo;
       }else{
       respuesta= "Fondos insuficientes";
       }
    return respuesta ;
    }
    

    public String obtenerNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoCuenta getTipo() {
        return tipo;
    }

    public void setTipo(TipoCuenta tipo) {
        this.tipo = tipo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
