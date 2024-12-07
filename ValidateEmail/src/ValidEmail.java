import java.util.Scanner;

public class ValidEmail {
	public static void main(String[] args) {
		String er = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		
		System.out.print("ENTER YOUR Email:");
		Scanner sc= new Scanner(System.in);
		
        String e = sc.nextLine();
        
        if (e==null) {
			System.out.println("iv");
		}
        else if(e!=er){
        	System.out.println("iv");
        }
        else {
        	System.out.println("V");
        }
        
    }
	
}
	

	
	
		
		