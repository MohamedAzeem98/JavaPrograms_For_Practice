package ThreadConcept;

public class threadingConcept extends Thread{
	 public static int amount = 0;
public static void main(String[] args) {
	 threadingConcept thread = new threadingConcept();
	    thread.start();
	    System.out.println(amount);
	    amount++;
	    System.out.println(amount);
	  }

	  public void run() {
	    amount++;
	  }
	
	
	
	
	
	
	
	
	
	
	
}
 


