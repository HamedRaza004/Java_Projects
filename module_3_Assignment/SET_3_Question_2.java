import java.io.FileOutputStream;
import java.io.IOException;

public class SET_3_Question_2 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            String text = "Java I/O Streams Example";
            fos.write(text.getBytes());
            System.out.println("Successfully wrote to output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
