import java.util.Scanner;

public class MethodReferenceExample {

    // Static method to calculate the square of a number
    public static int square(int num) {
        return num * num;
    }
    
 // Functional interface for a function that takes an integer and returns an integer
    @FunctionalInterface
    interface SquareCalculator {
        int calculateSquare(int num);
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        // Using method reference to refer to the static method square
        SquareCalculator calculator = MethodReferenceExample::square;

        // Calling the calculateSquare method using the method reference
        int result = calculator.calculateSquare(userInput);
        System.out.println("Square of " + userInput + ": " + result);

        // Close the scanner
        scanner.close();
    }
}
