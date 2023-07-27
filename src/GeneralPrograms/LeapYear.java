package GeneralPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeapYear {
	public static void main(String[] args) throws IOException {
		/*System.out.println("Enter the Year : ");
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		
		int year=br.read();
		*/
		int year=2004;
		boolean leap=false;
		
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					leap=true;
				}else
					leap=false;
			}else
				leap=true;
		}else {
			leap=false;
		}
			
		
		if(leap) {
			System.out.println("It is A Leap Year");
		}else
			System.out.println("Not a Leap Year");
	}

}
