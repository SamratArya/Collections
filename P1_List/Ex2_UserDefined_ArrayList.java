package P1_List;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Ex2_UserDefined_ArrayList {
	
	public static void main(String[] args) {
		
		Students s1 = new Students("Amit", "Pune", 25);
		Students s2 = new Students("Ravi", "Mumbai", 23);
		Students s3 = new Students("Ajit", "Nashik", 24);
		
		ArrayList<Students> a1 = new ArrayList<Students>();
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		
		java.util.Iterator<Students> itr= a1.iterator();
		
		while(itr.hasNext())
		{
			Students st = itr.next();	
			System.out.println(st.name+" "+st.address+" "+st.age);
		}
	}

}
