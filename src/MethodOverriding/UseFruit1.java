package MethodOverriding;
//method overriding
public class UseFruit1 extends Fruit1{
	
	public void display() {
		System.out.println("This is a child class");
	}
	
	public static void main(String[] args) {
		
		Fruit1 f1=new Fruit1();
		
		f1.display();
		
		Fruit1 f2=new UseFruit1();
		
		f2.display();
		
	}

}
