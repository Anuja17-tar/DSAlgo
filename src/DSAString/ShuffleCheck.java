package DSAString;

import java.util.Arrays;

public class ShuffleCheck {

	public static void main(String[] args) {
		String str = "XY";
		String str1 = "12";
		String res = "Y1X2";
		if (shuffle(str, str1, res))
			System.out.println("Yes");
		else
			System.out.println("no");

	}

	private static boolean shuffle(String str1, String str2, String res) {
		boolean ans = true;
		// check if length is same
		if (str1.length() != str2.length())
			return false;
		// sort the strings
		String first = sortStrings(str1);
		String second = sortStrings(str2);
		String result = sortStrings(res);
		// check if res contains all the characters
		int k = 0;
		int i = 0;
		int j = 0;
		while (k != result.length()) {
			if (i < first.length() && first.charAt(i) == result.charAt(k)) {
				i++;

			} else if (j < second.length() && second.charAt(j) == result.charAt(k)) {
				j++;

			} else
				return false;

			k++;

		}
		if (i < first.length() || j < second.length())
			return false;

		return true;

	}

	private static String sortStrings(String str1) {
		char[] arr = str1.toCharArray();
		Arrays.sort(arr);
		String str = String.valueOf(arr);
		return str;
	}

}
