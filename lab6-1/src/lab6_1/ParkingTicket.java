package lab6_1;

public class ParkingTicket {
	
	private ParkedCar car;
    private PoliceOfficer officer;
    private double fine;
    private int minutes;

    public final double BASE_FINE = 25.0;
    public final double HOURLY_FINE = 10.0;

    public ParkingTicket(ParkedCar car, PoliceOfficer officer, int minutes) {
        super();
        this.car = car;
        this.officer = officer;
        this.minutes = minutes;

        calculateFine();
    }

    private void calculateFine() {

        double hours = minutes / 60.0;
        int hoursAsInt = (int) hours;

        if ((hours - hoursAsInt) > 0) {
            hoursAsInt++;
        }

        fine = BASE_FINE;

        fine += (hoursAsInt * HOURLY_FINE);
    }

	/**
	 * @return the car
	 */
	public ParkedCar getCar() {
		return car;
	}

	/**
	 * @param car the car to set
	 */
	public void setCar(ParkedCar car) {
		this.car = car;
	}

	/**
	 * @return the officer
	 */
	public PoliceOfficer getOfficer() {
		return officer;
	}

	/**
	 * @param officer the officer to set
	 */
	public void setOfficer(PoliceOfficer officer) {
		this.officer = officer;
	}

	/**
	 * @return the fine
	 */
	public double getFine() {
		return fine;
	}

	/**
	 * @param fine the fine to set
	 */
	public void setFine(double fine) {
		this.fine = fine;
	}

	/**
	 * @return the minutes
	 */
	public int getMinutes() {
		return minutes;
	}

	/**
	 * @param minutes the minutes to set
	 */
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "car = " + car + ", \n officer = " + officer + ", \n Total fine = "
				+ fine + ", \n Abused minutes = " + minutes + ", \n Minimum standard fine = " + BASE_FINE
				+ ", \n Hourly fine charged = " + HOURLY_FINE;
	}

}