package P4_Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Ex6_TreeMap {
	
	public static void main(String[] args) {
		
		Map<Integer, Integer> m1 = new TreeMap<Integer, Integer>();
		m1.put(1, 105);
		m1.put(5, 125);
		m1.put(2, 165);
		m1.put(9, 123);
		m1.put(6, 198);
		
		Set set = m1.entrySet();
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry entry = (Map.Entry)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		System.out.println("Keys "+m1.keySet());
		
		System.out.println("Value "+m1.values());
		
		System.out.println("Key-value pairs "+m1.entrySet());
		
		
	}

}
