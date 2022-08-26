package P5_PractiseQuestion;

import java.util.Scanner;

public class P9_LeapYear {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the year to check whether it is leap year or not ? ");
		int year = in.nextInt();
		
		if(year%4==0 || year%400==0 && year%100!=0)
		{
			System.out.println("Leap year "+year);
		}
		else
		{
			System.out.println("Not an Leap Year "+year);
		}
	}
	

}
