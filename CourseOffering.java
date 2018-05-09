package attendance.mum.edu.cs401;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseOffering {

	private long id;
	private String courseOfferingId;
	private Date startDate;
	private Date endDate;
	Location location;
	Course course;
	List<Session> session;
	
	
	CourseOffering(){}

	CourseOffering(long id, String courseofferingid, Date sdate, Date edate) {
		this.setId(id);
		this.setCourseOfferingId(courseofferingid);
		this.setStartDate(sdate);
		this.setEndDate(edate);
		location = new Location();
		course = new Course();
		session = new ArrayList<>();
		

	}
	public void addSession(Session s) {
		session.add(s);
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCourseOfferingId() {
		return courseOfferingId;
	}

	public void setCourseOfferingId(String courseOfferingId) {
		this.courseOfferingId = courseOfferingId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
