package GeneralPrograms;

public class Lcm {
	public static void main(String[] args) {
		
	int n1=150 , n2=10;
	
	for(int i=1;i<=n1*n2;i++) {
		if(i%n1==0 && i%n2==0) {
			System.out.println("LCM is : "+i);
			break;
		}
	}
		
  }

}
