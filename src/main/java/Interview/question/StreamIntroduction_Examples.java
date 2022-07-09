package Interview.question;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Introduced in Java 8, the Stream API is used to process collections of
 * objects. A stream is a sequence of objects that supports various methods
 * which can be pipelined to produce the desired result.
 * 
 * A stream is not a data structure instead it takes input from the Collections,
 * Arrays or I/O channels.
 * 
 * 
 */
public class StreamIntroduction_Examples {

	public static void main(String[] args) {

		List<Integer> number = Arrays.asList(2, 3, 4, 5);
		System.out.println(number);
		/**
		 * map() method is used to perform on the each element of the stream if you just
		 * want to filter the elements use filter() method then.
		 * 
		 */
		List<Integer> square = number.stream().map(x -> x / 2).collect(Collectors.toList());
		System.out.println(square);
		List<Integer> news = number.stream().filter(x-> x%2==0).collect(Collectors.toList());
		System.out.println(news);
		/**
		 * filter: The filter method is used to select elements as per the Predicate
		 * passed as argument.
		 */
		List<String> names = Arrays.asList("Reflection", "Collection", "Stream");
		List<String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
		System.out.println(result);

		/**
		 * sorted: The sorted method is used to sort the stream.
		 */
		List<String> names1 = Arrays.asList("Reflection", "Collection", "Stream");
		List<String> result1 = names1.stream().sorted().collect(Collectors.toList());
		System.out.println(result1);

		Integer[] num = { 2, 1, 4, 13, 4, 13, 4, 24, 4, 23, 4, 32 };
		List<Integer> sorted = Arrays.asList(num).stream().sorted().collect(Collectors.toList());
		System.out.println(sorted);
		Integer[] numb = new Integer[sorted.size()];
		sorted.toArray(numb);
		System.out.println(Arrays.toString(numb));
		/**
		 * forEach: The forEach method is used to iterate through every element of the stream.
		 */
		
		List<Integer> number2 = Arrays.asList(2,3,4,5);
		number2.stream().map(x->x*x).forEach(System.out::println);
		
		
		
	}

}
