/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author danie
 */
public class NumeroRomanosTest {
    
    NumeroRomanos numeroRomano = new NumeroRomanos();
    
    public NumeroRomanosTest() {
    }
    
    @Test
    public void convertirIRomanoTest(){
    
    String numRomano = numeroRomano.convertirNumeroRomano(1);
     assertEquals("I", numRomano);
    }
    
    @Test
    public void convertir2romano(){
    String numRomano = numeroRomano.convertirNumeroRomano(2);
     assertEquals("II", numRomano);
    
    }
     @Test
    public void convertir3romano(){
    String numRomano = numeroRomano.convertirNumeroRomano(3);
     assertEquals("III", numRomano);
    }
    @Test
    public void convertir4romano(){
    String numRomano = numeroRomano.convertirNumeroRomano(4);
     assertEquals("IV", numRomano);
    }
    @Test
    public void convertir5romano(){
    String numRomano = numeroRomano.convertirNumeroRomano(5);
     assertEquals("V", numRomano);
    }
    @Test
    public void convertir6romano(){
    String numRomano = numeroRomano.convertirNumeroRomano(6);
     assertEquals("VI", numRomano);
    }
}
