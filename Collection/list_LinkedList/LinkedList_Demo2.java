package list_LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> ls = new LinkedList<String>();
		ls.add("x");
		ls.add("a");
		ls.add("f");
		ls.add("d");
		ls.add("h");
		ls.add("o");
		ls.add("z");
		
		LinkedList<String> ls1 = new LinkedList<String>();
		ls1.add("Ajay");
		ls1.add("Fuck");
		System.out.println(ls1);
		
		// Add all element from LL0 to LL1
		ls1.addAll(ls);
		System.out.println(ls1);
		
		// removing all element from ls2
		ls1.removeAll(ls);
		System.out.println(ls1);
		
		System.out.println("Before sorting : "+ls1);
		ls1.addAll(ls);
		System.out.println(ls1);
		Collections.sort(ls1);
		System.out.println("After sorting : "+ls1);
		
		// Reverse order
		Collections.sort(ls1,Collections.reverseOrder());
		System.out.println("After sorting : "+ls1);
		
		// Shuffle
		
		Collections.shuffle(ls1);
		System.out.println("After shuffle : "+ls1);
		
	}

}
