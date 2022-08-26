package P1_List;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex7_ListConversion {
	
	public static void main(String[] args) {
		
//		Array to List
//		Scanner in = new java.util.Scanner(System.in);
//		
//		System.out.println("Enter the size of the array");
//		int size = in.nextInt();
//		
//		int a[] = new int[size];
//		
//		System.out.println("Enter the elements of the array");
//		
//		for(int i=0;i<a.length;i++)
//		{
//			a[i] = in.nextInt();
//		}
//		
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.print(a[i]+" ");
//		}
//		
//		System.out.println("\n"+"This is the list");
//		//converting the array to list
//		ArrayList<Integer> a1 = new ArrayList<Integer>();
//		
//		for(Integer i1:a)
//		{
//			a1.add(i1);
//		}
//		
//		for(Object ob1:a1)
//		{
//			System.out.print(ob1+" ");
//		}
//		
		
//		List to array
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Mango");
		a1.add("Banana");
		a1.add("Pineapple");
		a1.add("Apple");
		
		for(String str:a1)
		{
			System.out.print(str+" ");
		}
		
		System.out.println("");
		//converting list to array
		String s1[] = new String[a1.size()];
		
		for(int i=0;i<s1.length;i++)
		{
			s1[i] = a1.get(i);
		}
		
		for(int i=0;i<s1.length;i++)
		{
			System.out.print(s1[i]+" ");
		}
	}

}
