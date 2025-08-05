public class MinMaxInArray {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 78, 4, 90, 23, 7};

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min)
                min = numbers[i];
            if (numbers[i] > max)
                max = numbers[i];
        }

        System.out.println("Smallest number: " + min);
        System.out.println("Largest number: " + max);
    }
}
