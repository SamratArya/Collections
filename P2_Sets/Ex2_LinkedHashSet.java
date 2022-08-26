package P2_Sets;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Ex2_LinkedHashSet {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> l1 = new LinkedHashSet<Integer>();
		l1.add(105);
		l1.add(115);
		l1.add(104);
		l1.add(102);
		l1.add(101);
		l1.add(102);
		
		Iterator<Integer> itr = l1.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
		System.out.println("\n"+"This is the elements of student class");
		//Using different class
		LinkedHashSet<Students> l2 = new LinkedHashSet<Students>();
		
		l2.add(new Students("Amit", "Mumbai", 25));
		l2.add(new Students("Monti", "Agra", 22));
		l2.add(new Students("Jitu", "Pune", 27));
		
		for(Students s1:l2)
		{
			System.out.println(s1.name+" "+s1.address+" "+s1.age);
		}
	}

}
