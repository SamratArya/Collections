package P1_List;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex6_LinkedList {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(105);
		l1.add(104);
		l1.add(109);
		l1.add(102);
		
		//Traverse
		for(Object ob1:l1)
		{
			System.out.print(ob1+" ");
		}
		
		System.out.println(" ");
		//adding new adding
		l1.add(110);
		l1.add(111);
		for(Object ob1:l1)
		{
			System.out.print(ob1+" ");
		}
		
		System.out.println(" ");
		//Adding new element using new list
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		l2.add(115);
		l2.add(104);
		
		l1.addAll(l2);
		for(Object ob1:l1)
		{
			System.out.print(ob1+" ");
		}
		
		System.out.println("");
		//adding element in the first/last position
		l1.addFirst(120);
		l1.addLast(150);
		for(Object ob1:l1)
		{
			System.out.print(ob1+" ");
		}
		
		System.out.println("");
		//Remove the required element using index position
		l1.remove(0);
		l1.remove(8);
		for(Object ob1:l1)
		{
			System.out.print(ob1+" ");
		}
		
		System.out.println("");
		//Remove first/last element
		l1.removeFirst();
		l1.removeLast();
		for(Object ob1:l1)
		{
			System.out.print(ob1+" ");
		}
		
		System.out.println("");
		//Rerverse the elements of the list
		Iterator<Integer> itr =  l1.descendingIterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
			
		
		
	}

}
