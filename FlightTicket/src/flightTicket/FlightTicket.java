package flightTicket;

public class FlightTicket {
	
	private int number;
	private int price;
	private Passenger passenger;
	private Flight flight;
	/**
	 * @param number
	 * @param price
	 * @param passenger
	 * @param flight
	 */
	public FlightTicket(int number, int price, Passenger passenger,
			Flight flight) {
		super();
		this.number = number;
		this.price = price;
		this.passenger = passenger;
		this.flight = flight;
	}
	
	public FlightTicket(FlightTicket flightTicket) {
		this.number = flightTicket.number;
		this.price = flightTicket.price;
		this.passenger = flightTicket.passenger;
		this.flight = flightTicket.flight;
	}
	
	
	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the passenger
	 */
	public Passenger getPassenger() {
		return passenger;
	}
	/**
	 * @param passenger the passenger to set
	 */
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	/**
	 * @return the flight
	 */
	public Flight getFlight() {
		return flight;
	}
	/**
	 * @param flight the flight to set
	 */
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "FlightTicket [number = " + number + ", price = " + price
				+ ", passenger = " + passenger + ", \n flight = " + flight  + "\n" + "frequent flyer pints in total = " + passenger.setPassenger(passenger.getFrequentFlyerPoint(), passenger.timeSinceMembership(), flight.getMileage()) + "]";
	}
	
	
	
	

}
