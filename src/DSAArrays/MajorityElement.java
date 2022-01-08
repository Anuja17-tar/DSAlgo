package DSAArrays;

//Brute-force
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] marks = new int[5];
//		int[] marks_1;
//		marks_1 = new int[10];
//		int age[] = { 1, 1, 2, 1, 3, 5, 1 };
//
//		int maxCount = 0;
//		int index = -1;
//
//		List<Integer> ans = new ArrayList<Integer>();
//		for (int i = 0; i < age.length; i++) {
//			int count = 0;
//			for (int j = 0; j < age.length; j++) {
//				if (age[i] == age[j]) {
//					count++;
//				}
//				if (count > maxCount) {
//					maxCount = count;
//					index = i;
//				}
//			}
//		}
//
//		int n = age.length;
//
//		if (maxCount > n / 2)
//			System.out.println(age[index]);
//
//		else
//			System.out.println("No Majority Element");
//	}
//}
// optimize using list
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] marks = new int[5];
//		int[] marks_1;
//		marks_1 = new int[10];
//		int age[] = { 3, 1, 2, 2, 1, 3, 3, 3 };
//		int count = 0;
//		int maxCount = 0;
//		int index = -1;
//
//		int size = age.length;
//		List<Integer> ans = new ArrayList<Integer>();
//		Arrays.sort(age);
//		for (int j = 0; j < age.length - 1; j++) {
//			if (age[j] == age[j + 1]) {
//				count++;
//				// System.out.println(count + "ele " + age[j]);
//				maxCount = Math.max(maxCount, count + 1);
//				if (maxCount >= (size / 2)) {
//					if (!ans.contains(age[j])) {
//						ans.add(age[j]);
//
//					}
//
//				}
//
//
//				 }
//					else {
//						count = 0;
//					}
//
//			}
//			for (int i : ans) {
//				System.out.println(i);
//			}
//
//			}
// optimize using hashmap

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		int age[] = { 1, 2, 3 };
//
//		int maxCount = 0;
//		int index = -1;
//		HashMap<Integer, Integer> map = new HashMap<>();
//		int size = age.length;
//		int count = 0;
//		for (int j = 0; j < age.length; j++) {
//
//			if (map.containsKey(age[j])) {
//				map.put(age[j], map.get(age[j]) + 1);
//
//			} else {
//				map.put(age[j], 1);
//			}
//
//		}
//		for (Map.Entry<Integer, Integer> e : map.entrySet()) {
//			// System.out.println("e " + e.getValue());
//			int x = e.getValue();
//			maxCount = Math.max(maxCount, x);
//
//
//		}
//		// System.out.println(maxCount);
//
//		if (maxCount > size / 2) {
//			for (Map.Entry<Integer, Integer> e : map.entrySet()) {
//				if (maxCount == e.getValue())
//					System.out.println(e.getKey());
//			}
//		}
//
//	}
// optimize using moore's voting algorithm
// { Driver Code Starts
//Initial Template for Java
import java.util.Scanner;

class Geeks {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];

			for (int i = 0; i < n; i++)
				arr[i] = sc.nextInt();

			System.out.println(new Solution21().majorityElement(arr, n));
		}
	}
}// } Driver Code Ends


// User function Template for Java

class Solution21 {
	static int majorityElement(int a[], int size) {
		int ans = 0;
		int count = 1;

		for (int i = 1; i < size; i++) {
			if (a[i] == a[ans]) {
				count++;
			} else {
				count--;
			}
			if (count == 0) {
				ans = i;
				count = 1;
			}
		}
		int finalCount = 0;
		for (int i = 0; i < size; i++) {
			if (a[ans] == a[i])
				finalCount++;
		}
		if (finalCount > size / 2) {
			return a[ans];
		} else {
			return -1;
		}
	}
	}


