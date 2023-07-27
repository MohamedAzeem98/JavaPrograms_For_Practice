package GeneralWorkOut;

public class CompanyEmployee {
	private int empId;
	private String name;
	private String exp;
	private int salaryPerYear;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExp() {
		return exp;
	}
	public void setExp(String exp) {
		this.exp = exp;
	}
	public int getSalaryPerYear() {
		return salaryPerYear;
	}
	public void setSalaryPerYear(int salaryPerYear) {
		this.salaryPerYear = salaryPerYear;
	}
	public CompanyEmployee(int empId, String name, String exp, int salaryPerYear) {
		super();
		this.empId = empId;
		this.name = name;
		this.exp = exp;
		this.salaryPerYear = salaryPerYear;
	}
	@Override
	public String toString() {
		return "CompanyEmployee [empId=" + empId + ", name=" + name + ", exp=" + exp + ", salaryPerYear="
				+ salaryPerYear + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
