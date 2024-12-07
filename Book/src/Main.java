import java.util.Scanner;

public class Main{
	public static void main(String[]args){
		Library l=new Library("BANGLA STORE","WEST KURIL");
		l.LibraryDetails();
		
		Scanner sc=new Scanner(System.in);
		System.out.print("HOW MANY BOOKS ADDING: ");
		int hmb=sc.nextInt();
		
		for(int i=0;i<hmb;i++){
			Book b1=new Book();
			l.addNewBook(b1);
			l.showLibInfo(b1);
		}
		
		
	}
}