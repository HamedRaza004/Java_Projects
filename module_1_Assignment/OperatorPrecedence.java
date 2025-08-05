public class OperatorPrecedence {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 2;

        int result1 = a + b * c;
        int result2 = (a + b) * c;
        int result3 = a + b - c * a / b;

        System.out.println("a + b * c = " + result1);
        System.out.println("(a + b) * c = " + result2);
        System.out.println("a + b - c * a / b = " + result3);
    }
}
