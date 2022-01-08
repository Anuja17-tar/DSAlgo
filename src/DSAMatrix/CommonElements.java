package DSAMatrix;

import java.util.HashMap;
import java.util.Map;

public class CommonElements {

	public static void main(String[] args) {
		int mat[][] = { { 1, 2, 1, 4, 8 }, { 3, 7, 8, 5, 1 }, { 8, 7, 7, 3, 1 }, { 8, 1, 2, 7, 9 }, };

		printCommonElements(mat);
	}

	private static void printCommonElements(int[][] mat) {
		Map<Integer, Integer> mp = new HashMap<>();
		for (int i = 0; i < mat[0].length; i++) {
			if (!mp.containsKey(mat[0][i]))
				mp.put(mat[0][i], 1);
		}
		for (int i = 1; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (mp.get(mat[i][j]) != null && mp.get(mat[i][j]) == i) {
					mp.put(mat[i][j], i + 1);
					if (i == mat.length - 1) {

						System.out.print(mat[i][j] + " ");
					}

				}
			}
	}

	}
}
