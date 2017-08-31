/**
 * 
 */
/**
 * @author Abdul Hadi
 *
 */
package com.mattic.designpattern;

public class Animal{
	
	private static Animal a;
	
	private Animal (){
		System.out.println("creating an instance of Animal...");
	}
	
	public static Animal getA(){
		if(a instanceof Animal){
			return a;
		}
		else{
			a = new Animal();
			return a;
		}
	}
}