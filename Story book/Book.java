import java.lang.*;
public class Book 
{
	private String isbn;
	private String bookTitle;
	private String authorName;
	private double price;
	private int availableQuantity;
	
	public Book()
	{
		System.out.println("Empty Book:");
	}
	public Book(String isbn,String bookTitle,String authorName,double price,int availableQuantity)
	{
		System.out.println("Parameterized Book:");
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
	public void setBookTitle(String bookTitle)
	{
		this.bookTitle=bookTitle;
	}
	public void setAuthorName(String authorName)
	{
		this.authorName=authorName;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public void setAvailableQuantity(int availableQuantity)
	{
		this.availableQuantity=availableQuantity;
	}
	public String getIsbn()
	{
		return isbn;
	}
	public String getBookTitle()
	{
		return bookTitle;
	}
	public String getAuthorName()
	{
		return authorName;
	}
	public double getPrice()
	{
		return price;
	}
	public int getAvaiableQuantity()
	{
		return availableQuantity;
	}
	public void addQuantity(int amount)
	{
		System.out.println("Total Book Available:"+(availableQuantity+amount));
	}
	public void sellQuantity(int amount)
	{
		System.out.println("Totall Book Sell:"+amount);
	}
	public void showDetails()
	{
		System.out.println("Book Isbn : " + isbn);
		System.out.println("Book Title : " + bookTitle );
		System.out.println("Author name  : " +authorName);
		System.out.println("Book price: " + price);
		System.out.println("Book AvailableQuantity: " + availableQuantity);
	}
	
}