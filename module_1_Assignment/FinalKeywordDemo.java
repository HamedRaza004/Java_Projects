final class FinalClass {
    void display() {
        System.out.println("This is a final class.");
    }
}

class Demo {
    final int CONSTANT_VALUE = 100;

    final void showMessage() {
        System.out.println("Final method in Demo class.");
    }

    void printValue() {
        System.out.println("Final variable value: " + CONSTANT_VALUE);
    }
}

class SubDemo extends Demo {
}

public class FinalKeywordDemo {
    public static void main(String[] args) {
        FinalClass fc = new FinalClass();
        fc.display();

        SubDemo sd = new SubDemo();
        sd.showMessage();
        sd.printValue();
    }
}
