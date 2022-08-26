package P8_PractiseAll;

import java.util.ArrayList;
import java.util.Collections;

public class Ex1_ShuffleElements {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(101);
		a1.add(106);
		a1.add(103);
		a1.add(102);
		a1.add(110);
		
		System.out.println("Before Shuffling the elements");
		for(Object ob1:a1)
		{
			System.out.print(ob1+" ");
		}
		
		Collections.shuffle(a1);
		
		System.out.println("\n"+"After Shuffling the elements");
		for(Object ob1:a1)
		{
			System.out.print(ob1+" ");
		}
		
		
	}

}
