package P7_AllString;

public class Ex4_StringBuffer {
	
	public static void main(String[] args) {
		
		//Normal append
		StringBuffer s1 = new StringBuffer("Amit ");
		s1.append("Vishwakarma");
		System.out.println(s1);
		
		
		//insert method
		StringBuffer s2 = new StringBuffer("Hello..");
		s2.insert(1, "World..!!");
		System.out.println(s2);
		
		
		//replace method
		StringBuffer s3 = new StringBuffer("Hello..!! Everyone");
		s3.replace(2, 9, "Java");
		System.out.println(s3);
		
		
		//delete method
		StringBuffer s4 = new StringBuffer("This is my favorite doll..");
		s4.delete(5, 9);
		System.out.println(s4);
		
		
		//reverse method
		StringBuffer s5 = new StringBuffer("VISHWAKARMA");
		s5.reverse();
		System.out.println(s5);
		
		
	}

}
