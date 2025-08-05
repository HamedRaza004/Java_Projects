final class Vehicle {
    final void display() {
        System.out.println("This is a final method in a final class.");
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.display();
    }
}
