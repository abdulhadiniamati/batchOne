package OOPS;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class SetExample {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		set.add("8");
		set.add("2");
		set.add("5");
		set.add("4");
		set.add("1");
		set.add("6");
		set.add("7");
		set.add("1");
	
		java.util.Iterator<String> setIterator = set.iterator();
		while(setIterator.hasNext()){
			System.out.println("Values: "+setIterator.next());
		}
		
//		System.out.println("Set: "+set);
//		
//		Set<String> treeSet = new TreeSet<String>(set);
//	
//		System.out.println("Tree Set: "+treeSet);
	}
}
