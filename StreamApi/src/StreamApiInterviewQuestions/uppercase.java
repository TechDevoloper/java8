package StreamApiInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class uppercase {
	public static void main(String[] args) {
		List<String>list= Arrays.asList("java","spring","lambda","collections");
		List<String>list2=list.stream()
				.map(s->s.toUpperCase())
				.collect(Collectors.toList());
		//list2.forEach(System.out::println);
		System.out.println(list2);
	}

}
