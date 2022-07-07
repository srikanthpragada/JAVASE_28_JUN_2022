package oop;

class Student {
	private int admno;
	private String name;
	private int courseCode, feepaid;
	
	public Student(int no, String n, int cc) {
		admno = no;
		name = n;
		courseCode = cc;
	}
	
	public void print() {
		System.out.printf("%d %s %d %d\n", admno, name, courseCode, feepaid);
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

	}

}
