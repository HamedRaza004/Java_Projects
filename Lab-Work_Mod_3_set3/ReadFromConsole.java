import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromConsole {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter a string: ");
            String str = reader.readLine();
            System.out.print("Enter an integer: ");
            int num = Integer.parseInt(reader.readLine().trim());
            System.out.println("You entered: \"" + str + "\" and " + num);
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error reading from console: " + e.getMessage());
        }
    }
}

