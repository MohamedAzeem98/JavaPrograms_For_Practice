package Inheritance;

public class UseFruit extends Fruit{

	public UseFruit(String type, String name) {
		super(type, name);
	}
	public void show() {
		System.out.println("This is inheritance");
	}

public static void main(String[] args) {
	UseFruit u1=new UseFruit("Seasonary","Mango");
	System.out.println(u1);
	u1.show();
}

}
