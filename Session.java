package attendance.mum.edu.cs401;

import java.util.Date;

public class Session {
	private long id;
	private Date date;
	Timeslot timeslot;
	

	Session() {	}

	Session(long id, Date date) {
		this.id = id;
		this.date = date;
		timeslot = new Timeslot();		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
