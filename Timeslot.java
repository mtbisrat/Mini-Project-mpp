package attendance.mum.edu.cs401;

import java.sql.Time;
import java.util.List;

public class Timeslot {
	
	private long id;
	private String abbrv;
	private String description;
	private Time beginTime;
	
	Timeslot(){}
	
	Timeslot(long id, String abbrv, String description, Time btime){
		this.id=id;
		this.abbrv=abbrv;
		this.description=description;
		this.beginTime=btime;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAbbrv() {
		return abbrv;
	}
	public void setAbbrv(String abbrv) {
		this.abbrv = abbrv;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Time getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(Time beginTime) {
		this.beginTime = beginTime;
	}
	public Time getEndTime() {
		return endTime;
	}
	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}
	private Time endTime;
	List<AttendanceRecord> attendancerecord;
	List<Session> session;
	

}
