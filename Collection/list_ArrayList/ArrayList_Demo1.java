package list_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Declaration of Arraylist
		ArrayList  al0 = new ArrayList();      //Store All kind of data in List
//
//		ArrayList<String> al1 = new ArrayList<String>();
//		ArrayList<Integer> al2 = new ArrayList<Integer>(); // It will Store only Homogeneous Data Only 
//		List al3 = new ArrayList();
		
		// Adding Data in ArrayList
		al0.add("Ajay");
		al0.add("Chaitu@1998");
		al0.add(25);
		al0.add(12.12);
		al0.add("kya hua");
		al0.add("C");
		System.out.println("\nOriginal String: "+al0+"\n");
		
		// Removing the ArrayElements 
		al0.remove(1);                     //passing Index for remove
		al0.remove("kya hua");             // printing the name vy valuses in the file 
		System.out.println("After removing the Object From the list "+al0);
		
		//Get the size of the arrayList
		int size = al0.size();
		System.out.print("The Size of the ArrayListL : "+size);
		
		// Get Indexed no from the List \
		System.out.print("Get 2nd Index value :"+al0.get(2));
		
		// Update/Replace Element 
		al0.set(2,"2nd Index Has Changed");
		System.out.println("After Updating 2nd Index "+ al0 );
		
		//Search - contains()
		System.out.println("Ajay is Present inside the List : "+al0.contains("Ajay"));
		System.out.println("Ajay is Present inside the List : "+al0.contains("Ajay&"));
		
		// To chec List is empty or not \
		System.out.println("Retunr T/F Based on List empty or not : "+ al0.isEmpty());
		
		
//		For Loop
		System.out.println("\n\nReading data from list by FOR Loop............ \n");
		for(int i=0;i<al0.size();i++) {
			System.out.println(al0.get(i));
		}
		
		System.out.println("\n\nReading data from list By For Each Loop ............ \n");
//		for...each  loop
		for(Object a:al0) {
			System.out.println(a);
		}
		
		
		
//		Iterator()
		System.out.println("\n\nReading data from list by Iterator Method............ \n");
		
		Iterator it = al0.iterator();         // It is come from Java.util Method from Iterator
		
		while(it.hasNext()) {
			System.out.println(it.next());
			
			
		// All multiple object at same time --AddAll()
		}
		
		
	}

}
