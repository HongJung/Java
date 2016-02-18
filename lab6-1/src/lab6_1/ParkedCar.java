package lab6_1;

public class ParkedCar {
    private String make;
    private String model;
    private String color;
    private String licenseNumber;
    private int minutesParked;
	/**
	 * @param make
	 * @param model
	 * @param color
	 * @param licenseNumber
	 * @param minutesParked
	 */
	public ParkedCar(String make, String model, String color,
			String licenseNumber, int minutesParked) {
		super();
		this.make = make;
		this.model = model;
		this.color = color;
		this.licenseNumber = licenseNumber;
		this.minutesParked = minutesParked;
	}
	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}
	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the licenseNumber
	 */
	public String getLicenseNumber() {
		return licenseNumber;
	}
	/**
	 * @param licenseNumber the licenseNumber to set
	 */
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	/**
	 * @return the minutesParked
	 */
	public int getMinutesParked() {
		return minutesParked;
	}
	/**
	 * @param minutesParked the minutesParked to set
	 */
	public void setMinutesParked(int minutesParked) {
		this.minutesParked = minutesParked;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "ParkedCar make = " + make + ", model = " + model + ", color = "
				+ color + ", licenseNumber = " + licenseNumber
				+ ", minutesParked = " + minutesParked;
	}

}