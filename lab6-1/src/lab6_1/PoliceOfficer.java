package lab6_1;

public class PoliceOfficer {
	private String name;
    private String badgeNumber;

    public ParkingTicket patrol(ParkedCar car, ParkingMeter meter) {

        ParkingTicket ticket = null;

        
        int illegalMinutes = car.getMinutesParked()
                - meter.getMinutesPurchased();

        
        if (illegalMinutes > 0) {
            
            ticket = new ParkingTicket(car, this, illegalMinutes);
        }

        return ticket;
    }

	/**
	 * @param name
	 * @param badgeNumber
	 */
	public PoliceOfficer(String name, String badgeNumber) {
		super();
		this.name = name;
		this.badgeNumber = badgeNumber;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "PoliceOfficer Name = " + name + ", BadgeNumber = " + badgeNumber;
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
	 * @return the badgeNumber
	 */
	public String getBadgeNumber() {
		return badgeNumber;
	}

	/**
	 * @param badgeNumber the badgeNumber to set
	 */
	public void setBadgeNumber(String badgeNumber) {
		this.badgeNumber = badgeNumber;
	}

    
}