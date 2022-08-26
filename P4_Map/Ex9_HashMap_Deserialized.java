package P4_Map;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex9_HashMap_Deserialized {
	
	public static void main(String[] args) {
		
		HashMap<Integer, Students> h1 = null;
		
		try
		{
			FileInputStream fin = new FileInputStream("HashTest.txt");
			ObjectInputStream in = new ObjectInputStream(fin);
			h1 = (HashMap)in.readObject();
			
			in.close();
			fin.close();
			System.out.println("Sucessfully Deserialised");
		}
		catch(ClassNotFoundException c){
			System.out.println("Class not found");
			c.printStackTrace();
			return;
	    }
		catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Deserialised HashMap");
		
		Set set = h1.entrySet();
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry entry = (Entry) itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
