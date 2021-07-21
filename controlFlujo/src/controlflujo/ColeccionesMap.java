/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlflujo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author danie
 */
public class ColeccionesMap {
    
    public void hashmap() {
        Map<Integer, String> estudiantesMap = new HashMap<Integer, String>();

        estudiantesMap.put(3, "Pedro");
        estudiantesMap.put(5, "Pepito");
        estudiantesMap.put(1, "Lina");
        estudiantesMap.put(4, "York");
        estudiantesMap.put(2, "Pedro");
        estudiantesMap.put(6, "Pepito");
        estudiantesMap.put(9, "Lina");
        estudiantesMap.put(8, "York");
        estudiantesMap.put(7, "Pedro");
        estudiantesMap.put(11, "Pepito");
        estudiantesMap.put(24, "Lina");
        estudiantesMap.put(27, "York");

        Iterator it = estudiantesMap.keySet().iterator();
         System.out.println("-----HashMap----");
        while (it.hasNext()) {
            Integer key = (Integer) it.next();
           
            System.out.println("clave: " + key + " valor: " + estudiantesMap.get(key));
        }

    }
        public void TreeMap() {
        Map<Integer, String> estudiantesMap = new TreeMap<Integer, String>();

       estudiantesMap.put(3, "Pedro");
        estudiantesMap.put(5, "Pepito");
        estudiantesMap.put(1, "Lina");
        estudiantesMap.put(4, "York");
        estudiantesMap.put(2, "Pedro");
        estudiantesMap.put(6, "Pepito");
        estudiantesMap.put(9, "Lina");
        estudiantesMap.put(8, "York");
        estudiantesMap.put(7, "Pedro");
        estudiantesMap.put(11, "Pepito");
        estudiantesMap.put(24, "Lina");
        estudiantesMap.put(27, "York");

        Iterator it = estudiantesMap.keySet().iterator();
         System.out.println("-----TreeMap----");
        while (it.hasNext()) {
            Integer key = (Integer) it.next();
           
            System.out.println("clave: " + key + " valor: " + estudiantesMap.get(key));
        }

    }
            public void linkedHashMap() {
        Map<Integer, String> estudiantesMap = new LinkedHashMap<Integer, String>();

        estudiantesMap.put(3, "Pedro");
        estudiantesMap.put(5, "Pepito");
        estudiantesMap.put(1, "Lina");
        estudiantesMap.put(4, "York");
        estudiantesMap.put(2, "Pedro");
        estudiantesMap.put(6, "Pepito");
        estudiantesMap.put(9, "Lina");
        estudiantesMap.put(8, "York");
        estudiantesMap.put(7, "Pedro");
        estudiantesMap.put(11, "Pepito");
        estudiantesMap.put(24, "Lina");
        estudiantesMap.put(27, "York");

        Iterator it = estudiantesMap.keySet().iterator();
        System.out.println("-----LinkedHashMap----");
        while (it.hasNext()) {
            Integer key = (Integer) it.next();
            System.out.println("clave: " + key + " valor: " + estudiantesMap.get(key));
        }

    }

    
    public static void main(String[] arg){
    
     ColeccionesMap colMap = new ColeccionesMap();
     
    colMap.TreeMap();
    colMap.hashmap();
    colMap.linkedHashMap();
        //HashMap
        //TreeMap
        //LinkedHashMap
        
}
    
}
