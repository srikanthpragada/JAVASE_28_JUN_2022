package io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteNames {

	public static void main(String[] args) throws IOException {

		// ARM or try with resource 
		try (FileWriter fw = new FileWriter("d:\\classroom\\jun28\\names.txt")) {
			Scanner s = new Scanner(System.in);

			for (int i = 1; i <= 5; i++) {
				System.out.print("Enter name :");
				String name = s.nextLine();
				fw.write(name + "\n");
			}
		} // try 

	}

}
