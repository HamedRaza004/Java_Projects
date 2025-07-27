import java.util.Scanner;

public class SplitString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");

        for (String word : words) {
            System.out.println(word);
        }

        scanner.close();
    }
}
