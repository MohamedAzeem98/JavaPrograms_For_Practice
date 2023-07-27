package GeneralPrograms;

public class Palindrome {
	public static void main(String[] args) {
		
		int n1=141,a,rem;
		int rev=0;
		a=n1;
		while(n1>0) {
			rem=n1%10;
			rev=rev*10+rem;   //Armstrong->rev=rev+rem*rem*rem;
			n1=n1/10;
		}
		if(a==rev) {
			System.out.println("It is Palindrome");
		}else
			System.out.println("Not a Palindrome");
		
	}

}
