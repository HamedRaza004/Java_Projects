public class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
class AdvancedCalculator extends Calculator {
    @Override
    int add(int a, int b) {
        System.out.println("Overridden add method in AdvancedCalculator");
        return super.add(a, b);
    }
}
