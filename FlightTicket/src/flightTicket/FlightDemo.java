package flightTicket;

public class FlightDemo {

	public static void main(String[] args) {
		
		Airport airport1 = new Airport("SLO", "Lambert-St. Louis International Airport", "St. Louis, MO");
		
		System.out.println("Airport 1");
		System.out.println("Code: " + airport1.getCode());
		System.out.println("Name: " + airport1.getName());
		System.out.println("Location: " + airport1.getLocation());
		System.out.println(" ");
		
		Airport airport2 = new Airport("JFK", "John F Kennedy Airport", "New York, NY");
		
		System.out.println("Airport 2");
		System.out.println("Code: " + airport2.getCode());
		System.out.println("Name: " + airport2.getName());
		System.out.println("Location: " + airport2.getLocation());
		System.out.println(" ");
		
		Airline airline1 = new Airline("Delta", "123-456-7890");
		
		System.out.println("Airline");
		System.out.println("Name: " + airline1.toString());
		System.out.println("Phone: " + airline1.getPhone());
		System.out.println(" ");
		
		Passenger passenger1 = new Passenger("John", "Doe");
		passenger1.setMembershipDate("09/13/1997");
		passenger1.setFrequentFlyerPoint(930);
		passenger1.setEmail("jdoe@example.com");
		System.out.println("Passenger");
		System.out.println("Member Date: " + passenger1.getMembershipDate());
		System.out.println("First Name: " + passenger1.getFirstName());
		System.out.println("Last Name: " + passenger1.getLastName());
		System.out.println("Points: " + passenger1.getFrequentFlyerPoint());
		System.out.println("Email: " + passenger1.getEmail());
		System.out.println(" ");
		
		Flight flight1 = new Flight("D1201", 930, airline1, airport1, airport2);
		flight1.setArrivalDate("02/10/2015");
		flight1.setArrivalTime("2:30pm");
		flight1.setDepartureDate("02/02/2015");
		flight1.setDepartureTime("09:45am");
		System.out.println(flight1.toString());
		
		// calling method
		System.out.println(" ");
		System.out.println("Frequent Flyer: " + "member since " + passenger1.getMembershipDate() + " (" + passenger1.setPassenger(passenger1.getFrequentFlyerPoint(), passenger1.timeSinceMembership(), flight1.getMileage()) + " points)");
		
		FlightTicket flightTicket1 = new FlightTicket(223344, 250, passenger1, flight1);
		System.out.println(flightTicket1.toString());
		
		
	}
	

}
