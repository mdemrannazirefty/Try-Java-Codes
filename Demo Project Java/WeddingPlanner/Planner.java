public class Planner {
	String username;
	String password;

	public Planner() {
	}

	public Planner(final String username, final String pass) {
		this.username = username;
		this.password = pass;
	}

	boolean login(final String u, final String p) {
		final WeddingSystem in = WeddingSystem.getInstance();
		for (int i = 0; i < in.myPlanners.size(); ++i) {
			if (in.myPlanners.get(i).username.equals(u) && in.myPlanners.get(i).password.equals(p)) {
				return true;
			}
		}
		return false;
	}

	boolean register(final String u, final String p) {
		final WeddingSystem in = WeddingSystem.getInstance();
		for (int i = 0; i < in.myPlanners.size(); ++i) {
			if (in.myPlanners.get(i).username.equals(u) && in.myPlanners.get(i).password.equals(p)) {
				return false;
			}
		}
		in.myPlanners.add(new Planner(u, p));
		return true;
	}
}