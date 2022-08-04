package coll;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
public class SortNamesFromFile2 {
	public static void main(String[] args) throws IOException {
		Path p = Path.of("d:\\classroom\\jun28\\names.txt");
		var lines = Files.readAllLines(p);
		Collections.sort(lines);
		for (String name : lines)
			System.out.println(name.toUpperCase());
	}
}
