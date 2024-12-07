public class Department {
	int deptId;
	public String deptName;
	
	Department() {
	}
	Department(int deptId, String deptName) {
		this.deptId = deptId;
		this.deptName = deptName;
	}
	
	void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	int getDeptId() {
		return deptId;
	}
	
	void setDepName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptName() {
		return deptName;
	}
}

class Employee  {
	String empName;
	double salary;
	
	Employee() {
	}
	Employee(String empName, double salary) {
		this.empName = empName;
		this.salary = salary;
	}
	
	void setEmpName(String empName) {
		this.empName = empName;
	}
	String getEmpName() {
		return empName;
	}
	
	void setSalary(double salary) {
		this.salary = salary;
	}
	double getSalary() {
		return salary;
	}
}

class Faculty extends Employee{
	int teachingHour;
	Department dept;
	
	Faculty() {
	}
	Faculty(String empName, double salary, int th,Department d) {
		super(empName,salary);
		this.teachingHour = th;
		this.dept=d ;
	}

	void setTeachingHour(double th) {
		teachingHour = (int)th;
	}
	double getTeachingHour() {
		return teachingHour;
	}

	void setDept(Department d) {
		dept = d;
	}
	Department getDept() {
		return dept;
	}
	
	void showInfo() {
	   // super();
		System.out.println("Name: "+getEmpName());
		System.out.println("Salary: "+getSalary());
		System.out.println("Teaching Hour: "+getTeachingHour());
		System.out.println("Department Name: "+getDept());
	}	
}
