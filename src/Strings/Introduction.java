package Strings;

public class Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Anuja";
		System.out.println(name);
		System.out.println(name.charAt(0));
		System.out.println(name.length());
		System.out.println(name.substring(0, 3));
		System.out.println(name.contains("Anu"));
		System.out.println(name.equals("Anua"));
		System.out.println(name.isEmpty());
		System.out.println(name.concat(" Tarhane"));
		System.out.println(name.replace('j', 'h'));
		String cars = "Hyundai,Audi,Maruti,Toyota";
		String[] allCars = cars.split(",");
		for (String item : allCars) {
			System.out.println(item);
		}
		System.out.println(name.indexOf('j'));
		System.out.println(name.toLowerCase());
		name = "     Anuja Tarhane";
		System.out.println(name.trim());
	}

}
