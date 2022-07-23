package oop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		var total = 0;
		for (int i = 1; i <= 5; i++) {
			try {
				var num = s.nextInt();
				total += num;
			} catch (InputMismatchException ex) {
				System.out.println("Invalid Number!");
				// clear keyboard buffer
				s.nextLine();
			}
		}

		System.out.println(total);

	}

}
