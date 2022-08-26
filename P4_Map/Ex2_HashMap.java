package P4_Map;

import java.util.HashMap;
import java.util.Map;

public class Ex2_HashMap {
	
	public static void main(String[] args) {
		
		Map<Integer, Students> m1 = new HashMap<Integer, Students>();
		
		Students s1 = new Students("Amit", "Mumbai", 25);
		Students s2 = new Students("Rahul", "Nashik", 22);
		Students s3 = new Students("Amarkant", "Pune", 28);
		
		m1.put(1, s1);
		m1.put(2, s2);
		m1.put(3, s3);
		
		for(Map.Entry<Integer, Students> entry:m1.entrySet())
		{
			int key = entry.getKey();
			Students st = entry.getValue();
			System.out.println(key+" ");
			System.out.println(st.name+" "+st.address+" "+st.age);
		}
		
	}
	

}
