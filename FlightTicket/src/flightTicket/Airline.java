package flightTicket;

public class Airline {
	
	private String name;
	private String phone;

	/**
	 * @param name
	 * @param phone
	 */
	public Airline(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	
	//copy constructor
	public Airline(Airline airline){
		this.name = airline.name;
		this.phone = airline.phone;
	}

	// get and set
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
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return name;
	}
	
	

}
