package StreamApiInterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class findMax {
	public static void main(String[] args) {
		Integer arr[]= {1,2,67,89,105,6753,334};
		
		List<Integer>list=Arrays.asList(arr);
		Integer s=list.stream().max(Integer::compare).orElse(null);
		System.out.println(s);
		
	}

}
