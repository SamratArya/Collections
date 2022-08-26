package P3_Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Ex2_ArrayDeque {
	
	public static void main(String[] args) {
		
		Deque<Integer> d1 = new ArrayDeque<Integer>();
		d1.add(105);
		d1.add(102);
		d1.add(107);
		d1.add(101);
		d1.add(115);
//		d1.add(null);
		
		for(Integer i1:d1)
		{
			System.out.print(i1+" ");
		}
		
		System.out.println("");
		//Offers
		d1.offer(110);
		d1.offer(112);
		d1.offerFirst(101);
		d1.offerLast(150);
		for(Integer i1:d1)
		{
			System.out.print(i1+" ");
		}
		
		//poll
		System.out.println("\n"+"Poll last "+d1.pollLast());
		System.out.println("Poll First "+d1.pollFirst());
		for(Integer i1:d1)
		{
			System.out.print(i1+" ");
		}
		
		
		
	}

}
