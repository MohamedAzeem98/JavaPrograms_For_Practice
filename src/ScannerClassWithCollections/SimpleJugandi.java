package ScannerClassWithCollections;
import java.util.*;
public class SimpleJugandi {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no of index : ");
	int de=sc.nextInt();
	
	//For Arrays
	int arr[]=new int[de];
	for(int i=0;i<de;i++) {
		arr[i]=sc.nextInt();
		}
	for(int i=0;i<de;i++) {
		System.out.print(arr[i]+" ");
	}
	
	System.out.println();
	
	//For Collection via List
	ArrayList<Integer>al=new  ArrayList<>();
	
	for(int i=0;i<de;i++) {
		al.add(i);
	}
	System.out.print(al.toString());
		
		
		
		
		
	}

}
