package attendance.mum.edu.cs401;

public class Course {

	private long id;
	private String courseId;
	private String name;
	private String description;
	

	public Course() {
	}

	Course(long id, String courseId, String name, String description) {
		this.setId(id);
		this.setCourseId(courseId);
		this.setName(name);
		this.setDescription(description);
		
	}	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
