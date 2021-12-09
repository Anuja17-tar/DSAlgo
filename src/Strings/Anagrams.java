package Strings;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "listn";
		String b = "silent";
		boolean isAnagram = true;
		int[] al = new int[256];
		// int[] bl = new int[256];
		for (char c : a.toCharArray()) {
			int index = c;
			al[index]++;
		}
		for (char c : b.toCharArray()) {
			int index = c;
			// bl[index]++;
			al[index]--;
		}
		for (int i = 0; i < 256; i++) {
			// if (al[i] != bl[i])
			if (al[i] != 0) {
				isAnagram = false;
			}
		}

		if (isAnagram) {
			System.out.println("Strings are anagrams");
		} else {
			System.out.println("Strings are not anagrams");
		}
	}

}
