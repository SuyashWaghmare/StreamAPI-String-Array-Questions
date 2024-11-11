package Streams;
import java.util.*;

public class Adriana {
    static void countNumbers(List<List<Integer>> arr) {
        for (List<Integer> pair : arr) {
            int lower = pair.get(0);
            int upper = pair.get(1);
            int count = 0;
            for (int num = lower; num <= upper; num++) {
                if (hasDistinctDigits(num)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    static boolean hasDistinctDigits(int num) {
        Set<Character> set = new HashSet<>();
        char[] digits = String.valueOf(num).toCharArray();
        for (char digit : digits) {
            if (!set.add(digit)) {
                return false; // Found a repeating digit
            }
        }
        return true; // All digits are distinct
    }

    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(1, 20));
        arr.add(Arrays.asList(9, 19));

        countNumbers(arr);
    }
}
