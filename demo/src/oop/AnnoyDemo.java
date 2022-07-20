package oop;

interface Printable {
	void print();
}

public class AnnoyDemo {

	public static void main(String[] args) {

        Object v =  new Object() {
        	public String toString() {
        		return "This is Anony class";
        	}
        };
        
        System.out.println(v.toString());
        
        Printable obj = new Printable() {
			@Override
			public void print() {
                System.out.println("print in printable");				
			}
        };
        
        obj.print();
        System.out.println(obj.getClass());
	}

}
