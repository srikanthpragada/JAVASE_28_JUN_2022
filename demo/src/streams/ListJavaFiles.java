package streams;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;

public class ListJavaFiles {

	public static void main(String[] args) throws Exception {
		Path p = Path.of("d:\\classroom\\jun28");
		
		Files.walk(p)
		     .filter(f -> f.toString().endsWith(".java"))
		     .forEach(System.out::println);

	}

}
