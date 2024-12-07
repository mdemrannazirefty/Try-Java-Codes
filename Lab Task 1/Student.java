public class Student
{
	int id;
	String name;
	double cgpa;
	
	public void setID(int i)
	{
		id=i;
	}
	public int getID()
	{
		return id;
	}
	
	public void setNAME(String n)
	{
		name=n;
	}
	public String getNAME()
	{
		return name;
	}
	
	public void setCGPA(double c)
	{
		cgpa=c;
	}
	public double getCGPA()
	{
		return cgpa;
	}
	
	public static void main (String[]args)
	{
		Student s=new Student();
		s.setID(2247802);
		s.setNAME("EFTY, MD. EMRAN NAZIR EFTY");
		s.setCGPA(3.92);
		
		System.out.println("Student Id Is:" +s.getID());
		System.out.println("Student Name Is:" +s.getNAME());
		System.out.println("Student CGPA Is:" +s.getCGPA());
	}
	
	
}