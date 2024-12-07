public class User
{
    String username;
    String password;
    
    public User() {
    }
    
    public User(final String username, final String password) {
        this.username = username;
        this.password = password;
    }
    
    boolean login(final String u, final String p) {
        final WeddingSystem in = WeddingSystem.getInstance();
        for (int i = 0; i < in.myUsers.size(); ++i) {
            if (in.myUsers.get(i).username.equals(u) && in.myUsers.get(i).password.equals(p)) {
                return true;
            }
        }
        return false;
    }
    
    boolean register(final String u, final String p) {
        final WeddingSystem in = WeddingSystem.getInstance();
        for (int i = 0; i < in.myUsers.size(); ++i) {
            if (in.myUsers.get(i).username.equals(u)) {
                return false;
            }
        }
        in.myUsers.add(new User(u, p));
        return true;
    }
}