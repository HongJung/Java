package lab5;

public class Person {
	
	//Create the attributes of the class: firstName, lastName, address (an instance of class address)
	private String firstName, lastName;
	private Address address;
	
	//Create an Arg-Constructor that accepts all attributes of the class 
	public Person(String firstName, String lastName, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	//Create the toString method to return the following String format: firstName lastName, instance of class address

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + "]";
	}

}
