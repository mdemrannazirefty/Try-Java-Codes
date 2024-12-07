public class Box
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
		b.setHeight(20);
		b.setWidtht(20);
		b.setLength(20);
		System.out.println("Height is:" +b.getHeight());
		System.out.println("W is:" +b.getWidth());
		System.out.println("L is:" +b.getLength());
		System.out.println("Volum is:" +b.showVolum());
	}	
}