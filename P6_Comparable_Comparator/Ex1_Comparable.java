package P6_Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Ex1_Comparable {
	
	public static void main(String[] args) {
		
		ArrayList<Students> a1 = new ArrayList<Students>();
		a1.add(new Students("Amit", "Mumbai", 25));
		a1.add(new Students("Surya", "Pune", 23));
		a1.add(new Students("Narayan", "Nashik", 28));
		
		Iterator itr = a1.iterator();
		while(itr.hasNext())
		{
			Students st = (Students) itr.next();
			System.out.println(st.name+" "+st.address+" "+st.age);
		}
		
		System.out.println("\n"+"Reverse Order : ");
		//Reverse Order
		Collections.sort(a1, Collections.reverseOrder());
		
		for(Students st:a1)
		{
			System.out.println(st.name+" "+st.address+" "+st.age);
		}
	}

}
