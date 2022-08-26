package P5_PractiseQuestion;

import java.util.ArrayList;

public class P7_InsertElement_AtFIrstPos {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(105);
		a1.add(102);
		a1.add(108);
		a1.add(101);
		a1.add(109);
		
		for(Object ob1:a1)
		{
			System.out.print(ob1+" ");
		}
		
		System.out.println("\n"+"After inserting new element");
		//insert element in first position
		a1.add(1, 110);
		for(Object ob1:a1)
		{
			System.out.print(ob1+" ");
		}
		
	}

}
