package StreamApiFilterQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filter2 {
	public static void main(String[] args) {
		
		List<String>list=Arrays.asList("Banglore","goa","delhi","pune","mumbai");
		List<String>length=list.stream().filter(s->s.length()>5).collect(Collectors.toList());
		length.forEach(System.out::println);
		
	}

}
