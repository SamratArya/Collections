package P1_List;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Ex4_Deserialization_Array {
	
	public static void main(String[] args) {
		
//		Deserialization
		try
		{
			FileInputStream fin = new FileInputStream("check.txt");
			
			ObjectInputStream ob1 = new ObjectInputStream(fin);
			
			ArrayList a1 = (ArrayList) ob1.readObject();
			
			for(Object ob:a1)
			{
				System.out.print(ob+" ");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
