import java.lang.*;

public class Start1
{
	public static void main(String[] args)
	{
		
		StoryBook s1=new StoryBook();
		s1.setIsbn("Pather Panchali");
		s1.setBookTitle("Story");
		s1.setAuthorName("Bhibhutibhushan Bandyopadhyay");
		s1.setPrice(495.5);
		s1.setAvailableQuantity(30);
		s1.setCategory("Story Book");
		s1.showDetails();
		s1.addQuantity(20);
		s1.sellQuantity(2);
		
		System.out.println("*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*");
		
		StoryBook s2=new StoryBook("Durbin","Story","Shiradindu Bandyopadhyay",530.02,25,"Story Book");
		s2.showDetails();
		
		System.out.println("*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*");
		
		
		TextBook t1=new TextBook();
		t1.setIsbn("Anupam");
		t1.setBookTitle("Novel");
		t1.setAuthorName("Turzo");
		t1.setPrice(500.59);
		t1.setAvailableQuantity(50);
		t1.setStandard(10);
		t1.showDetails();
		t1.addQuantity(50);
		t1.sellQuantity(3);
		
		System.out.println("*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*");
		
		TextBook t2=new TextBook("opekkha","Novel", "Humayun Ahmed", 376.25, 30,9);
		t2.showDetails();
		
		
	}
}