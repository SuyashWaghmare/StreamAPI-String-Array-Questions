package arraysques;
import java.util.*;
import java.util.stream.Collectors;

public class ArrayOperations {

    public static void main(String[] args) {
        // Array Operations
        int[] numbers = {5, 2, 8, 3, 1, 1};

        // 1. Finding Second Smallest Element
        findSecondSmallestElement(numbers);

        // 2. Reversing an Array In-place
        reverseArrayInPlace(numbers);

        // 3. Finding the Longest String in an Array
        findLongestString();

        // 4. Removing Duplicates from an Array
        removeDuplicatesFromArray();

        // 5. Finding Duplicates in an Array
        findDuplicatesInArray(numbers);

        // Arrays.asList() Operations
        List<Integer> list = Arrays.asList(5, 2, 8, 3, 1, 1);

        // 6. Finding Common Elements between Two Lists
        findCommonElementsBetweenLists(list);

        // 7. Sorting Array and List in Ascending Order
        sortArrayAndListAscending(numbers, list);

        // 8. Sorting List in Descending Order
        sortListDescending(list);

        // 9. Removing Duplicates from a List
        removeDuplicatesFromList(list);

        // 10. Finding Duplicates in a List
        findDuplicatesInList(list);
    }

    // Array Operations
    private static void findSecondSmallestElement(int[] numbers) {
        int secondSmallestElement = Arrays.stream(numbers)
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Array does not have a second smallest element"));

        System.out.println("Second smallest element: " + secondSmallestElement);
    }

    private static void reverseArrayInPlace(int[] numbers) {
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }

        System.out.println("Reversed array: " + Arrays.toString(numbers));
    }

    private static void findLongestString() {
        String[] fruits = {"Apple", "Banana", "Avocado", "Apricot", "Grapes"};
        int longestFruitLength = Arrays.stream(fruits)
                .mapToInt(String::length)
                .max()
                .orElse(0);

        System.out.println("Length of longest fruit: " + longestFruitLength);
    }

    private static void removeDuplicatesFromArray() {
        String[] strings = {"apple", "banana", "orange", "banana", "apple", "orange"};
        Set<String> uniqueStrings = new LinkedHashSet<>(Arrays.asList(strings));
       // System.out.println(uniqueStrings);
        String[] uniqueArray = uniqueStrings.toArray(new String[0]);

        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArray));
    }

    private static void findDuplicatesInArray(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int number : numbers) {
            if (!set.add(number)) {
                duplicates.add(number);
            }
        }

        System.out.println("Duplicates in the array: " + duplicates);
    }

    // Arrays.asList() Operations
    private static void findCommonElementsBetweenLists(List<Integer> list) {
        List<Integer> list1 = Arrays.asList(5, 2, 8, 3, 1, 1);
        List<Integer> list2 = Arrays.asList(6, 1, 7, 9, 5, 4);

        list1.stream().filter(list2::contains).forEach(System.out::println);
    }

    private static void sortArrayAndListAscending(int[] numbers, List<Integer> list) {
        // Sorting the array in ascending order
        Arrays.sort(numbers);
        System.out.println("Array in ascending order: " + Arrays.toString(numbers));

        // Sorting the list in ascending order
        list.stream().sorted().forEach(num -> System.out.print(num + " "));
        System.out.println(); // Add a newline after printing ascending order
    }

    private static void sortListDescending(List<Integer> list) {
        // Sorting the list in descending order
        list.stream().sorted(Collections.reverseOrder()).forEach(num -> System.out.print(num + " "));
        System.out.println(); // Add a newline after printing descending order
    }

    private static void removeDuplicatesFromList(List<Integer> list) {
        // Remove duplicates from the list
        List<Integer> distinctList = list.stream().distinct().collect(Collectors.toList());
        System.out.println("List without duplicates: " + distinctList);
    }

    private static void findDuplicatesInList(List<Integer> list) {
        // Find duplicates in the list
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = list.stream()
                                      .filter(e -> !set.add(e))
                                      .collect(Collectors.toSet());

        System.out.println("Duplicates in the list: " + duplicates);
    }
}
