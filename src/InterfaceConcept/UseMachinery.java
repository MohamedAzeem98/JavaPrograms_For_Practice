package InterfaceConcept;
//Interface
public class UseMachinery implements Machinery{
	public void show() {
		
		System.out.println("Hello this is a concept of Interface");
	}
	public static void main(String[] args) {
	
	
	UseMachinery m1=new UseMachinery();
	m1.show();
	
	
	}
	
}
