package oop;

public class TestBoxing {

	public static void main(String[] args) {
		 Object obj = "String";
		 obj = 10; // Auto-Boxing
		 System.out.println(obj.getClass());
		 
		 int v = (Integer) obj;
		 System.out.println(v);
		 

	}

}
