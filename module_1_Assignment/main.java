import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        try {
            System.out.println("Enter a number:");
            int num = scanner.nextInt();
            System.out.println(("The number is: " + num));
        }
        catch(InputMismatchException e){
            System.out.println("That wasn't a number");
        }
        }


        catch(ArithmeticException e) {
            System.out.println("YOU CAN'T DIVIDE BY ZERO!");
        }
        public int sum(int a, int b){
        return a+b;
    }
    System.out.println("Sum:", +sum(10,20));
}
