package assign;

import java.io.FileWriter;
import java.util.Scanner;

public class WriteNumbers {

	public static void main(String[] args) throws Exception {
		var fw = new FileWriter("numbers.txt");
		var s = new Scanner(System.in);
		while (true) {
			System.out.print("Enter number [0 to stop] :");
			var v = s.nextLine();
			if (v.equals("0"))
				break;

			fw.write(v + "\n");
		}
		
		fw.close();
	}
}
