public class Admin
{
    String username;
    String password;
    
    public Admin(final String username, final String password) {
        this.username = username;
        this.password = password;
    }
    
    boolean login() {
    	
        final WeddingSystem in = WeddingSystem.getInstance();
        System.out.println(in.myAdmins.size());
        for (int i = 0; i < in.myAdmins.size(); ++i) {
            if (in.myAdmins.get(i).username.equals(this.username) && in.myAdmins.get(i).password.equals(this.password)) {
                return true;
            }
        }
        return false;
    }
    
    boolean register() {
        final WeddingSystem in = WeddingSystem.getInstance();
        for (int i = 0; i < in.myAdmins.size(); ++i) {
            if (in.myAdmins.get(i).username.equals(this.username) && in.myAdmins.get(i).password.equals(this.password)) {
                return false;
            }
        }
        in.myAdmins.add(new Admin(this.username, this.password));
        in.saveToFile();
        return true;
    }
}