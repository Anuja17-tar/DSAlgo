package DSAString;

public class countOfNumberofString2DArrray {

	public static void main(String[] args) {
		char a[][] = { { 'D', 'D', 'D', 'G', 'D', 'D' }, { 'B', 'B', 'D', 'E', 'B', 'S' },
				{ 'B', 'S', 'K', 'E', 'B', 'K' }, { 'D', 'D', 'D', 'D', 'D', 'E' }, { 'D', 'D', 'D', 'D', 'D', 'E' },
				{ 'D', 'D', 'D', 'D', 'D', 'G' } };
		String s = "GEEKS";
		int size = s.length(), idx = 0, ans = 0;

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				ans += solve(i, j, s, a, size, idx);
			}
		}
		System.out.println(ans);


	}

	private static int solve(int i, int j, String s, char[][] a, int size, int idx) {
		int found = 0;
		if (i >= 0 && j >= 0 && i < a.length && j < a[0].length && s.charAt(idx) == a[i][j]) {
			char temp = a[i][j];
			idx++;

			if (idx == size)
				found = 1;
			else {
				found += solve(i + 1, j, s, a, size, idx);
				found += solve(i - 1, j, s, a, size, idx);
				found += solve(i, j + 1, s, a, size, idx);
				found += solve(i, j - 1, s, a, size, idx);
			}
			a[i][j] = temp;
		}
		return found;
	}

}
