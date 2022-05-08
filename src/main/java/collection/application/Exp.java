package collection.application;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exp {

	
	public static void main(String[] args) {
	
		LinkedList<Integer> lk = new LinkedList<>();
		lk.add(567);
		lk.add(186);
		lk.add(17);
		lk. add(163);
		
		// stream is always used with collection of objects. when we use stream() method with a collection object it returns a stream of object
		// on which we can perform operations like filter or map 
		// map() method perform operation on each object and return a object
		
		List<Integer> l=lk.stream().filter(i-> i>180).collect(Collectors.toList()); // here in filter method it always return a boolean value(true-false).
		System.out.println(l);
		
		System.out.println(lk.stream().map(e-> e*7).collect(Collectors.toList()));  // here map function always return a object
		
		List<Integer> kk =Arrays.asList(12,232,42,44,24,243,21);   // another way of creating a list
		System.out.println(kk);
		System.out.println(kk.stream().map(e-> e/10).collect(Collectors.toList())); 
		
		Stream<Integer> strm=Stream.of(34,3,535,345,342,35);  // another way of creating a stream
		strm.map(e-> e*10).forEach(s-> System.out.println(s));
	}

}
