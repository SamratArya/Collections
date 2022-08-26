package P4_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ex3_SortedByKey_HashMap {
	
	public static void main(String[] args) {
		
		Map<Integer, String> m1 = new HashMap<Integer, String>();
		m1.put(1, "Apple");
		m1.put(5, "Mango");
		m1.put(2, "Pineapple");
		m1.put(4, "Chickoo");
		m1.put(6, "Banana");
		
		System.out.println("Before sorthing the elements");
		
		Set set = m1.entrySet();
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		System.out.println("After sorting the elements by using key");
		
		TreeMap<Integer, String> t1 = new TreeMap<Integer, String>(m1);
		
		Set set2 = t1.entrySet();
		
		Iterator itr2 = set2.iterator();
		
		while(itr2.hasNext())
		{
			Map.Entry entry = (Map.Entry) itr2.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
	}

}
