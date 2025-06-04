package StreamApiFilterQuestions.customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerOperations {
	public static void main(String[] args) {

		List<customer> cust = new ArrayList<>();
		cust.add(new customer(4, "Neha", "Google"));
		cust.add(new customer(1, "Sourabh", "Iphone"));
		cust.add(new customer(2, "Priya", "Iphone"));
		cust.add(new customer(3, "Amit", "OnePlus"));
		cust.add(new customer(5, "Rahul", "samsung"));

		/*
		 * 1)Customer who's having iphone and customer name contain y
		 */

		List<customer> filtered = cust.stream()
				.filter(s -> s.getCustOrder().contains("Iphone") && s.getCustName().contains("y"))
				.collect(Collectors.toList());
		filtered.forEach(System.out::println);

		// 2. Filter customers with brand = "Samsung"
		List<customer> filter2 = cust.stream().filter(s -> s.getCustOrder().equalsIgnoreCase("samsung"))
				.collect(Collectors.toList());
		filter2.forEach(System.out::println);

		// 3 Customers whose name starts with 'A'
		List<customer> filter3 = cust.stream().filter(c -> c.getCustName().startsWith("A"))

				.collect(Collectors.toList());
		filter3.forEach(System.out::println);

		// 4 Customer whose buy iphone first
		cust.stream().filter(c -> c.getCustOrder().equalsIgnoreCase("iPhone")).findFirst()
				.ifPresent(System.out::println);

		//5 Count the cutstomer who order iphone and show the customer
		List<customer> filter4 =cust.stream().filter(s->s.getCustOrder().equalsIgnoreCase("iphone"))
				.collect(Collectors.toList());
		filter4.forEach(System.out::print);
		System.out.println("count is :"+filter4.size());
		
	}
}
