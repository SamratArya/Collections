package P4_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex1_HashMap {
	
	public static void main(String[] args) {
		
		Map<Integer, String> m1 = new HashMap<Integer, String>();
		m1.put(1, "Apple");
		m1.put(2, "Banana");
		m1.put(3, "Orange");
		m1.put(4, "Chickoo");
		m1.put(5, "Apple");
		m1.put(2, "Pineapple");
		
		//for traverse we have to convert using set
//		Set s1 = m1.entrySet();
//		
//		Iterator itr = s1.iterator();
//		
//		while(itr.hasNext())
//		{
//			Map.Entry entry = (Map.Entry)itr.next();
//			System.out.println(entry.getKey()+" "+entry.getValue());
//		}
		
		
		//new style
		for(Map.Entry map:m1.entrySet())
		{
			System.out.println(map.getKey()+" "+map.getValue());
		}
		
		System.out.println("Put if absent method");
		//putif absent method.....
		m1.putIfAbsent(7, "Strawbeery");
		for(Map.Entry map:m1.entrySet())
		{
			System.out.println(map.getKey()+" "+map.getValue());
		}
		
		System.out.println("Replacing the elements ");
		//replace elements
		m1.replace(2, "Pineapple", "Papaya");
		for(Map.Entry map:m1.entrySet())
		{
			System.out.println(map.getKey()+" "+map.getValue());
		}
		
	}

}
