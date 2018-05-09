package attendance.mum.edu.cs401;

public class Student {
	private long id;
	private String studentId;
	private String firstName;
	private String lastName;
	private String barCode;	
	
	
	Student(){}
	
	Student(long id, String studentid,String fname, String lname,String bcode){
		this.id=id;
		this.studentId=studentid;
		this.firstName=fname;
		this.lastName=lname;
		this.barCode=bcode;		
		
	}	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBarCode() {
		return barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	
}
