package lab6_1;

public class DemoParking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    ParkedCar car = new ParkedCar("Chrysler", "2005", "White", "DEB203", 100);

	    ParkingMeter meter = new ParkingMeter(60);

	    PoliceOfficer officer = new PoliceOfficer("John Doe", "1811");

	    ParkingTicket ticket = officer.patrol(car, meter);

	    if (ticket != null) {
	        System.out.println(ticket);
	    } else {
	        System.out.println("This car has not comitted any crime.");
	        }
	}
}

