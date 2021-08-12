/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasUnitarias;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author danie
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    @Test
    public void testSomeMethod() {
    }
    
    @Test
    public void testCuadrado(){
    Calculadora calculadora = new Calculadora();
        assertEquals(25.0, calculadora.cuadrado(5.0),0.00000001);
    }
    
    @Test
    public void testCubonegativo(){
    Calculadora calculadora = new Calculadora();
        assertEquals(-27.0, calculadora.cubo(-3.0),0.00000001);
    
    }
    @Test
    public void testvalidarConstante(){
    Calculadora calculadora = new Calculadora();
        assertEquals(6.0, calculadora.resultado,0.00000001);
    }
    
}
