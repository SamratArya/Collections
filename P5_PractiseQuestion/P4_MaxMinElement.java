package P5_PractiseQuestion;

import java.util.Scanner;

public class P4_MaxMinElement {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		int size = in.nextInt();
		
		int a[] = new int[size];
		
		System.out.println("Enter the elements of the array");
		
		for(int i=0;i<a.length;i++)
		{
			a[i] = in.nextInt();
		}
		
		System.out.println("Your array is : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
				
		System.out.println("");
		//max element
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Maximum element in the array is : "+a[0]);
		
		
		//min element
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Minimum element in the array is : "+a[0]);
	}

}
