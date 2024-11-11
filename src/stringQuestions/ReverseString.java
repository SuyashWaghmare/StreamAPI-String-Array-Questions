package stringques;

public class ReverseString {

	public static void main(String[] args) {

		String str1 = "suyash";

		// Reverse String
		// 1 st way

		StringBuffer sb = new StringBuffer(str1);

		System.out.println(sb.reverse());

		// 2nd way

		String str2 = "waghmare";

		String str3 = "";

		for (int i = str2.length() - 1; i >= 0; i--) {
			str3 = str3 + str2.charAt(i);

		}

		System.out.println(str3);
		
		
		String str4 = "rolex";
		
		char[] charArray = str4.toCharArray();
		
		for(int i = charArray.length-1; i>=0; i--)
		{
			System.out.print(charArray[i]);    // use print only to print in horizontal way
		}
		
		System.out.println();
	}
}


class A{
	public static void main(String[] args) {
		System.out.printf("Hello");
	}
}