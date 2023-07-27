package GeneralPrograms;

public class SquareRootOfANumber {
	public static void main(String[] args) {
		
	int n=3;
	
	System.out.println(sqrootFinder(n));
	
	}
	public static double sqrootFinder(int n) {
		double t;
		double sqroot=n/2;
		
		do {
			t=sqroot;
			sqroot=(t+(n/t))/2;
		}while(t-sqroot!=0);
		return sqroot;
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	