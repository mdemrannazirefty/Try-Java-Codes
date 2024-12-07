public class Organization
{
	double managers, adminofficers, salesman;
	
	public void setManagers(double m)
	{
		managers=m;
	}
	public double getManagers()
	{
		return managers;
	}
	
	
	public void setAdminofficers(double a)
	{
		adminofficers=a;
	}
	public double getAdminofficers()
	{
		return adminofficers;
	}
	
	
	public void setSalesman(double s)
	{
		salesman=s;
	}
	public double getSalesman()
	{
		return salesman;
	}
	
	public void showDetails()
	{
		System.out.println("Manager Salery is      :" +managers);
		System.out.println("Adminofficers Salery is:" +adminofficers);
		System.out.println("Salesman Salery is     :" +salesman);
		System.out.println();
		System.out.println("Manager Yearly Salery is     :" +managers*12);
		System.out.println("Adminofficers Yearly Salery is:" +adminofficers*12);
		System.out.println("Salesman Yearly Salery is     :" +salesman*12);
	}
	
	
	public static void main(String []args)
	{
		Organization o1=new Organization();
		o1.setManagers(45000);
		o1.setAdminofficers(25000);
		o1.setSalesman(20000);
		o1.showDetails();
	}
}	
