import java.util.InputMismatchException;
import java.util.Scanner;

public class IntegerInputHandler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continueInput = true;
        while (continueInput) {
            try {
                // Prompt the user to enter an integer
                System.out.print("Enter an integer: ");
                int number = scanner.nextInt(); // Attempt to read an integer from the user

                // If no exception occurs, display the entered integer
                System.out.println("You entered: " + number);

                // Ask the user if they want to enter another integer
                System.out.print("Do you want to enter another integer? (yes/no): ");
                String choice = scanner.next();
                if (!choice.equalsIgnoreCase("yes")) {
                    continueInput = false; // Set continueInput to false to exit the loop
                }
            } catch (InputMismatchException e) {
                // If InputMismatchException occurs (user entered non-integer), display error message
                System.out.println("Error: Please enter a valid integer.");
                scanner.nextLine(); // Clear the input buffer
            }
        }

        scanner.close(); // Close the scanner to release resources
    }
}
