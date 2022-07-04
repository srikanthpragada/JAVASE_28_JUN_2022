package basics;

public class FunDemo {

	public static int add(int n1, int n2) {
		return n1 + n2;
	}

	public static int total(int...values, int v) {
		int sum = 0;
		for (int n : values)
			sum += n;

		return sum;
	}

	public static void main(String[] args) {
		System.out.println(add(10, 10));
		System.out.println(total(10, 20, 30));
		System.out.println(total(10, 20, 30, 1, 3));

	}

}
