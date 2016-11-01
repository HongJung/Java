public class BookDemo {

	public static void main(String[] args) {

		// String variable for keyword search
		String keyword = "";

		// AUTHORS
		Author a1 = new Author("Lee Cooper", "Gr8 Author", "blah@gmail.com",
				"lee.inc", "Nice words about me.", "lee.jpg");
		Author a2 = new Author("Bob ross", "Bad Author", "bob@yahoo.com",
				"bob.corp", "Words about bob", "bob.jpg");

		// EDITORS
		Editor e1 = new Editor("Larry Bird", "ED", "larryEdits@gmail.com",
				"ISU", "Chief Editor", "profile.jpg");
		Editor e2 = new Editor("Robert Ingall", "MD", "robertEdits@gmail.com",
				"EIU", "Vice Editor", "404.jpg");

		// PUBLISHER
		Publisher p1 = new Publisher("Pearson Education Inc",
				"Upper Saddle River", "http://www.pearsoned.com/",
				"555-fau-xnum");

		// CHAPTER 1
		Chapter c1 = new Chapter("Ch1. Intro to Java");
		c1.setChapAbstract("The basics of the basic about programming");
		c1.setNumPages(14);
		c1.setChapFilename("Intro.pdf");

		// Add the authors / editors to the chapter
		c1.addAuthors(a1);
		c1.addAuthors(a2);

		// Add the keywords
		c1.addKeywords("Introduction");
		c1.addKeywords("Java");
		c1.addKeywords("Programming");

		// CHAPTER 2
		Chapter c2 = new Chapter("Ch2. Variables");
		c2.setChapAbstract("Storing data into memory");
		c2.setNumPages(35);
		c2.setChapFilename("Variables.pdf");

		// Add the authors / editors to the chapter
		c2.addAuthors(e1);
		c2.addAuthors(a2);

		// Add the keywords
		c2.addKeywords("Variables");
		c2.addKeywords("Memory");

		// BOOKS
		Book[] books = new Book[10];

		books[0] = new Book("Java");
		books[0].setEdition(5);
		books[0].setIsbn("978-0-13-285583-9");
		books[0].setPublisher(p1);
		books[0].setYear(2013);
		books[0].addChapters(c1);
		books[0].addChapters(c2);
		books[0].addEditor(e1);
		books[0].addEditor(e2);

		// System.out.println(c1.getNumKeywords());
		// System.out.println(books[0].getChapters()[0].getNumKeywords());

		// Book Methods
		// System.out.println("Total Chapters: " + books[0].getNumChapters());
		// //Total number of chapters
		// System.out.println("Total Book Pages: " + books[0].getTotalPages());
		// //Total number of pages in book
		// books[0].getEditorChapters(e2); //Gets list of chapters written by a
		// given editor
		// books[0].generateCitation(); //Generates a citation
		// System.out.println(books[0]); //Shows all information about a book
		// publisherBooks(books, p1); //Displays list of all books with the same
		// publisher

		bookKeywords(books[0], "Variables");

	}// End of main

	// Demo Methods

	// Displays list of all books with the same publisher
	public static void publisherBooks(Book[] books, Publisher publisher) {

		// String variable of book names
		String bookSamePub = "\n";

		// Loops through the books array
		for (int i = 0; i < 1; i++) // Being in the Demo class, is a static
									// array length OK?
		{
			// Verifies the publisher argument matches the publishers of a book
			if (books[i].getPublisher().getName().equals(publisher.getName())
					&& books[i].getPublisher().getAddress()
							.equals(publisher.getAddress())
					&& books[i].getPublisher().getUrl()
							.equals(publisher.getUrl())
					&& books[i].getPublisher().getPhone()
							.equals(publisher.getPhone()))
				bookSamePub += books[i].getTitle() + "\n";
		}
		// Display the result
		System.out.println("Books published by " + publisher.getName() + ":"
				+ bookSamePub);

	}// End of method publisherBooks

	// Searches chapters with a keyword, displays book name and chapter
	public static void bookKeywords(Book book, String keyword) {
		// Variable storing chapters with the searched keyword
		String chapterKey = "";

		// Loops through each chapter of a given book
		for (int i = 0; i < book.getNumChapters(); i++) {
			// Loops through the array of keywords of each chapter
			for (int j = 0; j < book.getChapters()[i].getNumKeywords(); j++) {
				// If there is a match, store the chapter name into chapteKey
				if (book.getChapters()[i].getKeywords()[j].equals(keyword))
					chapterKey += book.getChapters()[i].getTitle() + "\n";
			}
		}
		// Display the result
		System.out.println("Chapters of " + book.getTitle() + " with keyword "
				+ keyword + ":\n" + chapterKey);

	}// End of method bookKeywords

}// End of class BookDemo
