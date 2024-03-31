import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringConcatenation {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> strings = Arrays.asList("Hello", " ", "my", " ", "name", " ", "is", " ", "Aadesh");

        // Concatenate strings using Stream API without lambda expressions
        String concatenatedString = strings.stream()
                                           // Use Collectors.joining() to concatenate strings
                                           .collect(Collectors.joining());

        // Print the concatenated string
        System.out.println("Concatenated String: " + concatenatedString);
    }
}
