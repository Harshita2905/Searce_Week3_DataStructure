
//Performing simple Operations like adding elements, chaging elements,
// removing elements, traversing hashtable
package practice;

import java.util.Hashtable;
import java.util.Map;

class Hashtable1{


    public static void main(String[] args) {
        Hashtable<String, Integer> ht= new Hashtable<>();

        //Adding elements to hashtable
        ht.put("Harshita", 10);
        ht.put("Ankita", 30);
        ht.put("Pranita", 50);
        ht.put("Shrineeta", 60);
        ht.put("Sae", 80);

        //printing size of hashtable
        System.out.println("size of hashtable: "+ht.size());
        //displaying all elements
        System.out.println(ht);

        //updateing map
        ht.put("Ankita", 70);
        System.out.println();

        System.out.println("updated map :"+ht);
        System.out.println();

        //removing element
        ht.remove("Harshita");
        System.out.println();
        //displaying only values
        System.out.println(ht.values());

        //traversing using enhanced for loop
        for(Map.Entry<String,Integer> E : ht.entrySet())
            System.out.println(E.getKey() + " " + E.getValue());


    }

}