package stringques;

import java.util.Arrays;

public class Sortingstrcharalphaorder {
	public static void main(String[] args) {

		// way 1

		String str = "JAVA";

		char[] charArray = str.toCharArray();

		Arrays.sort(charArray);

		System.out.println(charArray);

		// way 2

		String str2 = "INDIA";

		char[] arr = str2.toCharArray();

		char temp;

		for (int i = 0; i < str2.length(); i++) {
			for (int j = i + 1; j < str2.length(); j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}

		System.out.println(arr);

	}

}
