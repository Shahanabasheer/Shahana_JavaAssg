package Basics;

/**
 * 
 * @author Shahana Basheer 16.Collections
 * Hashset
 */
import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
	public static void main(String args[]) {
	
		HashSet<String> hashset=new HashSet<String>();
	
		hashset.add("One");
		hashset.add("Two");
		hashset.add("Three");
		hashset.add("Four");
		hashset.add("Five");
		hashset.add("Six");
		hashset.add("Seven");
		hashset.add("Eight");
		hashset.add("Nine");
		hashset.add("Ten");
		
		Iterator<String> it=hashset.iterator();  
        while(it.hasNext())  
        {  
        System.out.println(it.next());  
        }  
        
        hashset.add("Five");
        hashset.add("Ten");
        
        System.out.println("Duplicate elements added.."+hashset);
        
        System.out.println("Size of hash set is "+hashset.size());
        
        System.out.println("Remove the value Six "+hashset.remove("Six"));
        
        System.out.println("Hash set contains Nine "+hashset.contains("Nine"));
        
        System.out.println("Hash set is empty or not: "+hashset.isEmpty());
        
        
        
	}
}
