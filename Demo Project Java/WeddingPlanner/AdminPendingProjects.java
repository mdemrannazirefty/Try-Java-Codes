package WeddingPlanner;

public class AdminPendingProjects {
	WeddingSystem in;
	String username;

	public AdminPendingProjects() {
		this.in = WeddingSystem.getInstance();
	}
	
	void populateAdminTable() {
		String leftAlignFormat = "| %-15s | %-15s | %-15s | %-15s |%n";

		System.out.format("+-----------------+----------------+----------------+----------------+%n");
		System.out.format("| ID              | Package name   | Cost range     | Username       |%n");
		System.out.format("+-----------------+----------------+----------------+----------------+%n");
		
        for (int i = 0; i < this.in.myPendingUserEvents.size(); ++i) {
            final UserEvents temp = this.in.myPendingUserEvents.get(i);
            if (temp.status == 0) {
            	System.out.format(leftAlignFormat, temp.id, temp.e.packageName, temp.e.costRange, temp.u.username);
                
            }
        }
        
        System.out.format("+-----------------+----------------+----------------+----------------+%n");
    }
}
