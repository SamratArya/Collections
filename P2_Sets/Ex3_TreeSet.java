package P2_Sets;

import java.util.Iterator;
import java.util.TreeSet;

public class Ex3_TreeSet {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> t1 = new TreeSet<Integer>();
		t1.add(105);
		t1.add(107);
		t1.add(102);
		t1.add(104);
		t1.add(105);
//		t1.add(null);
		
		Iterator<Integer> itr = t1.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
		System.out.println("\n"+"Reverse order treeset");
		//Reverse order
		Iterator<Integer> itr2 = t1.descendingIterator();
		while(itr2.hasNext())
		{
			System.out.print(itr2.next()+" ");
		}
		
		//remove the highest/lowest value
		System.out.println("\n"+"Highest Values "+t1.pollFirst());
		System.out.println("Lowest Values "+t1.pollLast());
		
		for(Object ob1:t1)
		{
			System.out.print(ob1+" ");
		}
		
		System.out.println("\n"+"Adding new elemets in the set");
		//adding new elements
		t1.add(115);
		t1.add(120);
		t1.add(111);
		for(Object ob1:t1)
		{
			System.out.print(ob1+" ");
		}
		
		System.out.println("");
		//head set
		System.out.println("Head set "+t1.headSet(120 , false));
		
		//subset
		System.out.println("Sub set "+t1.subSet(104,true, 111,true));
		
		//tailset
		System.out.println("Tail set "+t1.tailSet(111 , true));
	}

}
