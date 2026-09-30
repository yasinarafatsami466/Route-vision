public class User {

    private int userId;
    private String name;
    private String phone;
    private String email;

    public User(int userId, String name, String phone, String email) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void searchBus(String route) {
        System.out.println(name + " is searching for buses on " + route);
    }

    public void giveFeedback(String feedback) {
        System.out.println("Feedback: " + feedback);
    }
}