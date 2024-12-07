public class Person
{
	private int id;
	private String name;
	
	public Person()
	{
	}
	public Person(int i,String n)
	{
		id=i;
		name=n;
	}
	public void displayInfo()
	{
		System.out.println("Name Is:" +name);
		System.out.println("ID Is:" +id);
	}
	public static void main (String args[])
	{
		Person pl=new Person(802,"Efty, MD. EMRAN NAZIR");
		pl.displayInfo();
	}
}
		
		