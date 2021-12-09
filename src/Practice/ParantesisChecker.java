package Practice;


// { Driver Code Starts
import java.util.Scanner;
import java.util.Stack;

class Driverclass {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		// Reading total number of testcases
		int t = sc.nextInt();

		while (t-- > 0) {
			// reading the string
			String st = sc.next();

			// calling ispar method of Paranthesis class
			// and printing "balanced" if it returns true
			// else printing "not balanced"
			if (new Solution1().ispar(st) == true)
				System.out.println("balanced");
			else
				System.out.println("not balanced");

		}
	}
}// } Driver Code Ends

class Solution1 {
	// Function to check if brackets are balanced or not.
	static boolean ispar(String x) {
		Stack<Character> myStack = new Stack<Character>();
		for (char c : x.toCharArray()) {

			if (c == '{' || c == '[' || c == '(') {
				myStack.push(c);
			}

			else {
				if (myStack.empty()) {
					return false;
				} else {
					char a = myStack.peek();
					if (a == '(' && c == ')' || a == '[' && c == ']' || a == '{' && c == '}') {
						myStack.pop();
					} else {
						return false;
					}
				}
			}
		}

		if (myStack.empty()) {
			return true;
		} else {
			return false;
		}

	}
}
