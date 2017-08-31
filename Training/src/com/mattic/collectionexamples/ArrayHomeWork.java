package com.mattic.collectionexamples;

import java.util.LinkedList;
import java.util.List;

public class ArrayHomeWork {

	List<Character> uptoChar(int i) {
		char c = 'a';
		List<Character> list = new LinkedList<Character>();
		for (;;) {
			list.add(c);
			if (list.size() == i) {
				break;
			}
			c++;
		}
		return list;
	}

	public static void main(String[] args) {

		ArrayHomeWork experiments = new ArrayHomeWork();
		System.out.println(experiments.uptoChar(26));
	}
}
