package StreamApiInterviewQuestions;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class top25StreamQuestions {
	public static void main(String[] args) {

		// 1.First occurance in the list

		List<Integer> list = Arrays.asList(13, 4, 5, 6, 7, 8, 9, 10);
		list.stream().findFirst().ifPresent(System.out::println);

		// 2.Total elements in the list
		List<Integer> list2 = Arrays.asList(13, 4, 5, 6, 7, 8, 9, 10);
		Long count = list2.stream().count();
		System.out.println(count);

		// 3.Find even and odd number in the list
		List<Integer> list3 = Arrays.asList(13, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> EVEN = list3.stream().filter(s -> s % 2 == 0).collect(Collectors.toList());
		System.out.println(EVEN);
		List<Integer> ODD = list3.stream().filter(s -> s % 2 != 0).collect(Collectors.toList());
		System.out.println(ODD);

		// 4.Find distinct elements in the list
		List<Integer> list4 = Arrays.asList(13, 5, 5, 6, 8, 8, 9, 10);
		list4.stream().distinct().forEach(System.out::println);

		// 5 Find Duplicate integer from the list
		List<Integer> list5 = Arrays.asList(13, 5, 5, 6, 8, 8, 9, 10);
		Set<Integer> duplicate = new HashSet<>();
		List<Integer> dupli = list5.stream().filter(s -> !duplicate.add(s)).distinct().collect(Collectors.toList());
		System.out.println(dupli);

		// 6 Find the max and min from list
		List<Integer> list6 = Arrays.asList(13, 4, 5, 6, 7, 8, 9, 10);
		Integer s = list6.stream().max(Integer::compare).get();
		System.out.println(s);
		Integer s2 = list6.stream().min(Integer::compare).get();
		System.out.println(s2);

		// 7 Sort the values in the ascending order and descending order
		List<Integer> list7 = Arrays.asList(13, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("Ascending Order is below: ");
		list7.stream().sorted().forEach(System.out::println);
		System.out.println("descending order is below: ");
		list7.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		;

		// 8 check array contains duplicate element or not
		int a[] = { 1, 2, 3, 4, 5, 5, 6 };
		if (Arrays.stream(a).distinct().count() != a.length) {
			System.out.println("contains duplicate");
		} else {
			System.out.println("not contain");
		}

		// 9 perform square on list of elementes and filter which greater tha 50

		List<Integer> square = Arrays.asList(1, 2, 3, 4, 5, 6, 9, 34);
		System.out.println("square : ");
		square.stream().map(x -> x * x).filter(x -> x > 50).distinct().forEach(System.out::println);

		// 10 Number of occurance of partucular value

		int arr[] = { 1, 2, 3, 4, 4, 5, 5, 6 };
		int number = 5;
		long occurance = Arrays.stream(arr).filter(h -> h == number).count();
		System.out.println("occurance of the: " + number + " is " + occurance);

		// 11 Duplicate elements with its count from the arraylist of strings

		List<String> strings = Arrays.asList("sourabh", "sam", "apple", "apple", "sam");
		Map<String, Long> map = strings.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);

		// 12 occurance of each character in the given string
		String j = "I am a java full stack devoloper";
		Map<Character, Long> MAP = j.chars().mapToObj((c -> (char) c))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(MAP);

		// 13 Count frequency of each element in an array
		int array[] = { 1, 2, 3, 4, 4, 5, 5, 6 };
		Map<Integer, Long> m = Arrays.stream(array).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(m);

		// 14 Duplicate elements with its count from the array of strings

		String[] ap = { "sourabh", "sam", "apple", "apple", "sam" };
		Map<String, Long> map2 = Arrays.stream(ap)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map2);
		
		//15 From 2 list of array  make a single one
		List<List<String>>stringlist=Arrays.asList(Arrays.asList("one","two"),
				Arrays.asList("three","four"));
		List<String>flatList=stringlist.stream().flatMap(Collection::stream).collect(Collectors.toList());
	    System.out.println(flatList);
		
	    //16 Sort the array of string
		String[] sort = {  "mango", "apple", "sam" };
		List<String>aftersorting=Arrays.stream(sort).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(aftersorting);
	}
	
}
