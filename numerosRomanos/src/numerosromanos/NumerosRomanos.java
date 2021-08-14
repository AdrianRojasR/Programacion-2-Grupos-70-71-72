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

    public String convertirRomanos(Integer num) {

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
//        switch (num) {
//            case 4:
//                return "IV";
//            case 9:
//                return "IX";
//        }
//        if (num <= 3) {
//            return sumarI(num);
//        }
//        if (num <= 8) {
//            return sumarIvalorV(num);
//        }
//        return null;
//----------------------------------------
//        switch (num) {
//            case 4:
//                return "IV";
//            case 9:
//                return "IX";
//            case 10:
//                return "X";
//            case 11:
//                return "XI";
//            case 12:
//                return "XII";
//            case 13:
//                return "XIII";
//            case 14:
//                return "XIV";
//            case 15:
//                return "XV";
//            case 16:
//                return "XVI";
//            case 17:
//                return "XVII";
//            case 18:
//                return "XVIII";
//            case 19:
//                return "XIX";
//            case 20:
//                return "XX";
//                
//        }
//        if (num <= 3) {
//            return sumarI(1,num,"");
//        }
//        if (num <= 8) {
//            return sumarI(6,num,"V");
//        }
//        return null;
//--------------------------------------
        char[] charnum = num.toString().toCharArray();

        if (charnum.length >= 2) {
            String numUnidad = pasarUnidad(Character.getNumericValue(charnum[1]));
            String numdecena = pasarDecena(Character.getNumericValue(charnum[0]));
            return numdecena + numUnidad;
        }
        if (charnum.length >= 1) {
            return pasarUnidad(Character.getNumericValue(charnum[0]));
        }

        return null;

    }


    private String sumarI(int numero) {
        String resultado = "";
        for (int i = 1; i <= numero; i++) {
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

    private String sumarI(int inicio, int num, String numRomano) {
        for (int i = inicio; i <= num; i++) {
            numRomano += "I";
        }
        return numRomano;
    }

    private String pasarUnidad(int numericValue) {
        switch (numericValue) {
            case 4:
                return "IV";
            case 9:
                return "IX";
        }
        if (numericValue <= 3) {
            return sumarI(1, numericValue, "");
        }
        if (numericValue <= 8) {
            return sumarI(6, numericValue, "V");
        }
        return null;
    }
//PRIMERA VERSIÓN 
    private String pasarDecena(int numericValue) {
        switch (numericValue) {
            case 1:
                return "X";
            case 2:
                return "XX";
        }
        return null;
    }
    //SEGUNDA vERSION 
     private String pasarDecena2(int numericValue) {
        switch (numericValue) {
            case 1:
                return "X";
            case 2:
                return "XX";
            case 3:
                return "XXX";
            case 4:
                return "XL";
            case 5:
                return "L";
            case 6:
                return "LX";
            case 7:
                return "LXX";
            case 8:
                return "LXXX";
            case 9:
                return "XC";
        }
        return null;
    }
}
