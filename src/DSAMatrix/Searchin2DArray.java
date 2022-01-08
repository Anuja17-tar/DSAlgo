package DSAMatrix;

//{ Driver Code Starts
import java.util.Scanner;

class Searchin2DArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			int mat[][] = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++)
					mat[i][j] = sc.nextInt();
			}

			int x = sc.nextInt();

			System.out.println(new Sol().searchMatrix(mat, x));
		}

	}
}// } Driver Code Ends

class Sol {
	// better approach
//	public static int matSearch(int mat[][], int N, int M, int X) {
//		int top = 0;
//		int right = M - 1;
//		int ans = 0;
//		while (top < N && right >= 0) {
//			if (mat[top][right] == X) {
//				ans = 1;
//
//			}
//			if (mat[top][right] > X)
//				right--;
//			else // if mat[i][j] < x
//				top++;
//		}
//		return ans;
//	}
	// another approach
	/*
	 * put all the elements of matrix in an array and do a binary search but uses
	 * space
	 */
	// optimal approach
//	public static int matSearch(int mat[][], int N, int M, int X) {
//		int n = mat.length;
//		int m = mat[0].length;
//		int low = 0;
//		int high = (n * m) - 1;
//		int ans = 0;
//		while (low <= high) {
//			int mid = (low + (high - low) / 2);
//			if ((mat[mid / m][mid % m]) == X)
//				ans = 1;
//			else if ((mat[mid / m][mid % m]) < X)
//				low = mid + 1;
//			else
//				high = mid - 1;
//		}
//		return ans;
//	}
	public boolean searchMatrix(int[][] mat, int X) {
		int n = mat.length;
		int m = mat[0].length;
		int row = 0;
		boolean ans = false;
		for (int i = 0; i < n; i++) {
			if (mat[i][0] == X) {
				ans = true;
			} else if (mat[i][0] > X) {
				row = i - 1;
				break;
			} else {
				row = i;
			}
		}
		if (row >= 0) {
			for (int i = 0; i < m; i++) {
				if (mat[row][i] == X) {
					ans = true;
				}
			}
		}
		return ans;

	}

}

