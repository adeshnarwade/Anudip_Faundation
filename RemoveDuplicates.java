import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Create a list of strings with duplicates
        List<String> strings = Arrays.asList("apple", "Abhi", "apple", "orange", "banana","Abhi", "mango","Aadesh","Aadesh","Harsh");

        // Remove duplicates using Stream API without lambda expressions
        List<String> uniqueStrings = strings.stream()
                                            .distinct()
                                            .collect(Collectors.toList());

        // Print the list of unique strings
        System.out.println("Unique strings: " + uniqueStrings);
    }
}
