package lab5;

public class Address {
	
	//Create the attributes of the class: street, city, state, zip
	private String street, city, state, zip;

	//. Create an Arg-Constructor that accepts all attributes
	public Address(String street, String city, String state, String zip) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	//Create a method toString the returns the following string format:street, city, state, zip
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state="
				+ state + ", zip=" + zip + "]";
	}
	
	
	
	

}
