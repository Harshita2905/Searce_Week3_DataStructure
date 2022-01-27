package practice;

import java.util.Hashtable;
import java.util.Map;

public class hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> hm =new Hashtable<Integer,String>();
		hm.put(1, "apple");
		hm.put(2, "ball");
		hm.put(3, "cat");
		hm.put(4, "dog");
		hm.put(5, "elephant");

		Hashtable<Integer, String> hm2 =new Hashtable<Integer,String>();
		hm2.put(1, "atharva");
		hm2.put(2, "faizan");
		hm2.put(3, "pratima");
		hm2.put(4, "sumedha");
		hm2.put(5, "vaishnavi");

		System.out.println("the elements in hash table are"+ hm);
		
		hm.put(2, "bat");
		
		
		System.out.println("the updated hash table is"+ hm);
		System.out.println("the elements in hash table2 are"+ hm2);
		
		hm2.remove(1);
		System.out.println("the updated hash table2 is"+ hm2);
		
		for(Map.Entry<Integer,String> e:hm.entrySet()) {
			System.out.println("the key are"+ e.getKey() + " "+e.getValue());
		}
		

	}

}
