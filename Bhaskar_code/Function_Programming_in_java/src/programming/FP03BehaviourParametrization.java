package programming;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP03BehaviourParametrization {
	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		filterAndPrint(numbers, number -> number % 2 == 0);

		filterAndPrint(numbers, number -> number % 2 != 0);
		
		squareAndPrintList(numbers,x-> x * x);
	
		squareAndPrintList(numbers,x-> x * x * x);
		
	}

	private static void squareAndPrintList(List<Integer> numbers, Function<Integer, Integer> function) {
		System.out.println(numbers.stream().map(function).collect(Collectors.toList()));
		
		
	}

	private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> evenPredicate) {
		numbers.stream().filter(evenPredicate).forEach(System.out::println);
	}
}
