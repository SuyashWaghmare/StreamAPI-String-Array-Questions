package stringques;

public class Splitstring {
    public static void main(String[] args) {
        // split string
        String s = "India is my country";

        // Split the string by whitespace
        String[] words = s.split(" ");

        // Print each word
        for (String w : words) {
            System.out.println(w);
        }
    }
}
