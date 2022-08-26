package P3_Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Ex1_PriorityQueue {
	
	public static void main(String[] args) {
		
		Queue<Integer> q1 = new PriorityQueue<Integer>();
		q1.add(102);
		q1.add(112);
		q1.add(107);
		q1.add(103);
		q1.add(106);
		
		for(Object ob1:q1)
		{
			System.out.print(ob1+" ");
		}
		
		//head element
		System.out.println("\n"+"Head element "+q1.peek());
		
		//Remove head elements
		System.out.println("Removing head elements "+q1.poll());
		for(Object ob1:q1)
		{
			System.out.print(ob1+" ");
		}
		
		
		
		
	}

}
