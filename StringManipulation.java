import java.util.function.Function;

public class StringManipulation {

    public static void main(String[] args) {
        // Input string
        String inputString = "Hello sir,My Name Is Adesh.";
        
        // Lambda expression to convert the string to uppercase
        Function<String, String> toUpperCase = str -> str.toUpperCase();
        
        // Manipulate the string using the toUpperCase lambda expression
        String upperCaseString = manipulateString(inputString, toUpperCase);
        System.out.println("Uppercase: " + upperCaseString);
        
        // Lambda expression to convert the string to lowercase
        Function<String, String> toLowerCase = str -> str.toLowerCase();
        
        // Manipulate the string using the toLowerCase lambda expression
        String lowerCaseString = manipulateString(inputString, toLowerCase);
        System.out.println("Lowercase: " + lowerCaseString);
        
        // Lambda expression to reverse the string
        Function<String, String> reverseString = str -> new StringBuilder(str).reverse().toString();
        
        // Manipulate the string using the reverseString lambda expression
        String reversedString = manipulateString(inputString, reverseString);
        System.out.println("Reversed: " + reversedString);
    }
    
    // Method to manipulate the input string using a given lambda expression
    public static String manipulateString(String input, Function<String, String> function) {
        return function.apply(input);
    }
}
