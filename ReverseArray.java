public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};

        System.out.print("Original array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }

        System.out.print("\nReversed array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

