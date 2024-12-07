public class Book
{
	String isbn;
	String bookTitle;
	String authorName;
	double price;
	int availableQuantity;
	
	public Book()
	{
		System.out.println("Right Book");
	}
	public Book(String isbn,String bookTitle,String authorName,double price, int availableQuantity)
	{
		this.isbn=isbn;
		this.bookTitle=bookTitle;
		this.authorName=authorName;
		this.price=price;
		this.availableQuantity=availableQuantity;
	}
	
	public void setIsbn(String isbn)
	{
		this.isbn=isbn;
	}
	public String getIsbn()
	{
		return isbn;
	}
	
	public void setBookTitle(String bookTitle)
	{
		this.bookTitle=bookTitle;
	}
	public String getBookTitle()
	{
		return bookTitle;
	}
	
	public void setAuthorName(String authorName)
	{
		this.authorName=authorName;
	}
	public String getAuthorName()
	{
		return authorName;
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	public double getPrice()
	{
		return price;
	}
	
	public void setAvaiableQuantity(int availableQuantity)
	{
		this.availableQuantity=availableQuantity;
	}
	public int getAvaiableQuantity()
	{
		return availableQuantity;
	}
	
	
	public void addQuantity(int amount)
	{
		System.out.println("Book Add Quantity Is : " +amount);
		availableQuantity=availableQuantity+amount;
		System.out.println("Now Available Book Is: " +availableQuantity);
	}
	public void sellQuantity(int amount)
	{
		System.out.println("Book Sell Quantity Is: " +amount);
		availableQuantity=availableQuantity-amount;
		System.out.println("Now Available Book Is: " +availableQuantity);
	}
	
	
	public void showDetails()
	{
		System.out.println("Book Isbn Is         : " +isbn);
		System.out.println("Book Title Is        : " +bookTitle);
		System.out.println("Author Name Is       : " +authorName);
		System.out.println("Book Price Is        : " +price);
		System.out.println("Available Quantity Is: " +availableQuantity);
	}
}