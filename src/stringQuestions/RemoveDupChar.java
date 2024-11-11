package stringques;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupChar {
	public static void main(String[] args) {

		String str = "suyash";

		// 2. Remove Duplicate characters
		// way 1

		StringBuilder sbt1 = new StringBuilder();

		str.chars().distinct().forEach(c -> sbt1.append((char) c));

		System.out.println(sbt1);

		// way 2
		
		String str2 = "programming";
		
		StringBuilder sbt2 = new StringBuilder();
		
		Set<Character> set = new LinkedHashSet<>();
		
		for (int i=0;i<str2.length();i++)
		{
			set.add(str2.charAt(i));
		}
		
		for (Character c : set)
		{
			sbt2.append(c);
		}
		System.out.println(sbt2);

	}
}
