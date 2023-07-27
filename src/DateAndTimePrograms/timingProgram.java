package DateAndTimePrograms;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.TimeZone;

public class timingProgram {
	public static void main(String[] args) {
		
		
	Date d=new Date();
	
	SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy"+" "+"HH:mm:SS z ");
	
	sd.setTimeZone(TimeZone.getTimeZone("GMT"));
	
	System.out.println(sd.format(d));
	
	
	System.out.println();
	System.out.println(LocalDateTime.now());
	
		
		
		
		
		
		
	}

}
