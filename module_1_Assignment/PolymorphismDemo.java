public class PolymorphismDemo {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();
        a.makeSound();

        a = new Cat();
        a.makeSound();
    }
}