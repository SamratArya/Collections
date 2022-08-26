package P4_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Ex12_IfExists {
	
	public static void main(String[] args) {
		
		HashMap<Integer, Students> h1 = new HashMap<Integer, Students>();
		
		Scanner in = new Scanner(System.in);
		char ch = 0;
		
		do
		{
			System.out.println("Enter The Name ");
			String name = in.next();
			
			System.out.println("Enter the address");
			String address = in.next();
			
			System.out.println("Enter the age");
			int age = in.nextInt();
			
//			System.out.println("Enter the limit of list");
//			int size = in.nextInt();
			
			int count = 0;
			
			if(!h1.containsValue(name))
			{
				h1.put(count++, new Students(name, address, age));
			}	
			else
			{
				System.out.println("Value is there");
			}
			
			Set set = h1.entrySet();
			
			Iterator itr = set.iterator();
			
			while(itr.hasNext())
			{
				Map.Entry map = (Entry) itr.next();
				System.out.println("Key : "+map.getKey()+"\n"+"Value : "+map.getValue());
			}
			
			System.out.println("Do you want to enter more data ");
			ch = in.next().charAt(0);
			
			if(ch=='n' || ch=='N')
			{
				System.exit(0);
			}
			
		}while(ch=='y' || ch=='Y');		
		
	}

}
