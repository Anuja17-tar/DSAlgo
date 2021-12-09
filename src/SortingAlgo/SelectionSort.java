package SortingAlgo;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 9, 0, -1, 5, 7 };
		int temp;
		for (int i = 0; i < 4; i++) {
			int minInd = i;
			for (int j = i; j < 5; j++) {
				if (a[j] < a[minInd]) {
					minInd = j;
				}
			}
			temp = a[i];
			a[i] = a[minInd];
			a[minInd] = temp;

		}
		for (int item : a) {
			System.out.println(item);
		}

	}

}
