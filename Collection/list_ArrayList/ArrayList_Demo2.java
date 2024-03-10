package list_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add("Ajay");
		al.add("Vijay");
		al.add("Sanjay");
		al.add("Chaitu");
		al.add("Phad");
		al.add("Ghan");
		System.out.println("List 1 " + al);
		
		ArrayList al2 = new ArrayList();
		System.out.println("List 2 Before adding values: "+al2);
		
		al2.addAll(al);
		System.out.println("List 2 After adding values: "+al2);
		
		al2.removeAll(al);
		System.out.println("List 2 After removing values: "+al2);
		
		// Sort method from collection classs\\\
		
		System.out.println("Before using sort from collection class" +al );
		Collections.sort(al);
		System.out.println("After using sort from collection class" + al);
		
		// Reverse the Order by Collections class
//		Collections.reverse(al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("After using sort from collection class" + al);
		
		
		Collections.shuffle(al2);
		System.out.println("Shuffle the list " + al);
		
		
		
		

	}

}
