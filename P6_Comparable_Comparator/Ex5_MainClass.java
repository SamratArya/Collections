package P6_Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex5_MainClass {
	
	public static void main(String[] args) {
		
		ArrayList<Car> a1 = new ArrayList<Car>();
		a1.add(new Car("Toyota", "Dark Grey", "SUV"));
		a1.add(new Car("Suzuki", "Navy Blue", "Sedan"));
		a1.add(new Car("Mahundra", "Red", "SUV"));
		
		Scanner in = new Scanner(System.in);
		char ch = 0;
		
		do
		{
			System.out.println("Enter input to check the sorting for that ?");
			String value = in.next();
			
			System.out.println("");
			//Brand
			if(value.equals("brand"))
			{
				System.out.println("Sorting by brand name : ");
				Collections.sort(a1 , new Ex2_BrandComparator());
				for(Car c1:a1)
				{
					System.out.println(c1.brand+" "+c1.color+" "+c1.type);
				}
			}
			
			
			System.out.println("");
			//Color
			if(value.equals("color"))
			{
				System.out.println("Sorting by color name : ");
				Collections.sort(a1 , new Ex3_ColorComparator());
				for(Car c1:a1)		
				{
					System.out.println(c1.brand+" "+c1.color+" "+c1.type);
				}
			}
			
			
			System.out.println("");
			//Type
			if(value.equals("type"))
			{
				System.out.println("Sorting by type name : ");
				Collections.sort(a1 , new Ex4_TypeComparator());
				for(Car c1:a1)
				{
					System.out.println(c1.brand+" "+c1.color+" "+c1.type);
				}
			}
			
			System.out.println("\n"+"Do you want to recheck for that ?");
			ch = in.next().charAt(0);
			
			if(ch == 'n' || ch == 'N')
			{
				System.exit(0);
			}
			
			
		}while(ch=='y' || ch=='Y');
		
		
	}

}
