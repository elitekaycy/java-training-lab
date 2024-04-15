package ExceptionHandling;

import java.io.FileNotFoundException;

public class ExceptionHandlingTest {

    public static void main(String[] args) {
         /**
         *
         * Test Scenario 1: Handling Arithmetic Errors
         *
         */
        double area = RectangleArea.calculateRectangleArea(5, 0);
        System.out.println("Area of rectangle: " + area);

        /**
         *  Test Scenario 2: Handling File I/O Exceptions
         *
         * */
        FileIOExceptionExample.readFromFile("nonexistent.txt");

        /** Test Scenario 3: Handling Checked Exceptions ******/
        try {
            CheckedException.readFromFile("nonexistentfile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
        }

        /**
         *  Test Scenario 4: Handling Unchecked Exceptions
         *  */
        UnCheckedException.User user = null;
        String userName = UnCheckedException.retrieveUserName(user);
        System.out.println("User Name: " + userName);
    }
}
