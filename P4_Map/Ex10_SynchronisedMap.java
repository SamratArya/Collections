package P4_Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex10_SynchronisedMap {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> h1 = new HashMap<Integer, String>();
		h1.put(1, "Apple");
		h1.put(2, "Mango");
		h1.put(3, "Chickoo");
		h1.put(4, "Strawberry");
		h1.put(5, "Orange");
		
		Map<Integer, String> map = Collections.synchronizedMap(h1);
		
		Set set = map.entrySet();
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry entry = (Entry) itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
