import java.util.Scanner;
public class BoxUI
{
	private double height;
	private double width;
	private double length;
	private double volum;
	
	public void setHeight(double h)
	{
		height=h;
	}
	public double getHeight()
	{
		return height;
	}
	
	public void setWidtht(double w)
	{
		width=w;
	}
	public double getWidth()
	{
		return width;
	}
	
	public void setLength(double l)
	{
		length=l;
	}
	public double getLength()
	{
		return length;
	}
	
	public double showVolum()
	{
		volum= height*width*length;
		return volum;
	}
	
	
	
	public static void main(String []args)
	{
		Box b=new Box();
		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("Enter Your Height: " );
		double height=sc.nextDouble();
		
		System.out.print("Enter Your Width: ");
		double width=sc.nextDouble();
		
		System.out.print("Enter Your Length: ");
		double length= sc.nextDouble();


		System.out.println("Height is :" +height);
		System.out.println("Width is  :" +width);
		System.out.println("Length is :" +length);
		System.out.println("Volum is  :" +b.showVolum());
	}	
}