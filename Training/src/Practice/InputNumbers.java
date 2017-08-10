package Practice;

import java.util.Scanner;

public class InputNumbers {

	public static void main(String[] args) {

		Scanner n = new Scanner(System.in);

		System.out.println("Input First Number");
		int num1 = n.nextInt();

		System.out.println("Input Second Number");

		int num2 = n.nextInt();

		System.out.println(num1 + " x " + num2 + " = " + num1 * num2);

	}

}
