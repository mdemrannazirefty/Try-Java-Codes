public class Leapyear 
{
	public static void main (String[] arga) 
	{
	int year=1984;
		
	if (((year/4==0)&&(year/100!=0))||(year/400==0))
	{
		System.out.println(year + "is leap Year.");
	}

	else
	{
		System.out.println(year + "is not leap Year.");
	}
	}
}