package NewClass;

public class Calculator {

	public static void main(String[] args) {

		Add ab = new Add();
		System.out.println(ab.add(10, 20));

		Sub su = new Sub();
		int ou = su.sub(30, 10);
		System.out.println(ou);

		Mul mu = new Mul();
		//mu.mul(3, 6);
		System.out.println(mu.mul(ou, 5));
	}

}
