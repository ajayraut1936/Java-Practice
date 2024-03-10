package list_LinkedList;

import java.util.LinkedList;

public class LinkedList_Demo3 {

	public static void main(String[] args) {
		// LL specific Methods 
		LinkedList<String> ls = new LinkedList<String>();
		ls.add("x");
		ls.add("a");
		ls.add("f");
		ls.add("d");
		ls.add("h");
		ls.add("o");
		ls.add("z");
		System.out.println(ls);
		// Adding element 
		ls.addFirst("Ajay");
		ls.addLast("Chaitu");
		System.out.println(ls);
		
		// Getting element 
		System.out.println("First Element "+ls.getFirst());
		System.out.println("Last Element "+ls.getLast());

		// Remove Element 
		ls.removeFirst();
		ls.removeLast();
		System.out.println(ls);
	}

}
