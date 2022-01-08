package DSAArrays;

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
		char[] charArray = str.toCharArray();
		char temp;
		int i = 0;
		int j = str.length() - 1;
		String ans;
		while (i < j) {
			temp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = temp;
			i++;
			j--;

		}
		ans = String.valueOf(charArray);
		return ans;

	}
}
