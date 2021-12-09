package Loops;

public class MultiplicationNested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 1;
		for (int j = 1; j <= 20; j++) {
			for (int i = 1; i <= 10; i++) {
				result = j * i;
				System.out.print(result + " ");
			}
			System.out.println();
		}



	}

}
