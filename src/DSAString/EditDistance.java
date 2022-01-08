package DSAString;

public class EditDistance {

	public static void main(String[] args) {
		String s = "geek";
		String t = "gesek";
		int n = editDistance(s, t);
		System.out.println(n);

	}

	private static int editDistance(String s, String t) {
		int j = 0;
		String ans = "";
		int res = 0;
		for (int i = 0; i < t.length(); i++) {
			while (j < s.length()) {
				if (s.charAt(j) == t.charAt(i)) {
					ans = ans + s.charAt(j);
					j++;
				} else if (s.charAt(j) != t.charAt(i)) {
					ans = ans + t.charAt(i);
					res++;
				}
			}
		}
		return res;

	}

}
