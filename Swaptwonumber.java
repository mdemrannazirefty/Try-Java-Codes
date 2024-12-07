public class Swaptwonumber
{
	public static void main (String[] arga) 
	{
		int x=10, y=20;
		System.out.println("Before Swap:" + x + " and " + y);
		
		int tempo=x;
		x=y;
		y=tempo;
		System.out.println("After Swap:" + x + " and " + y);
	}
}