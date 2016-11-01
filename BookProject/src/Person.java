public abstract class Person {

	// Attributes
	protected String name;
	protected String title;
	protected String email;
	protected String affiliation;
	protected String bio;
	protected String pictureFilename;
	
	// Constructor no-Arg
	public Person()
	{
		
	}
	
	// Constructor Arg
	public Person(String name, String title, String email, String affiliation,
			String bio, String pictureFilename) {
		super();
		this.name = name;
		this.title = title;
		this.email = email;
		this.affiliation = affiliation;
		this.bio = bio;
		this.pictureFilename = pictureFilename;
	}// End of constructor
	
	// GETs and SETs
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAffiliation() {
		return affiliation;
	}

	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getPictureFilename() {
		return pictureFilename;
	}

	public void setPictureFilename(String pictureFilename) {
		this.pictureFilename = pictureFilename;
	}

}// End of class Person
