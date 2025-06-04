package methodReferences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
	
	
	/*
	 * 
	 * n Java, method references are a shorthand notation of lambda expressions to call a method.
	 *  They were introduced in Java 8 and help make code more readable and concise when you're just calling an existing method.
	 *  syntax ----->ClassName::methodName
	 *  

	 */

	public static void main(String[] args) {
//		List.of(1,2,3,4,5).forEach(x->System.out.println(x));
		
		//method reference
		List.of(1,2,3,4,5).forEach(System.out::println);

		List<String> str = Arrays.asList("sam","ram");
//	    str.sort((s1,s2)->s1.equalsIgnoreCase(s2));
		
		//Using Method Reference
	    str.sort(String::compareToIgnoreCase);
	    System.out.println(str); 
	    
	    Function<Integer,Integer>square=n->n*n;
	    System.out.println(square.apply(5));

		
	}
}

