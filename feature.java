// feature.java
public class Feature {
    public static void main(String[] args) {
        System.out.println("Initial version");

        // Task-120: Add logout feature
        logout();

        // Task-101: Add login feature
        login("user", "pass");
    }

    public static void logout() {
        System.out.println("Logging out...");
    }

    public static void login(String username, String password) {
        System.out.println("Logging in with " + username);
    }
}
