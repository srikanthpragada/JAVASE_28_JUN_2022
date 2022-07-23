package oop;

import java.util.Scanner;

public class SumOfNumbers2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		var total = 0;
		for (int i = 1; i <= 5; i++) {
			try {
				var num = Integer.parseInt(s.nextLine());
				total += num;
			} catch (NumberFormatException ex) {
				System.out.println("Invalid Number!");
			}
		}

		System.out.println(total);

	}

}
