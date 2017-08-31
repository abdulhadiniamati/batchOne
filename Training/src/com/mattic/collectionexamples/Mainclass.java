package com.mattic.collectionexamples;

import java.util.ArrayList;
import java.util.Scanner;

public class Mainclass {

	private ArrayList<Phonebook> Telephonerecords = new ArrayList<Phonebook>();

	public void telephonedirectory() {

		Scanner input = new Scanner(System.in);

		String menuOption;
		//System.out.println("");
		do {
			System.out.println("1 .Add Records");
			System.out.println("2 .Display Records");
			System.out.println("3.Remove Records ");
			System.out.println("4. Exit Records");

			menuOption = input.nextLine();

			if (menuOption.equals("1")) {
				addRecords();
			} else if (menuOption.equals("2")) {
				displyRecords();
			} else if (menuOption.equals("3")) {
				removeRecords();
			} 

		} while (menuOption.equals("4") == false);

	}
	private void addRecords() {
	}
	private void removeRecords() {
	}
	private void displyRecords() {
	}
	public static void main(String[] args) {

		new Mainclass().telephonedirectory();

	}

}
