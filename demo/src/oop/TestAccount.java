package oop;

class Account {
	// Instance variables 
	private int acno;
	private String ahname;
	private double balance;
	
	// Class variable or Static variable 
	private static int minbal = 5000;
	
	public static int getMinbal() {
		return minbal;
	}
	
	// Constructor 
	public Account(int acno, String ahname) {
		this.acno = acno;
		this.ahname = ahname;
	}
	
	public Account(int acno, String ahname, double balance) {
		this(acno,ahname);  // call another constructor 
		this.balance = balance;
	}
	
	// Methods 
	public void print() {
		System.out.println(this.acno);
		System.out.println(this.ahname);
		System.out.println(this.balance);
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		if (this.balance - Account.minbal >= amount)
		    this.balance -= amount;
	
	}
	
	public double getBalance() {
		return balance;
	}
}

public class TestAccount {
	public static void main(String[] args) {
		 System.out.println(Account.getMinbal());
		 
		 Account a1;  // object reference 
		 
		 a1 = new Account(1, "Marshall");
		 a1.deposit(10000);
		 a1.deposit(20000);
		 a1.withdraw(5000);
		 a1.print(); 
	     System.out.println(a1.getBalance());
	     
	     
		 
		 Account a2 = new Account(2, "Larry", 50000); 
		 a2.print();
		 

	}

}
