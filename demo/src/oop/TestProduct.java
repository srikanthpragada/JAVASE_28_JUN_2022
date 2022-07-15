package oop;

class Product {
	private String name;
	private int price;
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return name +  "-"  + price;
	}
	@Override 
	public boolean equals(Object obj) {
		Product other = (Product) obj;
		return this.name.equals(other.name)
				 &&  this.price == other.price; 
	}
}

public class TestProduct {
	public static void main(String[] args) {
		var p1 = new Product("A", 1000);
		var p2 = new Product("A", 1000);
		System.out.println(p1.toString());
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
    }
}
