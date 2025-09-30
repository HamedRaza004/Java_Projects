import java.io.FileOutputStream;
import java.io.IOException;

public class WriteTextFile {
    public static void main(String[] args) {
        String text = "Java I/O Streams Example";
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            fos.write(text.getBytes());
            System.out.println("Successfully wrote to output.txt");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
