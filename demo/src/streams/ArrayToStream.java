package streams;

import java.util.Arrays;
import java.util.function.Consumer;

class PrintName implements Consumer<String> {
	@Override
	public void accept(String t) {
		System.out.println(t.toUpperCase());
	}
}

public class ArrayToStream {

	public static void main(String[] args) {
		String[] names = { "TypeScript","Visual Basic","Java", 
				           "JavaScript", "Php", "Python","C#" };

//		Arrays.stream(names)
//		      .filter( v -> v.length() > 5)    // Predicate
//		      .sorted()
//		      .forEach( n -> System.out.println(n));  // Consumer
 
		
		Arrays.stream(names)
		  .sorted() 
		  .skip(2) 						   // intermediate op 
		  .limit(3)                        // intermediate op 
	      .forEach(System.out::println);   // terminal op
	}

}
