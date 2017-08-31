package OOPS;

public class Grapes implements Fruit {

	//public static void main(String[] args) {

//		Apple a = new Apple();
//		a.place();
//		a.color();
//		a.shape();
		
//		new Apple ().color();
//		new Apple ().place();
//		new Apple ().shape();

//	}
	public Grapes(String name){
		setName(name);
	}

	public void setName(String name){
		System.out.println("Apple name -> "+name);
	}
	@Override
	public void color() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Grapes [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public void shape() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void place() {
		// TODO Auto-generated method stub
		
	}
	public String isRotten(){
		return "YES";
	}

}
