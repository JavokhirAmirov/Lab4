public class Student {
	private String firstName;
	private String secondName;
	private int age;
	private String group;
	private double averageMark;

	public Student(String firstName, String secondName, int age, String group, double averageMark) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
		this.group = group;
		this.averageMark = averageMark;
	}

	public String getSecondName() {
		return secondName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public double getAverageMark() {
		return averageMark;
	}

	public void setAverageMark(double averageMark) {
		this.averageMark = averageMark;
	}

}
