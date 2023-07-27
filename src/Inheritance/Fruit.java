package Inheritance;

public class Fruit {
	String type;
	String name;
	public Fruit(String type, String name) {
		super();
		this.type = type;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Fruit [type=" + type + ", name=" + name + "]";
	}
	
	
	

}
