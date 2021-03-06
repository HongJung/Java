
public class Author extends Person {
	// No attributes required
	
	// Constructor no-Arg
	public Author(){}
	
	// Constructor Arg
	public Author(String name, String title, String email, String affiliation, String bio, String pictureFilename) {
		// Call the superclass constructor
		super(name, title, email, affiliation, bio, pictureFilename);

	}// End of constructor

	// Copy Constructor
	public Author(Author object1){
		super(object1.name, object1.title, object1.email, 
				object1.affiliation, object1.bio, object1.pictureFilename);
			
	}// End of Copy Constructor
	
	// To-String 
	public String toString() {
		return "\nAuthor: " + name 
				+ "\nTitle: " + title 
				+ "\nEmail: " + email
				+ "\nAffiliation: " + affiliation 
				+ "\nBio: " + bio
				+ "\nPicture Filename: " + pictureFilename + "\n";
	}// End of To-String
	
}// End of class Author