package com.mattic.comparator;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FruitDemo {
	private static final Logger logger = Logger.getLogger("FruitDemo");
	
	public static void main(String[] args) {
		Fruit[] fruitArr = new Fruit[4];
		
		fruitArr[0] = new Fruit("Banana", 10);
		fruitArr[1] = new Fruit("Apple", 50);
		fruitArr[2] = new Fruit("Pineapple", 70);
		fruitArr[3] = new Fruit("Strawberry", 20);
		
//		Arrays.sort(fruitArr);
		Arrays.sort(fruitArr, Fruit.fruitNameComparator);
		
		Fruit f = new Fruit();
		int a = f.wrapperClass(new Integer(1));
		logger.log(Level.INFO, "Integer returned is "+a);
		
		int i = 0;
		for(Fruit fruit: fruitArr) {
			int counter = ++i;
			System.out.println("Fruit "+counter+": "+"Name: "+fruit.getFruitName()+" and quantity: "+fruit.getQuantity());
		}
		
	}

}
