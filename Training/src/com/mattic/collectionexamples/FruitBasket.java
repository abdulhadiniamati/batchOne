package com.mattic.collectionexamples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import OOPS.Apple;
import OOPS.Fruit;
import OOPS.Grapes;
import OOPS.Saving;

public class FruitBasket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		List <Fruit> mybasket = new ArrayList<Fruit>();
//		Apple humlaApple;
//		Grapes napaGrapes;
		
//		for(int i=0; i<10; i++){
//			humlaApple = new Apple();
//			mybasket.add(humlaApple);
//		}
//		
//		for(int i=0; i<10; i++){
//			napaGrapes = new Grapes();
//			mybasket.add(napaGrapes);
//		}
//		
//		for(Fruit f : mybasket){
//			System.out.println(((Apple)f).isRotten());
//		}
//		
//		System.out.println(mybasket.size());
//		System.out.println("11th fruits: "+ ((Apple)mybasket.get(11)).isRotten());
		
		Map<String, Apple> myFruitBasket = new HashMap<String, Apple>();
		myFruitBasket.put("SweetApple", new Apple("122"));
		myFruitBasket.put("SourApple", new Apple("111"));
		myFruitBasket.put("redApple", new Apple("333"));
		
		Apple newApple = myFruitBasket.get("redApple");
		
		Set<String> keys = myFruitBasket.keySet();
		
		

		
		
		
	}

}
