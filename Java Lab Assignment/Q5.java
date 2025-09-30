import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q5 {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\hamed\\Java_Projects\\Java Lab Assignment\\products.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line.toUpperCase());
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
