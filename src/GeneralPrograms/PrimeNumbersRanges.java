package GeneralPrograms;

public class PrimeNumbersRanges {
	
	public static void main(String[] args) {
		int i,j;
		for(i=2;i<=30;i++) {
			for( j=2;j<i;j++) {
				if(i%j==0) {
					break;
				}
			}
			if(i==j) {
				System.out.print(i+" ");	
			}
			
		}
	}

}
