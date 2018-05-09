package attendance.mum.edu.cs401;

public class Registration {
	private long id;
	private double GPA;
	Student student;
	CourseOffering courseoffering;
	
	Registration(){}
	Registration(long id, double gpa){
		this.id=id;
		this.GPA=gpa;
		student = new Student();
		courseoffering = new CourseOffering();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
}
