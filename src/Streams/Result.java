package Streams;

import java.util.*;

public class Result {
	public static String[] getWho(int n, String[] s) {
		String[] result = new String[n];

		for (int i = 0; i < n; i++) {
			String str = s[i];
			int vowelsCount = countVowels(str);

			result[i] = (vowelsCount % 2 == 1) ? "Alex" : "Chris";
		}

		return result;
	}

	private static int countVowels(String str) {
		int count = 0;
		for (char ch : str.toCharArray()) {
			if ("aeiouAEIOU".indexOf(ch) != -1) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int n = 3;
		String[] s = { "lgzpc", "lchxlo", "xrwzg" };

		String[] result = getWho(n, s);
		for (String res : result) {
			System.out.println(res);
		}
	}
}
