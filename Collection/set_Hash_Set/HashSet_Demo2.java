package set_Hash_Set;

import java.util.HashSet;

public class HashSet_Demo2 {
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
		
		
		HashSet hss = new HashSet();
		hs.add("Fuck");
		System.out.println(hss);
		hss.addAll(hs);
		System.out.println(hss);
		
		hss.removeAll(hs);
		System.out.println(hss);
		
	}
}
