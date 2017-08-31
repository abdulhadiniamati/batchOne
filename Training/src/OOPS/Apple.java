package OOPS;

public class Apple implements Fruit {
	
	private String name;
	
	public Apple(String name){
		setName(name);
		//this.name=name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void color () {
		System.out.println("The color for Apples is Red");
	}

	public void shape() {
		
		System.out.println("The Shape for Apple is O type");
		
	}

	public void place() {
		System.out.println("The best place you can find apple is Afghanistan");
		
	}
	
	public String isRotten(){
		return "NO";
	}
	

}
