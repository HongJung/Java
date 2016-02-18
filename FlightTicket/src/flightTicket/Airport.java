package flightTicket;

public class Airport {
	
	private String code;
	private String name;
	private String location;
	/**
	 * @param code
	 * @param name
	 * @param location
	 */
	public Airport(String code, String name, String location) {
		super();
		this.code = code;
		this.name = name;
		this.location = location;
	}
	
	public Airport(Airport airport){
		this.code = airport.code;
		this.name = airport.name;
		this.location = airport.location;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return code+ "-" + name + "-" + location;
	}
	
	
	

}
