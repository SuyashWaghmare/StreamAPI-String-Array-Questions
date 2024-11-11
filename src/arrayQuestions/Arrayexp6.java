package arraysques;

import java.util.stream.IntStream;

public class Arrayexp6 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            final int currentIndex = i; // Create effectively final copy of 'i'
            int productExceptCurrent = IntStream.range(0, numbers.length)
                    .filter(j -> j != currentIndex) // Use the copy instead of 'i'
                    .map(j -> numbers[j])
                    .reduce(1, (x, y) -> x * y);

            System.out.println("For element " + numbers[i] + ", product of all other elements: " + productExceptCurrent);
        }
    }
}
