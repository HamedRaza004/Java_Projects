public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");
        sb.insert(5, ",");
        sb.replace(6, 11, " Java");
        sb.delete(0, 1);
        sb.reverse();

        System.out.println("Final string: " + sb.toString());
    }

}
