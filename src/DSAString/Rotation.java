package DSAString;

public class Rotation {
	public static void main(String[] args) {
		String str = "ABCD";
		String str1 = "CDB";
		areRotaion(str, str1);
	}

	private static void areRotaion(String str, String str1) {
		String temp = str + str;
		if (temp.contains(str1) && str.length() == str1.length())
			System.out.println("yes");
		else
			System.out.println("no");

	}
}
