package flightTicket;

public class Flight {
	
	private String number;
	private String departureDate;
	private String departureTime;
	private String arrivalDate;
	private String arrivalTime;
	private int mileage;
	private Airline airline;
	private Airport origin;
	private Airport destination;
	/**
	 * @param number
	 * @param mileage
	 * @param airline
	 * @param origin
	 * @param destination
	 */
	public Flight(String number, int mileage, Airline airline, Airport origin,
			Airport destination) {
		super();
		this.number = number;
		this.mileage = mileage;
		this.airline = airline;
		this.origin = origin;
		this.destination = destination;
	}
	
	public Flight(Flight flight) {
		this.number = flight.number;
		this.departureDate = flight.departureDate;
		this.departureTime = flight.departureTime;
		this.arrivalDate = flight.arrivalDate;
		this.arrivalTime = flight.arrivalTime;
		this.mileage = flight.mileage;
		this.airline = flight.airline;
		this.origin = flight.origin;
		this.destination = flight.destination;
	}

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * @return the departureDate
	 */
	public String getDepartureDate() {
		return departureDate;
	}

	/**
	 * @param departureDate the departureDate to set
	 */
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	/**
	 * @return the departureTime
	 */
	public String getDepartureTime() {
		return departureTime;
	}

	/**
	 * @param departureTime the departureTime to set
	 */
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	/**
	 * @return the arrivalDate
	 */
	public String getArrivalDate() {
		return arrivalDate;
	}

	/**
	 * @param arrivalDate the arrivalDate to set
	 */
	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	/**
	 * @return the arrivalTime
	 */
	public String getArrivalTime() {
		return arrivalTime;
	}

	/**
	 * @param arrivalTime the arrivalTime to set
	 */
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	/**
	 * @return the mileage
	 */
	public int getMileage() {
		return mileage;
	}

	/**
	 * @param mileage the mileage to set
	 */
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	/**
	 * @return the airline
	 */
	public Airline getAirline() {
		return airline;
	}

	/**
	 * @param airline the airline to set
	 */
	public void setAirline(Airline airline) {
		this.airline = airline;
	}

	/**
	 * @return the origin
	 */
	public Airport getOrigin() {
		return origin;
	}

	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(Airport origin) {
		this.origin = origin;
	}

	/**
	 * @return the destination
	 */
	public Airport getDestination() {
		return destination;
	}

	/**
	 * @param destination the destination to set
	 */
	public void setDestination(Airport destination) {
		this.destination = destination;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Flight [number=" + number + ", departureDate=" + departureDate
				+ ", departureTime=" + departureTime + ", arrivalDate="
				+ arrivalDate + ", arrivalTime=" + arrivalTime + ", mileage="
				+ mileage + "]";
	}
	
	
	
	

}
