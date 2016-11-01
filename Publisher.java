public class Publisher {

	// Attributes
	private String name;
	private String address;
	private String url;
	private String phone;

	// Constructor No-Arg
	public Publisher() {}// End of Constructor No-Arg

	// Constructor Arg
	public Publisher(String n, String a, String u, String p) {
		this.name = n;
		this.address = a;
		this.url = u;
		this.phone = p;
	}// End of Constructor Arg

	// Copy Constructor
	public Publisher(Publisher object1)
	{
		this.name = object1.name;
		this.address = object1.address;
		this.url = object1.url;
		this.phone = object1.phone;
	}

	// GETs and SETs
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	// ToString
	public String toString() {
		return "Publisher: " + name + "\nAddress: " + address + "\nUrl: " + url
				+ "\nPhone: " + phone;
	}// End of method ToString

}// End of class Publisher
