package set_Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Priority_Set_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue pq = new PriorityQueue();
		
		pq.add("A");
		pq.add("B");
		pq.add("D");
		pq.offer("Z");
		pq.offer("Z");
		

		
		System.out.println(pq);
		
//		Getting Element from the Priority Queue    get head element
		System.out.print(pq.element());     // Retuns Head element if empty return exception nosuchelementExeception
		System.out.print(pq.peek());	// Returns head element if empty returns null
		
//		Deleting element from queue
		pq.remove();
		System.out.println(pq);
		
		pq.poll();
		System.out.println(pq);
		
		Iterator it = pq.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
			
		}
	
////		for each loop
//		for (Object j:pq) {
//			System.out.println(pq.peek(j));
//		}
		
		for(int i=0;i<pq.size();i++) {
			System.out.println(i.);
		}
	}

}
