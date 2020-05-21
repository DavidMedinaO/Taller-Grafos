/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 *
 * @author samaniw
 */
public class Maps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(3, "A");
        map1.put(2, "B");
        map1.put(7, "C");
        map1.put(1, "D");
        map1.put(4, "E");
        map1.put(8, "F");
        map1.put(21, "G");
        map1.put(19, "H");
        map1.put(5, "I");
        map1.put(59, "H");
        map1.put(29, "Z");
        map1.put(5, "X");

        System.out.println("llaves del mapa 1: HashMap");
        System.out.println(map1.keySet().toString());

        LinkedHashMap<Integer, String> map2 = new LinkedHashMap<Integer, String>();
        map2.put(3, "A");
        map2.put(2, "B");
        map2.put(7, "C");
        map2.put(1, "D");
        map2.put(4, "E");
        map2.put(8, "F");
        map2.put(21, "G");
        map2.put(19, "H");
        map2.put(5, "I");
        map2.put(59, "H");
        map2.put(29, "Z");
        map2.put(5, "X");

        System.out.println("llaves del mapa 2: LinkedHashMap");
        System.out.println(map2.keySet().toString());

        TreeMap<Integer, String> map3 = new TreeMap<Integer, String>();
        map3.put(3, "A");
        map3.put(2, "B");
        map3.put(7, "C");
        map3.put(1, "D");
        map3.put(4, "E");
        map3.put(8, "F");
        map3.put(21, "G");
        map3.put(19, "H");
        map3.put(5, "I");
        map3.put(59, "H");
        map3.put(29, "Z");
        map3.put(5, "X");

        System.out.println("llaves del mapa 3: TreeMap");
        System.out.println(map3.keySet().toString());

        for (Integer k : map3.keySet()) {
            System.out.println(k + ":" + map3.get(k));
        }

        Iterator it = map3.keySet().iterator();
        while (it.hasNext()) {
            Integer k = (Integer) it.next();
            System.out.println(k + ":" + map3.get(k));
        }

    }

}
