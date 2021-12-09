package Strings;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "I    Love   Java and   ";
		System.out.println(a);
		int i = a.length() - 1;
		int j;
		String ans = "";
		while (i >= 0) {
			while (i >= 0 && a.charAt(i) == ' ')
				i--;
			j = i;
			while (i >= 0 && a.charAt(i) != ' ')
				i--;
			if (ans.isEmpty()) {
				ans = ans.concat(a.substring(i + 1, j + 1));
			} else {

				ans = ans.concat(" " + a.substring(i + 1, j + 1));
			}
		}




		System.out.println(ans);
//		String[] words = a.split(" ");
//		String temp;
//		System.out.println(words.length);
//		for (int i = 0; i < (words.length / 2); i++) {
//			temp = words[i].strip();
//			words[i] = words[words.length - 1 - i].strip();
//			words[words.length - 1 - i] = temp;
//			System.out.println("1" + words[i]);
//			System.out.println("2" + words[words.length - 1 - i]);
//
//		}
//		for (String word : words) {
//			System.out.print(word.strip() + " ");
//		}

	}

}
