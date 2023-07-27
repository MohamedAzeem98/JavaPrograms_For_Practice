package ConstructorOverloading;

public class Student {

	String name;
	int no;
	
	
	Student(){                                         //Default Constructor
		System.out.println("Default Constructor");
	}
	
	Student(String name,int no){                    //Parameterized Constructor
		this.name=name;
		this.no=no;
	}
	
	
	
	
}
