package DSAString;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Driver {
	public static void main(String args[]) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(read.readLine());

		while (t-- > 0) {
			String str = read.readLine();
			System.out.println(new Reverse().reverseWord(str));
		}
	}
}// } Driver Code Ends

//User function Template for Java

class Reverse {
// Complete the function
// str: input string
	public static String reverseWord(String str) {
		String new_str = "";
		char ch;
		for (int i = str.length() - 1; i >= 0; i--) {

			ch = str.charAt(i);
			;
			new_str = new_str + ch;
		}
		return new_str;
}
}
