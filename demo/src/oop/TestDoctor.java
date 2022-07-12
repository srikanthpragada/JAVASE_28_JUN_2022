package oop;

class Doctor {
	private String name, mobile, dept;

	public Doctor(String name, String mobile, String dept) {
		this.name = name;
		this.mobile = mobile;
		this.dept = dept;
	}

	public void print() {
		System.out.println(this.name);
		System.out.println(this.mobile);
		System.out.println(this.dept);
	}
}

class ResidentDoctor extends Doctor {
	private int salary;

	public ResidentDoctor(String name, String mobile, String dept, int salary) {
		super(name, mobile, dept);
		this.salary = salary;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.salary);
	}

	public int getPay() {
		return this.salary;
	}

}

class ConsultantDoctor extends Doctor {
	private int visits, charge;

	public ConsultantDoctor(String name, String mobile, String dept, int visits, int charge) {
		super(name, mobile, dept);
		this.visits = visits;
		this.charge = charge;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.visits);
		System.out.println(this.charge);
	}

	public int getPay() {
		return this.visits * this.charge;
	}
}

public class TestDoctor {

	public static void main(String[] args) {
		// Upcasting
		Doctor d = new ResidentDoctor
				("Dr. Joe", "3939393933", "Ped", 300000);
		d.print();  // Runtime polymorphism 
		
     
		d = new ConsultantDoctor
				("Dr. Andy", "390392111", "Card", 10, 2000);
		d.print(); 
		
		// Downcasting 
		if (d instanceof ConsultantDoctor) {
	     	ConsultantDoctor cd = (ConsultantDoctor) d;
		}
		

	}

}
