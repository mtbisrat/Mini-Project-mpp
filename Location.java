
package attendance.mum.edu.cs401;

public class Location {
	private long id;
	private String shortName;
	private String longName;
	
	Location() {
	}

	Location(long id, String sName, String lName) {
		this.setId(id);
		this.setShortName(sName);
		this.setLongName(lName);
		
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getLongName() {
		return longName;
	}

	public void setLongName(String longName) {
		this.longName = longName;
	}

}
