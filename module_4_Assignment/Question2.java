
import java.util.Arrays;

// 2.Write a generic method swapElements that swaps two elements in an array. Demonstrate its usage with different data types.
public class Question2 {

    public static <T> void swapElements(T[] array, int index1, int index2) {
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            throw new IndexOutOfBoundsException("Invalid indices for the array.");
        }
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        // Demonstrate with an Integer array
        Integer[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Original Integer array: " + Arrays.toString(numbers));
        swapElements(numbers, 1, 3);
        System.out.println("Integer array after swapping elements at index 1 and 3: " + Arrays.toString(numbers));

        System.out.println("-----------------------------------");

        // Demonstrate with a String array
        String[] names = {"Alice", "Bob", "Charlie", "David"};
        System.out.println("Original String array: " + Arrays.toString(names));
        swapElements(names, 0, 2);
        System.out.println("String array after swapping elements at index 0 and 2: " + Arrays.toString(names));
    }
}
