package P5_PractiseQuestion;

import java.util.Date;

public class P10_DateTime {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		
		System.out.println("Today Date : "+date.getDate());
		
		System.out.println("Months : "+date.getMonth());
		
		System.out.println("Year : "+date.getYear());
		
		System.out.println("Hours : "+date.getHours());
		
		System.out.println("Minutes : "+date.getMinutes());
		
		System.out.println("Seconds : "+date.getSeconds());
	}

}
