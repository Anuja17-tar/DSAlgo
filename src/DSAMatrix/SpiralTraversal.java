package DSAMatrix;


// { Driver Code Starts
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class SpiralTraversal {
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int r = sc.nextInt();
			int c = sc.nextInt();

			int matrix[][] = new int[r][c];

			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++)
					matrix[i][j] = sc.nextInt();
			}
			Solution1M ob = new Solution1M();
			ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
			for (Integer val : ans)
				System.out.print(val + " ");
			System.out.println();
		}
	}
}// } Driver Code Ends

class Solution1M {
	// Function to return a list of integers denoting spiral traversal of matrix.
	static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c) {
		int dir = 0;
		int top = 0;
		int left = 0;
		int down = matrix.length - 1;
		int right = matrix[0].length - 1;
		ArrayList<Integer> ans = new ArrayList<Integer>();
		while (top <= down && left <= right) {
			if (dir == 0) {
				for (int i = left; i <= right; i++)
					ans.add(matrix[top][i]);
				top++;
			} else if (dir == 1) {
				for (int i = top; i <= down; i++)
					ans.add(matrix[i][right]);
				right--;
			} else if (dir == 2) {
				for (int i = right; i >= left; i--)
					ans.add(matrix[down][i]);
				down--;
			} else if (dir == 3) {
				for (int i = down; i >= top; i--)
					ans.add(matrix[i][left]);
				left++;
			}
			dir = (dir + 1) % 4;
		}
		return ans;

	}
}
