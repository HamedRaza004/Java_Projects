import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SET_3_Question_3 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter a string: ");
            String str = reader.readLine();

            System.out.print("Enter an integer: ");
            int num = Integer.parseInt(reader.readLine());

            System.out.println("You entered string: " + str);
            System.out.println("You entered integer: " + num);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
