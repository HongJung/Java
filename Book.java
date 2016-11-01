import java.util.Arrays;

public class Book {

	// Attributes
	private String title;
	private Editor[] editor;
	private Publisher publisher;
	private int edition;
	private String isbn;
	private Chapter[] chapters;
	private int year;

	private int countEditors = 0;
	private int countChapters = 0;

	// Constructor No-Arg
	public Book() {
		this.editor = new Editor[10];
		this.chapters = new Chapter[10];
	}// End of Constructor No-Arg

	// Constructor Arg
	public Book(String title) {
		this.title = title;
		this.editor = new Editor[10];
		this.chapters = new Chapter[10];
	}// End of Constructor Arg

	// Copy Constructor
	public Book(Book object1) {
		this.title = object1.title;
		this.editor = object1.editor;
		this.publisher = object1.publisher;
		this.edition = object1.edition;
		this.isbn = object1.isbn;
		this.chapters = object1.chapters;
		this.year = object1.year;
	}// End of Copy Constructor

	// GETs and SETs
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Editor[] getEditor() {
		return editor;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Chapter[] getChapters() {
		return chapters;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	// Methods

	// Get number of chapters
	public int getNumChapters() {
		// Reads the length of the Chapter array passed to it
		return countChapters;
	}// End of method getNumChapters

	// Get total pages for the book
	public int getTotalPages() {
		// Initializes storage variable
		int result = 0;

		// Loops through each instance of chapter and getsNumberPages()
		for (int i = 0; i < countChapters; i++) {
			result += this.chapters[i].getNumPages();
		}

		// Return the total number of pages for a book
		return result;
	}// End of methods getTotalPages

	// Get list of chapter written by editor
	public void getEditorChapters(Editor scanEditor) {
		System.out.println("Chapters authored by: " + scanEditor.getName());

		// Loops through each chapter
		for (int i = 0; i < countChapters; i++) {
			// Loops through list of editors for each chapter
			for (int j = 0; j < countEditors; j++) {
				// If there is a match, store output the chapter
				if (chapters[i].getAuthors()[j].getName().equals(scanEditor.getName())
					&& chapters[i].getAuthors()[j].getTitle().equals(scanEditor.getTitle())
					&& chapters[i].getAuthors()[j].getAffiliation().equals(scanEditor.getAffiliation())
					&& chapters[i].getAuthors()[j].getEmail().equals(scanEditor.getEmail())
					&& chapters[i].getAuthors()[j].getBio().equals(scanEditor.getBio())
					&& chapters[i].getAuthors()[j].getPictureFilename().equals(scanEditor.getPictureFilename())){
					System.out.println(chapters[i].getTitle());
				} // End of if statement
			}
		}

	}// End of method getEditorChapters

	// Get book citation according to APA
	public void generateCitation() {
		// Gets the editors
		String editorCitation = "";

		// Loops through the editors to add to citation
		for (int i = 0; i < countEditors; i++) {

			String string = editor[i].getName(); // Gets name of editor from
													// current instance
			String[] parts = string.split(" "); // Splits string based on first
												// whitespace character

			editorCitation += parts[1] + ", " + parts[0].substring(0, 1) + "., ";
		} // End of for loop

		// Print the result to the screen
		System.out
				.println(editorCitation + "(" + this.year + "). " + this.title + ". " + this.publisher.getName() + ".");

	}// End of generateCitation method

	// Adds an editor to the array
	public void addEditor(Editor editor) {
		this.editor[countEditors] = new Editor(editor);
		countEditors++;
	}

	// Adds a chapter to the array
	public void addChapters(Chapter chapters) {
		this.chapters[countChapters] = new Chapter(chapters);
		countChapters++;
	}

	// ToString

	public String toString() {
		return "Book Title: " + title + "\nEditor(s): " + Arrays.toString(editor) + "\nPublisher: " + publisher
				+ "\nEdition: " + edition + "\nISBN: " + isbn + "\nYear: " + year + "\nChapters: "
				+ Arrays.toString(chapters);
	}// End of ToString

}// End of class Book
