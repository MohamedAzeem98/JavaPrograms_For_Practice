package GeneralPrograms;

public class ReversalOfString {
	public static void main(String[] args) {
		
	String str="Train";
	String reve=" ";
	int n=str.length();
	
	for(int i=n-1;i>=0;i--) {
		reve=reve+str.charAt(i);
	}
	System.out.println("Reversal of a string is : "+reve);
		
	}

}
