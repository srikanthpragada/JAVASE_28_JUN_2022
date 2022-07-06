package oop;

class Account {
	// Instance variables 
	private int acno;
	private String ahname;
	private double balance;
	
	// Constructor 
	public Account(int no, String name) {
		acno = no;
		ahname = name;
	}
	// Methods 
	public void print() {
		System.out.println(acno);
		System.out.println(ahname);
		System.out.println(balance);
	}
}

public class TestAccount {
	public static void main(String[] args) {
		 Account a1;  // object reference 
		 
		 a1 = new Account(1, "Marshall");
		 a1.print(); 
		 
		 Account a2 = new Account(2, "Larry"); 
		 a2.print();
		 

	}

}
