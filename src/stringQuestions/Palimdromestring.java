package stringques;

public class Palimdromestring {
	public static void main(String[] args) {
		String str1 = "company";

		String str2 = "";

		for (int i = str1.length() - 2; i >= 0; i--) {
			str2 = str2 + str1.charAt(i);

		}

		System.out.println(str1 + str2);

	}
}
