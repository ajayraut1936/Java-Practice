package list_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu

		// Declare Linked List 
//		LinkedList ls = new LinkedList();
//		LinkedList<String> ls = new LinkedList<String>();
//		LinkedList<Integer> ls1 = new LinkedList<Integer>();
		
		LinkedList ls = new LinkedList();
		
		// add element into LL
		ls.add(100);
		ls.add("Welcme");
		ls.add("Fuck");
		ls.add(10.00);
		ls.add(null);
		ls.add("Chaitu");
		System.out.println(ls);
		
		// Get the size of the list 
		
		System.out.println("The Size of the LL : "+ls.size());
		
		//Remove the elemetnt from list 
		
		ls.remove(2);
		System.out.println("After removing 2nd Element : "+ls);
		
		ls.remove("Chaitu");
		System.out.println("After removing 2nd Element : "+ls);
		
		// Insert/ adding element in the middle of the LL
		
		ls.add(2, "Fuck");
		ls.add(5, "Chaitu");
		System.out.println("After Inserting Elements : "+ls);
		
		
		// Retriving the Value/Object
		System.out.println("Get 2nd Element in LL : "+ls.get(2));

		// Set/ Update new values 
		ls.set(2,"ChaituFuck");
		System.out.println("After setting/updatting change values: "+ls);
		
		// Return True if contains that element
		System.out.println("Contains: "+ls.contains("Java"));
		System.out.println("Contains: "+ls.contains("Chaitu"));
		
		// Check if LL is emptry or not 
		System.out.println("Empty is : "+ls.isEmpty());
		
		
//		For Loop
		for(int i=0;i<ls.size();i++) {
			System.out.println(ls.get(i));
		}
		
		
//		for each loop    
		for(Object j:ls) {    // if we know about data type or hetegeniuos data that time we should have to use Object in Loop 
			System.out.println(j);
		}
		
//		Iterator loop
		Iterator lt = ls.iterator();
		while(lt.hasNext()) {
			lt.next();
		}
		
	}
	
	

}
