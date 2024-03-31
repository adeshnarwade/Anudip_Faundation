import java.io.Console;

public class ConsoleInputAddition {
    public static void main(String[] args) {
        // Obtain the Console object
        Console console = System.console();
        
        if (console == null) {
            System.err.println("No console.");
            System.exit(1);
        }

        // Read the first number as a String
        String num1Str = console.readLine("Enter the first number: ");

        // Read the second number as a String
        String num2Str = console.readLine("Enter the second number: ");

        try {
            // Convert the input strings to numbers
            double num1 = Double.parseDouble(num1Str);
            double num2 = Double.parseDouble(num2Str);

            // Perform addition
            double sum = num1 + num2;

            // Print the result
            System.out.println("Sum: " + sum);
        } catch (NumberFormatException e) {
            // Handle the case where input cannot be parsed as numbers
            System.err.println("Invalid input: Please enter valid numbers.");
        }
    }
}
