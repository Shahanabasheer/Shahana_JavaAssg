package Basics;

/**
 * 
 * @author Shahana Basheer 16.Collections
 * ArrayList
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Collections {
	public static void main(String args[]) {
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("five");
		list.add("Six");
		list.add("Seven");
		list.add("Eight");
		list.add("Nine");
		list.add("Ten");
		
		list.add("Eleven");
		
		Iterator it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		list.add(11,"Twelve");
		System.out.println("Added new "+list);
		
		list.remove(4);
		
		list.set(4,"FIVE" );
		System.out.println("Updated list "+list);
		
		String str=list.get(5);
		if(str.isEmpty()) {
			System.out.println("Element is not present at index 5");
		}
		else {
			System.out.println("Element is present at 5");
		}
		
		if(list.contains("Six")) {
			System.out.println("List contains Six");
		}
		else {
			System.out.println("List does not contain Six");
		}
		
		System.out.println("Element at 7 th: "+list.get(7));
		
		System.out.println("Size of array list: "+list.size());
		
		list.removeAll(list);
		
		System.out.println("LIST.."+list);
	}
}
