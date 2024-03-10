package set_Hash_Set;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashSet hs = new HashSet();
//		HashSet<Integer> hs = new HashSet<Integer>();
		HashSet hs = new HashSet(100,(float)0.75);  // Load factor is 0.75 and default capacity is 16
		
		
		hs.add(100);   //Insersion order is not preserved.
		hs.add("Ajay");
		hs.add("Chaitu");
		hs.add(11.45);
		hs.add(true);
		hs.add(null);
		
		System.out.println(hs);
		
		// Removing the value from hashmap
		hs.remove("Chaitu");
		System.out.println(hs);
		
		// Check conatin or not 
		System.out.println("contain : "+hs.contains("Ajay"));
		System.out.println("contain : "+hs.contains("Chaitu"));
		
		// Empty 
		System.out.println("ISEMPTY  : "+hs.isEmpty());
		
		
//		For Loop not working for hashset
		
		
//		for each loop ?
		for(Object s:hs) {
			System.out.println(s);
		}

		
//		for iteration
		Iterator ls = hs.iterator();
		while(ls.hasNext()) {
			System.out.println(ls.next());
		}
		
		
		
	}

}
