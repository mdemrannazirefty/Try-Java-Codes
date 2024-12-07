//Name: MD. EMRAN NAZIR EFTY
//ID: 22-47802-2

public class Contact {
	private String personName;
	private String personId;
	private int age;
	private String mobileNumber;
	private char gender;
	
	Contact() {
	}

	Contact(String personName, String personId, int age, String mobileNumber, char gender) {
		this.personName = personName;
		this.personId = personId;
		this.age = age;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
	}
	
	public void showPersonInfo(){
		System.out.println("Name Is: "+personName);
		System.out.println("IdIs   : "+personId);
		System.out.println("Age Is : "+age);
		System.out.println("Mobile Num Is: "+mobileNumber);
		System.out.println("Gender Is    : "+gender);
	}
	
	public void detectMobileOperator(){
		String ransub=mobileNumber.substring(0,3);
		switch(ransub) {
		case "017": {
			System.out.println("This Is GrameenPhone");
			break;
		}
		case "016": {
			System.out.println("This Is Airtel");
			break;
		}
		case "019": {
			System.out.println("This Is Banglalink");
			break;
		}
		case "018": {
			System.out.println("This Is Robi");
			break;
		}
		default: {
			System.out.println("Wrong OPT");
		}
		}
		
		
		
	}
}
