package P2_Sets;

import java.util.TreeSet;

public class Ex4_ComparableTreeSet {
	
	public static void main(String[] args) {
		
		TreeSet<Students> t1 = new TreeSet<Students>();
		
		Students s1 = new Students("Amit", "Shivgadh", 25);
		Students s2 = new Students("Shiv", "Rahum", 22);
		Students s3 = new Students("Ravi", "Banaras", 23);
		
		t1.add(s1);
		t1.add(s2);
		t1.add(s3);
		
		for(Students st:t1)
		{
			System.out.println(st.name+" "+st.address+" "+st.age);
		}
	}

}
