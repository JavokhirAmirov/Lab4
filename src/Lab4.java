import java.util.Arrays;

import java.util.Comparator;

public class Lab4 {

	public static void main(String[] args) {

		Student student =

				new Student("Amirov", "Javokhir", 20,

						"IP-76", 5.0);

		Student[] students = new Student[3];

		students[0] = student;

		students[2] = new Student("Filiz", "Jihangir", 67676,

				"IP-76", 4.5);

		students[1] = new Student("Karalikli", "Ilhan", 23,

				"IP-76", 4.2);

		for (int i = 0; i < students.length; i++) {

			System.out.println(students[i].getFirstName() + " " +

					students[i].getSecondName() + " " +

					students[i].getAge() + " " +

					students[i].getGroup() + " " +

					students[i].getAverageMark());

		}

		Arrays.sort(students, Comparator.comparing(Student::getFirstName));

		System.out.println("+++++++++++++++++++++");

		for (int i = 0; i < students.length; i++) {

			System.out.println(students[i].getFirstName() + " " +

					students[i].getSecondName() + " " +

					students[i].getAge() + " " +

					students[i].getGroup() + " " +

					students[i].getAverageMark());

		}

		Arrays.sort(students, Comparator.comparing(Student::getSecondName).reversed());

		System.out.println("+++++++++++++++++++++");

		for (int i = 0; i < students.length; i++) {

			System.out.println(students[i].getFirstName() + " " +

					students[i].getSecondName() + " " +

					students[i].getAge() + " " +

					students[i].getGroup() + " " +

					students[i].getAverageMark());

		}


	}

}
