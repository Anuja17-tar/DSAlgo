package DSAString;

public class SplitBinary {

	public static void main(String[] args) {
		String binary = "00000000";
		int ans = split(binary);
		System.out.println(ans);

	}

	private static int split(String binary) {
		int x = 0, y = 0;
		int ans = 0;
		int n = binary.length();
		for (int i = 0; i < n; i++) {
			if (binary.charAt(i) == '0')
				x++;
			else if (binary.charAt(i) == '1')
				y++;
			if (x == y) {
				ans++;

			}

		}
		if (x != y)
			return -1;
		return ans;

	}

}
