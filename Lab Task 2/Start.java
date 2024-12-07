public class Start
{
	public static void main(String[]args)
	{
		Book b1 = new Book("English Store","Bangla Novo","Efty",400.0,200);
		b1.showDetails();
		b1.addQuantity(20);
		b1.sellQuantity(10);
		System.out.println();
		
		Book b2 = new Book("Bangla Store","Eita o Janina","MD",450.0,225);
		b2.showDetails();
		b2.addQuantity(5);
		b2.sellQuantity(15);
		
	}
}