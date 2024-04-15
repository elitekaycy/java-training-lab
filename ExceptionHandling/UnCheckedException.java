package ExceptionHandling;

public class UnCheckedException {

    class User {
        private String name;
        public String getName() {
            return this.name;
        }

    }
    public static String retrieveUserName(User user) {
        String name = "";
        try {
            name = user.getName();
        } catch (NullPointerException e) {
            System.out.println("Error: User object is null");
        }
        return name;
    }
}
