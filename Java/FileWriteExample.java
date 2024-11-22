import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {
        String filePath = "example.java";
        String content = "Hello, this is a sample text written to the file.";

        try (FileWriter writer = new FileWriter(filePath);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {

            // Writing to the file
            bufferedWriter.write(content);
            System.out.println("Content written to file successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
