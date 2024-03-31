import java.io.FileReader;
import java.io.IOException;

public class CharacterReader {
    public static void main(String[] args) {
        // Path to the input file
        String filePath = "C:\\Users\\narwa\\Documents\\Adesh Narvade\\SCHOLERSHIP\\aadesh.txt";

        // Try-with-resources to automatically close the FileReader
        try (FileReader reader = new FileReader(filePath)) {
            int character; // Variable to store each character read
            int totalCharacters = 0; // Variable to store the total number of characters in the file

            // Read characters until end of file
            while ((character = reader.read()) != -1) {
                // Output the character
                System.out.print((char) character);
                
                // Increment the total character count
                totalCharacters++;
            }

            // Print total number of characters
            System.out.println("\nTotal number of characters: " + totalCharacters);
        } catch (IOException e) {
            // Error handling in case of file reading failure
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
