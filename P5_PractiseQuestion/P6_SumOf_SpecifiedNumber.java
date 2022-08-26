package P5_PractiseQuestion;

import java.util.Scanner;

public class P6_SumOf_SpecifiedNumber {
	
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
		
		System.out.println("\n"+"Enter the number to check? ");
		int number = in.nextInt();
		
		//Logic
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==number)
				{
					System.out.println(a[i]+" + "+a[j]+" = "+number);
				}
				
//				if(a[i]+a[j]!=number)
//				{
//					System.out.println("Value is invalid");
//					break;
//				}
			}
		}
	}

}
