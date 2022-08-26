package P5_PractiseQuestion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P3_OccurenceOfChar_Hashmap {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String value = in.next();
		
		Map<Character, Integer> m1 = new HashMap<Character, Integer>();
		
		for(int i=value.length()-1;i>=0;i--)
		{
			if(m1.containsKey(value.charAt(i)))
			{
				int count = m1.get(value.charAt(i));
				m1.put(value.charAt(i), ++count);
			}
			else
			{
				m1.put(value.charAt(i), 1);
			}
		}
		System.out.println(m1);
	}

}
