package StreamApiInterviewQuestions;

import java.util.Arrays;

public class removeDuplicate {
	public static void main(String[] args) {
		String s = "dabcadefg";
//		s.chars().distinct().mapToObj(c->(char)c)//// Convert each int to Character object
//		.forEach(System.out::print);
		
		///OR//
		
		Arrays.stream(s.split("")).distinct().forEach(System.out::print);
	}
}
