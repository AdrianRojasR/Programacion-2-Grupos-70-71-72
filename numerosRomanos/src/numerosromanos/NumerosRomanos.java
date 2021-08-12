/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosromanos;

/**
 *
 * @author danie
 */
public class NumerosRomanos {

    public String convertirRomanos(int num) {

//      return "I";
//----------------------
//   if (num ==1){
//   return "I";
//   }
//   if(num==3)
//       return ("III");
//   return "II";
//------------------------
//        switch (num) {
//            case 1:
//                return "I";
//            case 2:
//                return "II";
//            case 3:
//                return "III";
//            case 4:
//                return "IV";
//        }
//        return null;
//---------------------------
//if (num <=3)
//    return sumarI(num);
//        switch (num) {
//            case 4:
//                return "IV";
//            case 5:
//                return "V";
//            case 6:
//                return "VI";
//            case 7:
//                return "VII";
//            case 8:
//                return "VIII";
//
//        }
//    return null;
//--------------------------------
        switch (num) {
            case 4:
                return "IV";
            case 9:
                return "IX";
        }
        if (num <= 3) {
            return sumarI(num);
        }
        if (num <= 8) {
            return sumarIvalorV(num);
        }
        return null;

    }

    private String sumarI(int numero) {
        String resultado = "";
        for (int i = 0; i < numero; i++) {
            resultado += "I";
        }
        return resultado;
    }

    private String sumarIvalorV(int numero) {
        String resultado = "V";
        for (int i = 6; i <= numero; i++) {
            resultado += "I";
        }
        return resultado;
    }
    private String sumarIvalorV(int inicio,int num, String numRomano) {
        for (int i = inicio; i <= num; i++) {
            numRomano += "I";
        }
        return numRomano;
    }
}
