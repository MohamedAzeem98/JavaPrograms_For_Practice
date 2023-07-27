package GeneralPrograms;

public class PrimeNo {
	public static void main(String[] args) {
		
		int n=130,a=0;
		
		for(int i=2;i<=n-1;i++) {
			if(n%i==0) {
				a=a+1;
			}
		}
		if(a==0) {
			System.out.println("It is a Prime Number");
		}else
			System.out.println("Not a Prime Number");
		
		
		
		
		
		
	}

}
