package oop;

class Person {
	private static int count = 0;
	public Person(String name) {
		Person.count++;
	}
	public static int getCount() {
		return Person.count;
	}
}

public class TestPerson {
	public static void main(String[] args) {
		Person p1 = new Person("Abc");
		Person people[] = new Person[5];

		people[0] = new Person("Xyz");
		people[0].toString();

		System.out.println(Person.getCount());

	}

}
