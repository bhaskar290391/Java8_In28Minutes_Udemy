package programming;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class JshellProgrammingForStream {
	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		System.out.println(numbers.stream().reduce(0, (a, b) -> a + b));

		System.out.println(numbers.stream().reduce(0, (a, b) -> a));

		System.out.println(numbers.stream().reduce(0, (a, b) -> b));

		System.out.println(numbers.stream().reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b));

		System.out.println(numbers.stream().reduce(Integer.MAX_VALUE, (a, b) -> a > b ? b : a));

		System.out.println();

		numbers.stream().distinct().forEach(System.out::println);

		System.out.println();

		numbers.stream().sorted().forEach(System.out::println);

		System.out.println();

		numbers.stream().distinct().sorted().forEach(System.out::println);

		System.out.println(numbers.stream().map(number -> number * number).collect(Collectors.toList()));

		System.out.println();
		
		System.out.println(numbers.stream().filter(number -> number % 2==0).collect(Collectors.toList()));
	}
}
