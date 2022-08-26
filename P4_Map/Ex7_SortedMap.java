package P4_Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Ex7_SortedMap {
	
	public static void main(String[] args) {
		
		SortedMap<Integer, Integer> s1 = new TreeMap<Integer, Integer>();
		s1.put(1, 105);
		s1.put(5, 125);
		s1.put(2, 165);
		s1.put(9, 123);
		s1.put(6, 198);
		
		Set set = s1.entrySet();
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry entry = (Map.Entry)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		System.out.println("Head Map element "+s1.headMap(5));
		
		System.out.println("Tail Map element "+s1.tailMap(5));

		System.out.println("sub map element "+s1.subMap(2, 6));

	}

}
