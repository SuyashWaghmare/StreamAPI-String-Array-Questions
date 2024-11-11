package arraysques;

import java.util.LinkedHashSet;
import java.util.Set;

public class Arrayexp5 {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "orange", "banana", "apple", "orange"};

        Set<String> uniqueStrings = new LinkedHashSet<>();
        
        
        for (String str : strings) {
            uniqueStrings.add(str);
        }
        
        

        String[] uniqueArray = uniqueStrings.toArray(new String[0]);

        for (String str : uniqueArray) {
            System.out.print(str + " ");
        }
    }
}
