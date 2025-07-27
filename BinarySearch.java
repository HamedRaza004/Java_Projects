import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArray = {3, 7, 12, 18, 24, 31, 45, 59};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter element to search: ");
        int key = scanner.nextInt();

        int low = 0;
        int high = sortedArray.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (sortedArray[mid] == key) {
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            } else if (key < sortedArray[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (!found) {
            System.out.println("Element not found.");
        }

        scanner.close();
    }
}
