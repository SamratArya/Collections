package P4_Map;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class Ex8_HashMap_Serialize {
	
	public static void main(String[] args) {
		
		HashMap<Integer, Students> h1 = new HashMap<Integer, Students>();
		h1.put(1, new Students("Amit", "Mumbai", 25));
		h1.put(2, new Students("Munna", "Pune", 27));
		h1.put(3, new Students("Ravish", "Agra", 23));
		h1.put(4, new Students("Fukra", "Surat", 25));
		
		try
		{
			File file = new File("HashTest.txt");
			FileOutputStream fout = new FileOutputStream(file);
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(h1);
			
			out.close();
			fout.close();
			System.out.println("Successfully serialised...");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
