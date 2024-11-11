package stringques;

public class Removespechar {
	public static void main(String[] args) {
		
		String str = "&%$J$A#V&A";
		
		 // Remove special characters using regular expression
        String s = str.replaceAll("[^a-zA-Z0-9]", ""); // ^ means negation, so it matches any character not in the specified range
        System.out.println(s);
		
		
		
		
		
		
		
	}

}
