package set_LinkedHash_Set;

import java.util.LinkedHashSet;

public class LinkedHash_Set_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add(100);   //Insersion order is preserved in LinkedHashSet.
		lhs.add("Ajay");
		lhs.add("Chaitu");
		lhs.add(11.45);
		lhs.add(true);
		lhs.add(null);
		System.out.println(lhs);
		

	}

}
