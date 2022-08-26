package P7_AllString;

import java.util.Arrays;

public class Ex3_Substring {
	
	public static void main(String[] args) {
		
		String s1 = "Amit Vishwakarma";
		
		System.out.println("String : "+s1);
		
		System.out.println("Substring at start point : "+s1.substring(3));
		
		System.out.println("Substring with start and end point : "+s1.substring(2, 15));
		
		//Using split method
		String s2 = "Hello, My name is Amit Vishwakarma ";
		String str2[] = s2.split("\\.");
		System.out.println(Arrays.toString(str2));
	}

}
