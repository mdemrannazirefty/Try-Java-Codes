public class Main{
	public static void main(String[]args){
		Book b1=new Book("OMOR EKUSH","EFTY","47802","KOBITA",500);
		b1.showInfo();
		b1.addBookCopy(500);
		b1.showTotalBookInfo();
		
		Book b2=new Book("ROBINDO SHORO","EMRAN","4780","STORY",420);
		b2.showInfo();
		Book b3=new Book("SEI DINER KOTHA","NAZIR","478000","KOBITA",300);
		b3.showInfo();
		
		b1.showTotalBookInfo();

	}
}