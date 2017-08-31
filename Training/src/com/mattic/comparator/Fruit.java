package com.mattic.comparator;

import java.util.Comparator;

public class Fruit implements Comparable<Fruit>{
	public String fruitName;
	public int quantity;
	
	public Fruit() {}

	public Fruit(String fruitName, int quantity) {
		super();
		this.fruitName = fruitName;
		this.quantity = quantity;
	}

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int wrapperClass(Object a) {
		return (Integer)a;
	}
	
	@Override
	public int compareTo(Fruit compareFruit) {
		return ((Fruit)compareFruit).getQuantity()-this.quantity;
	}
	

	public static Comparator<Fruit> fruitNameComparator = new Comparator<Fruit>() {

		@Override
		public int compare(Fruit fruit1, Fruit fruit2) {
			return fruit1.getFruitName().compareTo(fruit2.getFruitName());
		}
		
	};

}
