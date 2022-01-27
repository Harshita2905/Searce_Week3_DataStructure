package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IterateHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> ht = new HashMap<>();
		
		ht.put(1,"mayur");
		ht.put(2, "mangesh");
		ht.put(3,"atharva");
		//1.Iterator through a HashMap EntrySet using Iterator
		/* Iterator<Entry<Integer,String>> iterator = ht.entrySet().iterator();
		 while(iterator.hasNext()) {
			 Entry<Integer,String> entry = iterator.next();
			 System.out.println("the keys are"+ entry.getKey());
			System.out.println("the value are"+entry.getValue());
			
		//2. Iterator through HashMap KeySet using Iterator	
	*/ 
	/*	Iterator<Integer> iterator = ht.keySet().iterator();
		while(iterator.hasNext()) {
			Integer key= iterator.next();
			System.out.println("the key are"+ (key));
			System.out.println("the value are"+ ht.get(key));
		*/
		// 3. Iterate HashMap using for-each loop
	/*		for(Map.Entry<Integer,String> entry:ht.entrySet()) {
				
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
	*/

		//Iterating through a HashMap using Lambda Experssions
		/*ht.forEach((key,value) ->{ 
			System.out.println(key);
			System.out.println(value);
		});
	*/
		
		//Loop through a HashMap using Stream API
		ht.entrySet().stream().forEach((entry)->{
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		
		});
		
	}	

};
