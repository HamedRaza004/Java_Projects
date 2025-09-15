
// 1.Create a user-defined generic class Box<T> with methods addItem(T item) and getItem(). Demonstrate its usage with String and Integer types.
class Box<T> {
    private T item;

    public void addItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class Question1 {
    public static void main(String[] args) {
        // Demonstrate with String
        Box<String> stringBox = new Box<>();
        stringBox.addItem("Hello, Generics!");
        String message = stringBox.getItem();
        System.out.println("String Box item: " + message);

        // Demonstrate with Integer
        Box<Integer> integerBox = new Box<>();
        integerBox.addItem(123);
        Integer number = integerBox.getItem();
        System.out.println("Integer Box item: " + number);
    }
}
