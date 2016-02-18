package flightTicket;

import java.util.Calendar;

public class Passenger {
	
	private String firstName;
	private String lastName;
	private String email;
	private int frequentFlyerPoint;
	private String membershipDate;
	/**
	 * @param firstName
	 * @param lastName
	 */
	public Passenger(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	//copy constructor
	public Passenger(Passenger passenger){
		this.firstName = passenger.firstName;
		this.lastName = passenger.lastName;
		this.email = passenger.email;
		this.frequentFlyerPoint = passenger.frequentFlyerPoint;
		this.membershipDate = passenger.membershipDate;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the frequentFlyerPoint
	 */
	public int getFrequentFlyerPoint() {
		return frequentFlyerPoint;
	}

	/**
	 * @param frequentFlyerPoint the frequentFlyerPoint to set
	 */
	public void setFrequentFlyerPoint(int frequentFlyerPoint) {
		this.frequentFlyerPoint = frequentFlyerPoint;
	}

	/**
	 * @return the membershipDate
	 */
	public String getMembershipDate() {
		return membershipDate;
	}

	/**
	 * @param membershipDate the membershipDate to set
	 */
	public void setMembershipDate(String membershipDate) {
		this.membershipDate = membershipDate;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		
		if (this.membershipDate != null){
			return "member since " + this.membershipDate + "(" + this.frequentFlyerPoint + " points)";
		}
		else
			return "It is not a member";
	}
	
	public int timeSinceMembership(){
		int years = 0;
		
		//check if memberbership is not null;
		if (this.membershipDate != null){
		
		// get today's year 
		Calendar today = Calendar.getInstance();
		int tYear = today.get(Calendar.YEAR);
		
		//get member year
		String[] memberDate = this.membershipDate.split("/");
		int mYear = Integer.parseInt(memberDate[2]);
		
		// calculate total years
		years = tYear - mYear;
		
		}
		
		return years;
		
	}
	
	public int setPassenger(int frequnetFlyerPoint, int years, int mileage){
		
		if(years >= 5)
			frequnetFlyerPoint += (mileage * 1) + 100;
		else
			frequnetFlyerPoint += (mileage * 1);
		
		return frequnetFlyerPoint;
		
	}
	
	

}
