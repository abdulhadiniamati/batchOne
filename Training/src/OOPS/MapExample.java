package OOPS;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {

//		Map<String, String> hashMap = new HashMap<String, String>();
//		hashMap.put("A", "1");
//		hashMap.put("B", "2");
//		hashMap.put("C", "3");
//		hashMap.put("D", "4");
//		hashMap.put("E", "5");
//
//		System.out.println("HashMap: " + hashMap);
//		System.out.println(hashMap);

		
		//System.out.println(hashMap.remove("four"));
		// Map<String, String> treeMap = new TreeMap<String, String>(hashMap);
		// System.out.println("TreeMap: "+treeMap);
		//
		
		
		
		
		
		 Map<String, String> linkedHashMap = new LinkedHashMap<String,
		 String>();
		 linkedHashMap.put("one", "1");
		 linkedHashMap.put("two", "2");
		 linkedHashMap.put("three", "3");
		 linkedHashMap.put("four", "4");
		 linkedHashMap.put("five", "5");
		 linkedHashMap.put("abcd", "8");
		 
		 
		 System.out.println("LinkedHashMap: "+linkedHashMap);
	}

}
