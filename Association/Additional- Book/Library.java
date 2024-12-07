import java.util.Scanner;
public class Library {
	private String libName;
	private String libAddress;
	Book[] book=new Book[1000];
	int totalBook=0;
	
	Scanner sc=new Scanner(System.in);
	
	Library(){
	}
	Library (String libName,String libAddress)
	{
	this.libName=libName;
	this.libAddress=libAddress;
	}
	
	void LibraryDetails() {
		System.out.println("Library Name: "+libName);
		System.out.println("libAddress: "+libAddress);
	}
	
void showLibInfo(Book book){
		System.out.println(" ");
		book.showInfo();
		totalBook=book.getBookCopy()+totalBook;
		book.showTotalBookInfo();
		System.out.println("Total books of library"+totalBook);
		
		System.out.println(" ");
	}

void addNewBook(Book book){
	 
	System.out.print("Book Name: ");
	String n=sc.nextLine();
	System.out.print("Book Author: ");
	String a=sc.nextLine();
	System.out.print("Book id: ");
	String i=sc.nextLine();
	System.out.print("Book Type: ");
	String t=sc.nextLine();
	System.out.print("Book COPY: ");
	int c=sc.nextInt();
	System.out.print("add new BookCopy: ");
	int ab=sc.nextInt();

	//book.name(n);
	//book.author(a);
	//book.id(i);
	//book.type(t);
	//book.copy(c);
	//book.addBookCopy(ab);
	}
	

}
