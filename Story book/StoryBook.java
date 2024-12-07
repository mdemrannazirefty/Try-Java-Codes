import java.lang.*;

public class StoryBook extends Book
{
	private String category;
	
	public StoryBook() 
	{
		System.out.println("Empty Book Story:");
	}
	public StoryBook(String isbn,String bookTitle,String authorName,double price,int availableQuantity,String category )
	{
		super(isbn,bookTitle,authorName,price,availableQuantity);
		System.out.println("Parameterized BookStory :");
		this.category=category;
		
	}
	public void setCategory(String category)
	{
		this.category=category;
	}
	public String getCategory()
	{
		return category;
	}
	public void showDtails()
	{
		super.showDetails();
		System.out.println("Book Category:"+category);
	}
}