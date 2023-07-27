package GeneralPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderSample {
public static void main(String[] args) {
	
	
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	System.out.println("Enter a String : ");
	try {
		String sc=br.readLine();
		System.out.println(Integer.parseInt(sc)+51);
		
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
	

	
	
	
}
}
