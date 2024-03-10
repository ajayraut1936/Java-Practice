package list_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Demo3 {
	
	public static void main(String[] args) {
	// Convert String to Array 
	String arr[] = {"Ajay","Leaved","Chaitu" };
	
	for(Object i:arr) {
		System.out.println(i);
	}
	
	ArrayList al = new ArrayList(Arrays.asList(arr));
	System.out.println(al);
	


}

}
