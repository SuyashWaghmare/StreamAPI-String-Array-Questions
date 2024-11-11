package stringques;

import java.util.HashMap;
import java.util.Map;

public class Counteachcharinstr {
	public static void main(String[] args) {

		String s = "suyashwaghmare";

		Map<Character, Integer> m = new HashMap<>();

		char[] ch = s.toCharArray();

		for (char c : ch) {
			if (!m.containsKey(c)) {
				m.put(c, 1);
			} else {
				Integer i = m.get(c);
				m.put(c, i + 1);
			}

		}
		System.out.println(m);
		
		

		// 2. Using Loops only

		String str = "suyashwaghmare";

		int[] charCount = new int[256];

		for (int i = 0; i <str.length(); i++) {
			charCount[s.charAt(i)]++;
		}
		for (int i = 0; i < charCount.length; i++) {
			if (charCount[i] > 0) {
				System.out.println((char) i + ":" + charCount[i]);
			}
		}
		
		
		
		

	}

}
