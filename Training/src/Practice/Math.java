package Practice;

import java.util.Scanner;

public class Math {

	public static void main(String[] args) {

		Scanner n = new Scanner(System.in);

		System.out.println("Input First Number");
		int num1 = n.nextInt();

		System.out.println("Input Second Nubmer");
		int num2 = n.nextInt();

		System.out.println(num1 + "+" + num2 + "=" + num1 + num2);
		System.out.println(num1 + "*" + num2 + "=" + num1 * num2);
		System.out.println(num1 + "/" + num2 + "=" + num1 / num2);
		System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));

	}

}
