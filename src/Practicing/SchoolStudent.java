package Practicing;

public class SchoolStudent extends School {
	int rollNo;
	String studName;
	String studClass;
	
	public SchoolStudent(String schName, String address, String boardOfStudy,int rollNo,String name,String stuClass) {
		super(schName, address, boardOfStudy);
		this.rollNo=rollNo;
		this.studName=name;
		this.studClass=stuClass;
		
	}

	@Override
	public String toString() {
		return "SchoolStudent [rollNo=" + rollNo + ", studName=" + studName + ", studClass=" + studClass
				+ super.toString() + "]";
	}
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
