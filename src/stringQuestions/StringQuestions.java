package stringques;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class StringQuestions {
    public static void main(String[] args) {
        // 1) Count the total number of characters in a string
        String s1 = "suyashwaghmare";
        System.out.println("Total number of characters in the string: " + s1.length());

        // 2) Count the total number of punctuation characters exists in a String
        String s2 = "Hello! How are you?";
        int punctuationCount = 0;
        for (char c : s2.toCharArray()) {
            if (c == '.' || c == ',' || c == '!' || c == '?') {
                punctuationCount++;
            }
        }
        System.out.println("Total number of punctuation characters: " + punctuationCount);

        // 3) Count the total number of vowels and consonants in a string
        String s3 = "hello world";
        int vowels = 0, consonants = 0;
        for (char c : s3.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            } else if (c >= 'a' && c <= 'z') {
                consonants++;
            }
        }
        System.out.println("Total number of vowels: " + vowels);
        System.out.println("Total number of consonants: " + consonants);

        // 4) Determine whether two strings are anagrams
        String s4a = "listen";
        String s4b = "silent";
        char[] charArray4a = s4a.toCharArray();
        char[] charArray4b = s4b.toCharArray();
        Arrays.sort(charArray4a);
        Arrays.sort(charArray4b);
        boolean areAnagrams = Arrays.equals(charArray4a, charArray4b);
        System.out.println("Are '" + s4a + "' and '" + s4b + "' anagrams? " + areAnagrams);

        // 5) Divide a string in 'N' equal parts
        String s5 = "HelloWorld";
        int parts = 3;
        int partLength = s5.length() / parts;
        String[] dividedString = new String[parts];
        int index = 0;
        for (int i = 0; i < s5.length(); i += partLength) {
           // dividedString[index++] = s5.substring(i, Math.min(i + partLength, s5.length()));
        }
        System.out.println("Divided string in " + parts + " equal parts: " + Arrays.toString(dividedString));

        // 6) Find all subsets of a string
        String s6 = "abc";
        int n = s6.length();
        for (int i = 0; i < (1 << n); i++) {
            StringBuilder subset = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    subset.append(s6.charAt(j));
                }
            }
            System.out.println(subset);
        }

        // 7) Find the longest repeating sequence in a string
        String s7 = "abcbda";
        int maxLength = 0;
        String longestSequence = "";
        for (int i = 0; i < s7.length(); i++) {
            for (int j = i + 1; j < s7.length(); j++) {
                String sub1 = s7.substring(i, j);
                String sub2 = s7.substring(j);
                if (sub2.contains(sub1) && sub1.length() > maxLength) {
                    maxLength = sub1.length();
                    longestSequence = sub1;
                }
            }
        }
        System.out.println("Longest repeating sequence: " + longestSequence);

        // 8) Find all permutations of a string
        String s8 = "abc";
        permutation("", s8);

        // 9) Remove all the white spaces from a string
        String s9 = "Hello World";
        String noSpaces = s9.replaceAll("\\s", "");
        System.out.println("String without spaces: " + noSpaces);

        // 10) Replace lower-case characters with upper-case and vice-versa
        String s10 = "HeLlo WoRld";
        StringBuilder swappedCase = new StringBuilder();
        for (char c : s10.toCharArray()) {
            if (Character.isUpperCase(c)) {
                swappedCase.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                swappedCase.append(Character.toUpperCase(c));
            } else {
                swappedCase.append(c);
            }
        }
        System.out.println("String with swapped case: " + swappedCase);

        // 11) Replace the spaces of a string with a specific character
        String s11 = "Hello World";
        String replacedSpaces = s11.replaceAll("\\s", "-");
        System.out.println("String with spaces replaced: " + replacedSpaces);

        // 12) Determine whether a given string is a palindrome
        String s12 = "racecar";
        String reverseS12 = new StringBuilder(s12).reverse().toString();
        boolean isPalindrome = s12.equals(reverseS12);
        System.out.println("Is '" + s12 + "' a palindrome? " + isPalindrome);

        // 13) Determine whether one string is a rotation of another
        String s13a = "abcd";
        String s13b = "cdab";
        boolean isRotation = (s13a.length() == s13b.length() && (s13a + s13a).contains(s13b));
        System.out.println("Is '" + s13b + "' a rotation of '" + s13a + "'? " + isRotation);

        // 14) Find the maximum and minimum occurring character in a string
        String s14 = "hello world";
        int[] frequency = new int[256];
        for (char c : s14.toCharArray()) {
            frequency[c]++;
        }
        char maxChar = 0, minChar = 0;
        int maxFreq = 0, minFreq = Integer.MAX_VALUE;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > maxFreq) {
                maxFreq = frequency[i];
                maxChar = (char) i;
            }
            if (frequency[i] > 0 && frequency[i] < minFreq) {
                minFreq = frequency[i];
                minChar = (char) i;
            }
        }
        System.out.println("Maximum occurring character: " + maxChar);
        System.out.println("Minimum occurring character: " + minChar);

        // 15) Find Reverse of the string
        String s15 = "reverse";
        String reverseS15 = new StringBuilder(s15).reverse().toString();
        System.out.println("Reverse of '" + s15 + "': " + reverseS15);

        // 16) Find the duplicate characters in a string
        String s16 = "programming";
        Set<Character> dupChars = new LinkedHashSet<>();
        for (int i = 0; i < s16.length(); i++) {
            char c = s16.charAt(i);
            if (s16.indexOf(c) != s16.lastIndexOf(c)) {
                dupChars.add(c);
            }
        }
        System.out.println("Duplicate characters in '" + s16 + "': " + dupChars);

        // 17) Find the duplicate words in a string
        String s17 = "Java is Java and Java is fun";
        String[] words17 = s17.split(" ");
        Set<String> dupWords = new LinkedHashSet<>();
        Set<String> uniqueWords = new LinkedHashSet<>();
        for (String word : words17) {
            if (!uniqueWords.add(word)) {
                dupWords.add(word);
            }
        }
        System.out.println("Duplicate words in '" + s17 + "': " + dupWords);

        // 18) Find the frequency of characters
        String s18 = "hello world";
        Map<Character, Integer> charFrequency = new HashMap<>();
        for (char c : s18.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }
        System.out.println("Frequency of characters in '" + s18 + "': " + charFrequency);

        // 19) Find the largest and smallest word in a string
        String s19 = "This is a Java program";
        String[] words19 = s19.split(" ");
        String smallestWord = words19[0], largestWord = words19[0];
        for (String word : words19) {
            if (word.length() < smallestWord.length()) {
                smallestWord = word;
            }
            if (word.length() > largestWord.length()) {
                largestWord = word;
            }
        }
        System.out.println("Smallest word: " + smallestWord);
        System.out.println("Largest word: " + largestWord);

        // 20) Find the most repeated word in a text
        String s20 = "Java is fun and Java is cool";
        String[] words20 = s20.split(" ");
        Map<String, Integer> wordFrequency = new HashMap<>();
        for (String word : words20) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }
        int maxFrequency20 = 0;
        String mostRepeatedWord = "";
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            if (entry.getValue() > maxFrequency20) {
                maxFrequency20 = entry.getValue();
                mostRepeatedWord = entry.getKey();
            }
        }
        System.out.println("Most repeated word: " + mostRepeatedWord);

        // 21) Find the number of words in a text file
        String s21 = "Java is a programming language";
        int wordCount21 = s21.split("\\s+").length;
        System.out.println("Number of words: " + wordCount21);

        // 22) Separate the individual characters from a string
        String s22 = "hello";
        for (char c : s22.toCharArray()) {
            System.out.println(c);
        }

        // 23) Swap two string variables without using a third or temp variable
        String s23a = "hello";
        String s23b = "world";
        s23a = s23a + s23b;
        s23b = s23a.substring(0, s23a.length() - s23b.length());
        s23a = s23a.substring(s23b.length());
        System.out.println("s23a: " + s23a);
        System.out.println("s23b: " + s23b);

        // 24) Print smallest and biggest possible palindrome word in a given string
        String s24 = "wow madam level";
        String[] words24 = s24.split(" ");
        String smallestPalindrome = "", biggestPalindrome = "";
        int smallestLength = Integer.MAX_VALUE, biggestLength = Integer.MIN_VALUE;
        for (String word : words24) {
            if (isPalindrome(word)) {
                if (word.length() < smallestLength) {
                    smallestLength = word.length();
                    smallestPalindrome = word;
                }
                if (word.length() > biggestLength) {
                    biggestLength = word.length();
                    biggestPalindrome = word;
                }
            }
        }
        System.out.println("Smallest palindrome word: " + smallestPalindrome);
        System.out.println("Biggest palindrome word: " + biggestPalindrome);

        // 25) Reverse String in Java Word by Word
        String s25 = "Hello World";
        String[] words25 = s25.split("\\s+");
        StringBuilder reverseS25 = new StringBuilder();
        for (int i = words25.length - 1; i >= 0; i--) {
            reverseS25.append(words25[i]).append(" ");
        }
        System.out.println("Reverse string (word by word): " + reverseS25.toString().trim());

        // 26) Reverse String without reverse() function
        String s26 = "Hello";
        StringBuilder reverseS26 = new StringBuilder();
        for (int i = s26.length() - 1; i >= 0; i--) {
            reverseS26.append(s26.charAt(i));
        }
        System.out.println("Reverse string without reverse() function: " + reverseS26.toString());

        // 27) Find all subsets of a string (alternative approach)
        String s27 = "abc";
        int n27 = s27.length();
        for (int i = 0; i < (1 << n27); i++) {
            StringBuilder subset = new StringBuilder();
            for (int j = 0; j < n27; j++) {
                if ((i & (1 << j)) > 0) {
                    subset.append(s27.charAt(j));
                }
            }
            System.out.println(subset);
        }
    }

    // Helper method for finding permutations
    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
            }
        }
    }

    // Helper method for checking if a string is a palindrome
    private static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}
