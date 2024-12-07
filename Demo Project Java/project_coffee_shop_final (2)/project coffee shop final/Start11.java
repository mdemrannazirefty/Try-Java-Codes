//import Interface.*;
import Employeee.*;
import java.lang.*;

public class Start11
{
	public static void main(String [] args)
	{
		Manager M = new Manager(10);
		
		
		
		Waiter w1 = new Waiter();
		w1.setname("Tamim");
		w1.setNID("6666666");
		w1.setaddress("66,asdsgfs,kiolk");
		w1.setsalary(5000);
		w1.setworkingDay(50);
		w1.setcontactNum("01333333333");
		
		Cleaner c1 = new Cleaner();
		c1.setname("Tamim");
		c1.setNID("6666666");
		c1.setaddress("66,asdsgfs,kiolk");
		c1.setsalary(5000);
		c1.setworkingDay(50);
		c1.setcontactNum("01333333333");
		
		Waiter w2 = new Waiter();
		w2.setname("Tamim");
		w2.setNID("6666666");
		w2.setcontactNum("01333333333");
		
		
		M.addEmployee(w1);
		M.addEmployee(w2);
		//M.showAllEmployee();
		
		M.addEmployee(c1);
		M.showAllEmployee();

		

		
	}
}