package GeneralPrograms;

public class ProgramForFactorial {
	
	public static void main(String[] args) {
		
		int n=6;
		long fact=1;
		
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("The Factorial of the Given No is : "+fact);
		
		
		
		
	}

}
