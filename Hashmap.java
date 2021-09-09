package Basics;
/**
 * 
 * @author Shahana Basheer 16.Collections
 * Hashmap
 */

import java.util.HashMap;

public class Hashmap {
	public static void main(String args[]) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		HashMap map2=new HashMap();
		
		map.put(1,"Aabi");
		map.put(2,"Binu");
		map.put(3,"Christal");
		map.put(4,"Diya");
		map.put(5,"Eza");
		map.put(6,"Geethu");
		map.put(7,"Iniya");
		map.put(8,"Jerom");
		map.put(9,"Lina");
		map.put(10,"Neenu");
		
		System.out.println("Value of id num 5 "+map.get(5));
		
		System.out.println("Hash map 1:"+map);
		
		map2=(HashMap)map.clone();
		System.out.println("Hash map 2 "+map2);
		
		System.out.println("Contains the key 6: "+map.containsKey(6));
		
		System.out.println("Contains value Iniya :"+map.containsValue("Iniya"));
		
		System.out.println("Map is epmtry or not : "+map.isEmpty());
		
		System.out.println("Size of hash map :"+map.size());
		
		System.out.println("Keys of hash map "+map.keySet());
		
		System.out.println("Values of hash map :"+map.values());
		
		map.remove(9,"Lina");
		System.out.println("New hash map "+map);
		
	}
}
