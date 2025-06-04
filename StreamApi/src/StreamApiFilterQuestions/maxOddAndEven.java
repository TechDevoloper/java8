package StreamApiFilterQuestions;

import java.util.Arrays;
import java.util.List;

public class maxOddAndEven {
	public static void main(String[] args) {
		Integer arr[]= {1,2,67,89,105,6753,334};
		
		List<Integer>list=Arrays.asList(arr);
		Integer result=list.stream().filter(x->x%2!=0).max(Integer::compare).get();
		System.out.println(result);
		
		
		List<Integer>list2=Arrays.asList(arr);
		Integer result2=list.stream().filter(y->y%2==0).max(Integer::compare).orElse(null);	
				System.out.println(result2);
	}
	}

