package P7_AllString;

import java.util.StringJoiner;

public class Ex2_StringConcat {
	
	public static void main(String[] args) {
		
		//Normal concat
		String s1 = "Amit";
		String s2 = "Vishwakarma";
		System.out.println(s1+s2);
		
		//MixConcat
//		String s3 = 50+30+"Amit"+10+20;
//		System.out.println(s3);
		
		//By using concat method
//		String s1 = "Amit";
//		String s2 = "Vishwakarma";
//		System.out.println(s1.concat(s2));
		
		//Concat method using Stringbuilder class
//		StringBuilder s1 = new StringBuilder("Amit");
//		StringBuilder s2 = new StringBuilder(" Kumar");
//		System.out.println(s1.append(s2));
		
		//concat using fromat method
//		String s1 = new String("Amit");
//		String s2 = new String("Kumar");
//		String res = String.format("%s%s", s1, s2);
//		System.out.println(res.toString());
		
		//concat by using join method
//		String s1 = "Amit";
//		String s2 = " Kumar";
//		String res = String.join("", s1 , s2);
//		System.out.println(res.toString());
		
		//conact by using joiner method
//		StringJoiner sj1 = new StringJoiner("::::");
//		sj1.add("Amit");
//		sj1.add("Kumar");
//		System.out.println(sj1.toString());
		
		
	}

}
