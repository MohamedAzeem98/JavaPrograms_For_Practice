package GeneralPrograms;

public class ReverseNo {
	public static void main(String[] args) {
		
		int n=6781,a,rem,rev=0;
		a=n;
		while(n>0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(rev!=0) {
			System.out.println(rev);
		}else
			System.out.println("No Result");
	}

}
