import java.lang.*;
 public class TextBook extends Book
 {
	 private int standard;
	 
	 public TextBook()
	 {
		 System.out.println("Empty TextBook:");
	 }
	 public TextBook(String isbn,String bookTitle,String authorName,double price,int availableQuantity,int standard)
	 {
		 super(isbn,bookTitle,authorName,price,availableQuantity);
		 System.out.println("parameterized TextBook:");
		 this.standard=standard;
	 }
	 public void setStandard(int standard)
	 {
		 this.standard=standard;
	 }
	 public int getStandard()
	 {
		 return standard;
	 }
	 public void showDetails()
	 {
		 super.showDetails();
		 System.out.println("Book Startdard Type:"+standard);
	 }
 }