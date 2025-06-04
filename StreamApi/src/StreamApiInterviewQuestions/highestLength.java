package StreamApiInterviewQuestions;

import java.util.Arrays;
import java.util.Comparator;

public class highestLength {
	public static void main(String[] args) {
		String s = "I am learning java streams in java";
	String longestWord= Arrays.stream(s.split(" ")).max(Comparator.comparing(String::length)).orElse(null);
	System.out.println(longestWord);
	}

}
