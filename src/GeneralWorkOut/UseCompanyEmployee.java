package GeneralWorkOut;

import java.util.ArrayList;

public class UseCompanyEmployee {

	public static String  show() {
		return "The Following Employees are implemented for a Client BaseLocation";
	}
	
public static void main(String[] args) {
	
	ArrayList<CompanyEmployee>al=new ArrayList<>();


al.add(new CompanyEmployee(251345,"Askar","2.3 yrs",4));
al.add(new CompanyEmployee(251372,"Henick","1.7 yrs",3));
al.add(new CompanyEmployee(252345,"Naveen","3.8 yrs",5));

System.out.println(show());

for(CompanyEmployee de:al) {
	System.out.println(de);
}



}







}
