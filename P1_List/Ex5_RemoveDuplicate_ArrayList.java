package P1_List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ex5_RemoveDuplicate_ArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<String> a1= new ArrayList<String>();
		a1.add("Apple");
		a1.add("Mango");
		a1.add("Banana");
		a1.add("Apple");
		a1.add("Orange");
		
		for(Object ob1:a1)
		{
			System.out.print(ob1+" ");
		}
		
		System.out.println("\n"+"Removing Dupliactes");
		//For removing duplicates from the list here set
		HashSet<String> h1 = new HashSet<String>(a1);
		for(Object ob1:h1)
		{
			System.out.print(ob1+" ");
		}
		
		
	}

}
