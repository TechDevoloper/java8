package StreamApiFilterQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class filter1 {
	public static void main(String[] args) {
		//Filter Even number from List
		/*
		 * 
		 * input--[1,2,3,4,5,6,7,8]
		 * output--[2,4,6,8]
		 */
		List<Integer>list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		/*
		 * 
		 * Using Method Reference
		 * List.stream().filter(a->a%2==0).forEach(System.out::println);
		 */
		List<Integer>even=list.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(even);
	}

}
