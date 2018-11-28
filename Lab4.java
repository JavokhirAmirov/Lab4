import java.util.Arrays;

import java.util.Comparator;

public class Lab4 {

	public static void main(String[] args) {

		Students students =

				new Students("Amirov", "Javokhir", 20,

						"IP-76", 5.0);

		Students[] student = new Students[3];

		student[0] = students;

		student[1] = new Students("Filiz", "Jihangir", 21,

				"IP-76", 4.5);

		student[2] = new Students("Karalikli", "Ilhan", 23,

				"IP-76", 4.2);

		for (int i = 0; i < student.length; i++) {

			System.out.println(student[i].getFirstName() + " " +

					student[i].getSecondName() + " " +

					student[i].getAge() + " " +

					student[i].getGroup() + " " +

					student[i].getAverageMark());

		}

		Arrays.sort(student, Comparator.comparing(Students::getFirstName));

		System.out.println("+++++++++++++++++++++");

		for (int i = 0; i < student.length; i++) {

			System.out.println(student[i].getFirstName() + " " +

					student[i].getSecondName() + " " +

					student[i].getAge() + " " +

					student[i].getGroup() + " " +

					student[i].getAverageMark());

		}

		Arrays.sort(student, Comparator.comparing(Students::getSecondName).reversed());

		System.out.println("+++++++++++++++++++++");

		for (int i = 0; i < student.length; i++) {

			System.out.println(student[i].getFirstName() + " " +

					student[i].getSecondName() + " " +

					student[i].getAge() + " " +

					student[i].getGroup() + " " +

					student[i].getAverageMark());

		}


	}

}
