public class ReverseString {
    public static void main(String[] args) {
        String input = "Hello";
        char[] chars = input.toCharArray();
        String reversed = "";

        for (int i = chars.length - 1; i >= 0; i--) {
            reversed += chars[i];
        }

        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }
}
