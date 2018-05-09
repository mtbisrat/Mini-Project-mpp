package attendance.mum.edu.cs401;

import java.sql.Date;

public class AttendanceRecord {

	private int id;
	private Date date;
	Timeslot timeslot;
	Student student;
	Location location;

	AttendanceRecord(int id, Date date) {
		this.id = id;
		this.date = date;
		student = new Student();
		location = new Location();
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
