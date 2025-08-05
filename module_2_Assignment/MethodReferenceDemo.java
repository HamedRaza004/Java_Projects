interface SquareCalculator {
    int calculate(int x);
}

public class MethodReferenceDemo {
    public static int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        SquareCalculator calc = MethodReferenceDemo::square;
        int result = calc.calculate(6);
        System.out.println("Square: " + result);
    }
}
