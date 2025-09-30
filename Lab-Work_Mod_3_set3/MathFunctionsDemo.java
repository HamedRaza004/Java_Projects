public class MathFunctionsDemo {
    public static void main(String[] args) {
        System.out.println("--- Demonstrating Math functions ---");

        // Math.random()
        double randomValue = Math.random();
        System.out.println("1. Math.random(): " + randomValue);

        // Math.abs()
        int negativeValue = -10;
        int absoluteValue = Math.abs(negativeValue);
        System.out.println("2. Math.abs(" + negativeValue + "): " + absoluteValue);

        // Math.pow()
        double base = 2;
        double exponent = 3;
        double powerResult = Math.pow(base, exponent);
        System.out.println("3. Math.pow(" + base + ", " + exponent + "): " + powerResult);
    }
}
