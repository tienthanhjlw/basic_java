public class User {
    public String userName;
    public String email;
    public String password;

    @Override
    public String toString() {
        return "Your information: " +  userName + " " + email;
    }
}
