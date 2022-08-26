package P5_PractiseQuestion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class P11_ReadFile {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setName("Amit");
		e1.setAddress("Mumbai");
		e1.setAge(25);
		e1.setId("B123");
		
		//Serialization
		File file = new File("testFile.txt");
//		try
//		{
//			FileOutputStream fout = new FileOutputStream(file);
//			ObjectOutputStream out = new ObjectOutputStream(fout);
//			out.writeObject(e1);
//			
//			out.close();
//			fout.close();
//			System.out.println("Object has been successfully done");
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		Employee e2 = null;
		//Deserialization
		try
		{	
			FileInputStream fin = new FileInputStream(file);
			ObjectInputStream in = new ObjectInputStream(fin);
			e2 = (Employee) in.readObject();
			
			in.close();
			fin.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Deserialised value is : ");
		System.out.println("Employee name : "+e2.getName());
		System.out.println("Employee address : "+e2.getAddress());
		System.out.println("Employee age : "+e2.getAge());
		System.out.println("Employee Id : "+e2.getId());

		
		
	}

}
