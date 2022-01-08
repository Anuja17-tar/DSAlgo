package DSAString;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//{ Driver Code Starts
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class AllPErmutations

{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String S = br.readLine().trim();
			Solution1s obj = new Solution1s();
			List<String> ans = obj.find_permutation(S);
			for (int i = 0; i < ans.size(); i++) {
				System.out.print(ans.get(i) + " ");
			}
			System.out.println();

		}
	}
}

//} Driver Code Ends

class Solution1s {

	public String swap(String s, int i, int j) {
		char temp;
		char[] charArray = s.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;

		return String.valueOf(charArray);
	}

	public void permute(String str, int l, int r, ArrayList<String> al) {
		if (l == r)
			al.add(str);
		else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permute(str, l + 1, r, al);
				str = swap(str, l, i);
			}
		}
	}

	public List<String> find_permutation(String S) {

		ArrayList<String> al = new ArrayList<>();
		permute(S, 0, S.length() - 1, al);
		Collections.sort(al);
		return al;
	}
}
