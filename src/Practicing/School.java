package Practicing;

public class School {
	private String schName;
	private String address;
	private String boardOfStudy;
	
	
	public School(String schName, String address, String boardOfStudy) {
				
		this.schName = schName;
		this.address = address;
		this.boardOfStudy = boardOfStudy;
	}
	
	
	public String getSchName() {
		return schName;
	}
	public void setSchName(String schName) {
		this.schName = schName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBoardOfStudy() {
		return boardOfStudy;
	}
	public void setBoardOfStudy(String boardOfStudy) {
		this.boardOfStudy = boardOfStudy;
	}
	
	
	
	@Override
	public String toString() {
		return "School [schName=" + schName + ", address=" + address + ", boardOfStudy=" + boardOfStudy + "]";
	}
	
	
	
	
	
	
	
	

}
