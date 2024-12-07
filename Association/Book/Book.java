//Name: MD. EMRAN NAZIR EFTY
//ID: 22-47802-2

public class Book {
	
	private String bookName;
	private String bookAuthor;
	private String bookId;
	private String bookType;
	int bookCopy;
	public static int bookCounter=0;

	Book() {
	}
	Book(String bookName, String bookAuthor, String bookId, String bookType, int bookCopy) {
		bookCounter++;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookId = bookId;
		this.bookType = bookType;
		this.bookCopy = bookCopy;
	}
	
	void showInfo()
	{
	System.out.println("Book Name Is  : "+bookName);
	System.out.println("Book Author Is: "+bookAuthor);
	System.out.println("Book Id Is    : "+bookId);
	System.out.println( "Book Type Is : "+bookType);
	System.out.println("Book Copy     : "+bookCopy);
	}
	
	void addBookCopy(int x)
	{
		this.bookCopy=this.bookCopy+x;
		System.out.println("New Book Copy Is: "+this.bookCopy);
	}
	
	static void showTotalBookInfo() {
		System.out.println("Total Book Is  : "+bookCounter);
	}

	

}
