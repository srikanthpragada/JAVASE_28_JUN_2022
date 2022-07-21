package assign;

class MyMathOperations implements MathOperations
{

	@Override
	public int add(int a, int b) {
		 return a + b;
	}

	@Override
	public int multiply(int a, int b) {
		 return a * b;
	}

	@Override
	public double divide(int a, int b) {
		 return a / (double) b;
	}
	
}

public class TestMathOperations {
	public static void main(String[] args) {
		MathOperations obj = new MyMathOperations();
		System.out.println(obj.add(10,20));
		
		// Anonymous inner class 
		MathOperations obj2 = new MathOperations() {
			@Override
			public int multiply(int a, int b) {
				 return a * b;
			}
			
			@Override
			public double divide(int a, int b) {
				 return a / (double) b;
			}
			
			@Override
			public int add(int a, int b) {
				 return a + b;
			}
		};
			
		System.out.println(obj2.divide(10,3));
	}
}
