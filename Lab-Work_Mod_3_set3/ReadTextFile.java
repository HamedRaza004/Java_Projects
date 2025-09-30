import java.io.FileInputStream;
import java.io.IOException;

public class ReadTextFile {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("input.txt")) {
            System.out.println("--- Reading from input.txt ---");
            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
            System.out.println();
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
