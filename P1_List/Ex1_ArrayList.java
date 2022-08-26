package P1_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Ex1_ArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(101);
		a1.add(103);
		a1.add(105);
		a1.add(102);
		a1.add(108);
		
//		Normal Traverse
//		for(Object ob1:a1)
//		{
//			System.out.print(ob1+" ");
//		}
		
//		Iterator
		Iterator<Integer> itr = a1.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
		System.out.println(" ");
		
//		check whether is value is there
		if(a1.contains(105))
		{
			System.out.println("Value is there");
		}
		else
		{
			System.out.println("Value is not there");
		}
		
		
//		Add new value to the prev array list using new arraylist
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(115);
		a2.add(120);
		
		for(Integer i1:a2)
		{
			a1.add(i1);
		}
		
		System.out.println("\n"+"Add new elements in the list");
		for(Object ob1:a1)
		{
			System.out.print(ob1+" ");
		}
		
		System.out.println("\n"+"Here is the array of arraylist");
//		Convert array list to array
		int arr[] = new int[a1.size()];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = a1.get(i);
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\n"+"Sorting the list");
//		Sort the list
		Collections.sort(a1);
		
		for(Object ob1:a1)
		{
			System.out.print(ob1+" ");
		}
		
		
		
	}

}
