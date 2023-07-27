package MethodOverloading;
//Method Overloading
public class Calculation {
	
	public void multiply(int a, int b) {
		System.out.println(a*b);
	}
	
	public void multiply(int a,int b,int c) {
		System.out.println(a*b*c);
	}
	
	public void multiply(int a,int b, int c, int d) {
		System.out.println(a*b*c*d);
	}
	
public void main(String args[]) {
	//method calling	
		multiply(2,5);
		multiply(2,5,7);
		multiply(1,2,3,4);
	}
	
  }
