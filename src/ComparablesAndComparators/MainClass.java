package ComparablesAndComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<>();
		students.add(new Student(23, "Mark"));
		students.add(new Student(52, "Mickey"));
		students.add(new Student(96, "Mike"));
		students.add(new Student(36, "Marshal"));
		students.add(new Student(85, "Mickey"));
//		Collections.sort(students, (o1, o2) -> {
//			if (o1.name.equals(o2.name)) {
//				return o1.marks - o2.marks;
//			} else {
//				return o1.name.compareTo(o2.name);
//			}
//		});
		Collections.sort(students, Comparator.comparing(Student::getName).thenComparing(Student::getMarks).reversed());
		students.forEach(System.out::println);

	}



}

//class SortByname implements Comparator<Student> {
//
//	@Override
//	public int compare(Student o1, Student o2) {
//		if (o1.name.equals(o2.name)) {
//			return o1.marks - o2.marks;
//		} else {
//			return o1.name.compareTo(o2.name);
//		}
//
//	}
//
//}

