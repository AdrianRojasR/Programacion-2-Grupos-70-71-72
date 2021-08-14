/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import numerosRomanos.NumeroRomanos;
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
    
    @Test
    public void pasar7Aromanos() {
        String romano = numeroRomano.convertirNumeroRomano(7);

        assertEquals(romano, "VII");
    }

    @Test
    public void pasar8Aromanos() {
        String romano = numeroRomano.convertirNumeroRomano(8);

        assertEquals(romano, "VIII");
    }

    @Test
    public void pasar9Aromanos() {
        String romano = numeroRomano.convertirNumeroRomano(9);

        assertEquals(romano, "IX");
    }

    @Test
    public void pasar10Aromanos() {
        String romano = numeroRomano.convertirNumeroRomano(10);

        assertEquals(romano, "X");
    }

    @Test
    public void pasar11Aromanos() {
        String romano = numeroRomano.convertirNumeroRomano(11);

        assertEquals(romano, "XI");
    }

    @Test
    public void pasar12Aromanos() {
        String romano = numeroRomano.convertirNumeroRomano(12);

        assertEquals(romano, "XII");
    }

    @Test
    public void pasar13Aromanos() {
        String romano = numeroRomano.convertirNumeroRomano(13);

        assertEquals(romano, "XIII");
    }

    @Test
    public void pasar14Aromanos() {
        String romano = numeroRomano.convertirNumeroRomano(14);

        assertEquals(romano, "XIV");
    }

    @Test
    public void pasar15Aromanos() {
        String romano = numeroRomano.convertirNumeroRomano(15);

        assertEquals(romano, "XV");
    }

    @Test
    public void pasar16Aromanos() {
        String romano = numeroRomano.convertirNumeroRomano(16);

        assertEquals(romano, "XVI");
    }

    @Test
    public void pasar17Aromanos() {
        String romano = numeroRomano.convertirNumeroRomano(17);

        assertEquals(romano, "XVII");
    }

    @Test
    public void pasar18Aromanos() {
        String romano = numeroRomano.convertirNumeroRomano(18);

        assertEquals(romano, "XVIII");
    }

    @Test
    public void pasar19Aromanos() {
        String romano = numeroRomano.convertirNumeroRomano(19);

        assertEquals(romano, "XIX");
    }

    @Test
    public void pasar20Aromanos() {
        String romano = numeroRomano.convertirNumeroRomano(20);

        assertEquals(romano, "XX");
    }
    
     @Test
    public void verificarDecimalesRomanos() {
        List<Integer> numerosNaturales = Arrays.asList(40, 50, 60, 70, 80, 90, 88, 67);

        List<String> romanos = numerosNaturales.stream()
                .map(number -> numeroRomano.convertirNumeroRomano(number))
                .collect(Collectors.toList());

        assertEquals(romanos.get(0), "XL");
        assertEquals(romanos.get(1), "L");
        assertEquals(romanos.get(2), "LX");
        assertEquals(romanos.get(3), "LXX");
        assertEquals(romanos.get(4), "LXXX");
        assertEquals(romanos.get(5), "XC");
        assertEquals(romanos.get(6), "LXXXVIII");
        assertEquals(romanos.get(7), "LXVII");

    }

}
