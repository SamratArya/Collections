package P1_List;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ex3_Serialization_ArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(105);
		a1.add(102);
		a1.add(104);
		a1.add(115);
		
		for(Object ob1:a1)
		{
			System.out.print(ob1+" ");
		}
		
//		Serialization
		try
		{
			//Here file has been created
			FileOutputStream fout = new FileOutputStream("check.txt");
			
			//Here object has been get from the file
			ObjectOutputStream ob1 = new ObjectOutputStream(fout);
			
			//Here object value has been printed to the file
			ob1.writeObject(a1);
			
			ob1.close();
			fout.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
