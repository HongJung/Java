import java.util.Arrays;


public class Chapter {

	//Attributes
	private Person[] authors;
	private String title;
	private String[] keywords;
	private String chapAbstract;
	private int numPages;
	private String chapFilename;
	
	private int countAuthors = 0;
	private int countKeywords = 0;
	
	// Constructor No-Arg
	public Chapter(){
		this.authors = new Person[10];
		this.keywords = new String[10];
	}// End of Constructor No-Arg
	
	// Constructor Arg
	public Chapter(String title){
		this.title = title;	
		this.authors = new Person[10];
		this.keywords = new String[10];
	}// End of constructor Arg

	// Copy Constructor
	public Chapter(Chapter object1)
	{
		this.authors = object1.authors;
		this.title = object1.title;
		this.keywords = object1.keywords;
		this.chapAbstract = object1.chapAbstract;
		this.numPages = object1.numPages;
		this.chapFilename = object1.chapFilename;
		this.countKeywords = object1.countKeywords;
	}// End of Copy Constructor
	
	//GETs and SETs	
	public Person[] getAuthors() {
		return authors;
	}

	public void addAuthors(Person authors) {
		this.authors[countAuthors] = authors;
		countAuthors++;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String[] getKeywords() {
		return this.keywords;
	}

	public void addKeywords(String keywords) {
		this.keywords[countKeywords] = keywords;
		countKeywords++;
	}

	public String getChapAbstract() {
		return chapAbstract;
	}

	public void setChapAbstract(String chapAbstract) {
		this.chapAbstract = chapAbstract;
	}

	public int getNumPages() {
		return numPages;
	}

	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}

	public String getChapFilename() {
		return chapFilename;
	}

	public void setChapFilename(String chapFilename) {
		this.chapFilename = chapFilename;
	}
	
	//Methods
	public int getNumKeywords()
	{
		return countKeywords;
	}
	
	//ToString
	public String toString() {
		return "\n\nChapter Title: " + title 
				+ "\nChapter Authors: " + Arrays.toString(authors)  
				+ "\nKeywords: " + Arrays.toString(keywords)
				+ "\nAbstract: " + chapAbstract 
				+ "\nPages: " + numPages
				+ "\nFilename: " + chapFilename;
	}// End of toString method
	
}// End of class Chapter
