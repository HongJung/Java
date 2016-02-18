package lab6_1;

public class ParkingMeter {
	
	private int minutesPurchased;

	/**
	 * @return the minutesPurchased
	 */
	public int getMinutesPurchased() {
		return minutesPurchased;
	}

	/**
	 * @param minutesPurchased the minutesPurchased to set
	 */
	public void setMinutesPurchased(int minutesPurchased) {
		this.minutesPurchased = minutesPurchased;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "minutes Purchased = " + minutesPurchased;
	}

	/**
	 * @param minutesPurchased
	 */
	public ParkingMeter(int minutesPurchased) {
		super();
		this.minutesPurchased = minutesPurchased;
	} 

}
