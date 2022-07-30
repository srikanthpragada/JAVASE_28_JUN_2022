package assign;
import java.io.BufferedReader;
import java.io.FileReader;
public class ReadNumbers {
	public static void main(String[] args) throws Exception {
		var fr = new FileReader("numbers.txt");
		var br = new BufferedReader(fr);
		int total = 0, count = 0;
		while (true) {
			var line = br.readLine();
			if (line == null)
				break;
			total += Integer.parseInt(line);
			count ++;
		}
		
		System.out.println(total);
		System.out.println(total / count);
	}
}
