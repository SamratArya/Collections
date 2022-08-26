package P2_Sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex1_HashSet {
	
	public static void main(String[] args) {
		
		HashSet<Integer> h1 = new HashSet<Integer>();
		h1.add(101);
		h1.add(105);
		h1.add(109);
		h1.add(101);
		h1.add(103);
		
		//Traverse
		Iterator<Integer> itr = h1.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
		System.out.println("\n"+"Adding new element to the list");
		//adding new adding from new set
		HashSet<Integer> h2 = new HashSet<Integer>();
		h2.add(111);
		h2.add(120);
		h2.add(119);
		
		h1.addAll(h2);
		for(Object ob1:h1)
		{
			System.out.print(ob1+" ");
		}
		
		System.out.println("\n"+"Removing elements");
		//remove elements
		h1.remove(103);
		h1.remove(105);
		for(Object ob1:h1)
		{
			System.out.print(ob1+" ");
		}
		
		
		//adding elements from the list
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(150);
		a1.add(123);
		a1.add(140);
		
		System.out.println("\n"+"This is the arraylist elements");
		for(Object ob1:a1)
		{
			System.out.print(ob1+" ");
		}
		
		System.out.println("\n"+"Adding the arraylist elements in the set");
		HashSet<Integer> h3 = new HashSet<Integer>(a1);
		
		//list to set
		for(Integer i1:a1)
		{
			h3.add(i1);
		}
		
		//new set to old set
		h1.addAll(h3);
		
		for(Integer i1:h1)
		{
			System.out.print(i1+" ");
		}
		
		
	}

}
