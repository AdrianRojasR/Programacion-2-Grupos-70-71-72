/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danie
 */
class NumeroRomanos {

    String convertirNumeroRomano(int num) {
        
        if (num <=3){
        return sumarI(num);
        }
        switch(num){
            case 4:return "IV";
            case 5:return "V";
            case 6:return "VI";
    
        }
      return null; 
    }
    private String sumarI(int numero){
    String resultado ="";
        for (int i = 1; i <=numero; i++) {
          resultado +="I";
            
        }
        return resultado;
    }
    
}
