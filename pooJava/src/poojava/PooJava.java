/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poojava;

import java.util.List;

/**
 *
 * @author danie
 */
public class PooJava {
    
    List<Cuenta> listacuentas;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta cuentaAhorros = new Cuenta(TipoCuenta.AHORROS, 123, "Pepito", 0);
        Cuenta cuentaCorriente = new Cuenta(TipoCuenta.CORRIENTE, 456,"Maria, rojas", 100000);
        
    
        System.out.println("nombre de la cuenta: "+ cuentaAhorros.obtenerNombre() + " Saldo: "+ cuentaAhorros.getSaldo());
        System.out.println("nombre de la cuenta: "+ cuentaCorriente.obtenerNombre() + " Saldo: "+ cuentaCorriente.getSaldo());
    
        cuentaAhorros.depositar(50000);
        cuentaCorriente.retirar(55000);
        
        System.out.println("nombre de la cuenta: "+ cuentaAhorros.obtenerNombre() + " Saldo: "+ cuentaAhorros.getSaldo());
        System.out.println("nombre de la cuenta: "+ cuentaCorriente.obtenerNombre() + " Saldo: "+ cuentaCorriente.getSaldo());
    }
    
}
