package ConstructorOverloading;

public class UseStudent {
	public static void main(String[] args) {
		
		
	Student s=new Student();
	System.out.println(s.name+" "+s.no);
	
	System.out.println();
	Student s1=new Student("Ajay",1);
	System.out.println(s1.name+" "+s1.no);
		
		
		
		
	}

}
