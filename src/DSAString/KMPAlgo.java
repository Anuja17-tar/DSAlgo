package DSAString;

public class KMPAlgo {

	public static void main(String[] args) {
		String S = "aaaabbbddaaaa";
		int x = lps(S);
		System.out.println(x);
	}

	private static int lps(String s) {
		// TODO Auto-generated method stub
		return 0;
	}
//brute-force
//	private static int lps(String s) {
//		String a ="";String b="";
//		int n = s.length();
//		int ans = -1;
//		for(int i =0 ; i<n-1;i++) {
//			a = a + s.charAt(i);
//			b = s.charAt(n - i - 1) + b;
//
//			if (a.equals(b)) {
//				ans = a.length();
//			}
//		}
//		return ans;
//
//	}

}
