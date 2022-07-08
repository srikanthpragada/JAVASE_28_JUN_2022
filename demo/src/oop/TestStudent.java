package oop;

class Student {
	private int admno;
	private String name;
	private int courseCode, feepaid;

	
	public Student(int admno, String name) {
		this.admno = admno;
		this.name = name;
		this.courseCode = 1;
	}
	
	public Student(int admno, String name, int courseCode) {
		this(admno, name);
		this.courseCode = courseCode;
	}

	public void print() {
		System.out.printf("%d %s %d %d\n", this.admno, name, courseCode, feepaid);
	}

	public void pay(int amount) {
		feepaid += amount;
	}

	public int getDue() {
		int totalFee = courseCode == 1 ? 10000 : 8000;
		return totalFee - feepaid;
	}
}

public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student(1, "Andy", 1);
		s1.pay(5000);
		System.out.println(s1.getDue());
		s1.print(); 
		
		new Student()

	}

}
