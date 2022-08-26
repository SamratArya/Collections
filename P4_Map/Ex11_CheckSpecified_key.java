package P4_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex11_CheckSpecified_key {
	
	//Write a Java program to test if a map contains a mapping for the specified key. 
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> h1 = new HashMap<String, Integer>();
		h1.put("Red", 1);
		h1.put("Blue", 2);
		h1.put("White", 3);
		h1.put("Green", 4);
		h1.put("Voilet", 5);
		
		System.out.println("These is your hashmap");
		
		Set set = h1.entrySet();
		
		System.out.println("SET VALUES : "+set);
		
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry = (Entry) itr.next();
			System.out.println(entry.getKey()+ " "+entry.getValue());
		}
		
		//check the specified key
		if(h1.containsKey("Green"))
		{
			System.out.println("Value is there and key is : "+h1.get("Green"));
		}
		else
		{
			System.out.println("Value is not there ");
		}
		
	}

}
