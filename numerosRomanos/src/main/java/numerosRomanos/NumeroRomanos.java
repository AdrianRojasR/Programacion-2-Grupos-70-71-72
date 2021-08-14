package numerosRomanos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danie
 */
public class NumeroRomanos {

    public String convertirNumeroRomano(Integer num) {
        
      char[] charnum = num.toString().toCharArray();
      
      if(charnum.length>=2){
      String unidad = pasarUnidad(Character.getNumericValue(charnum[1]));
      String decena = pasarDecena(Character.getNumericValue(charnum[0]));
      return decena + unidad;
      }
      if(charnum.length>=1){
      return pasarUnidad(Character.getNumericValue(charnum[0]));
      }
      return null; 
    }
//    private String sumarI(int numero){
//    String resultado ="";
//        for (int i = 1; i <=numero; i++) {
//          resultado +="I";
//            
//        }
//        return resultado;
//    }
//    
//    private String sumarV(int numero){
//    String resultado ="V";
//        for (int i = 6; i <=numero; i++) {
//          resultado +="I";
//            
//        }
//        return resultado;
//    }
    
    private String sumarI(int ini, int num, String romano){
        for (int i = ini; i <=num; i++) {
          romano +="I";
        }
        return romano;
    }
    
    private String pasarUnidad(int numero  ){
        switch(numero){
          case 4: return "IV";
          case 9: return "IX";      
        }
        if(numero<=3) return sumarI(1, numero, "");
        if(numero<=8) return sumarI(6, numero, "V");

        return null;
    }
    
    private String pasarDecena(int numero){
        switch(numero){
          case 1: return "X";
          case 2: return "XX";
          case 3: return "XXX";
          case 4: return "XL";
          case 5: return "L";
          case 6: return "LX";
          case 7: return "LXX";
          case 8: return "LXXX";
          case 9: return "XC";
        }
    return null;
    }
    
    
}
