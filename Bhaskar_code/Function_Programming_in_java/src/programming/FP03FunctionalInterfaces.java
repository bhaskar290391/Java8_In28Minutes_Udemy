package programming;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP03FunctionalInterfaces {
	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		Predicate<Integer> isEvenpredicate = number -> number % 2 == 0;
		Function<Integer, Integer> squaredFunction = number -> number * number;
		Consumer<Integer> printConsumer = System.out::println;

		Predicate<Integer> isEvenpredicate2 = new Predicate<Integer>() {

			@Override
			public boolean test(Integer number) {

				return number % 2 == 0;
			}
		};

		Function<Integer, Integer> squaredFunction2 = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer number) {

				return number * number;
			}
		};

		Consumer<Integer> printConsumer2 = new Consumer<Integer>() {

			@Override
			public void accept(Integer number) {

				System.out.println(number);
			}
		};

		numbers.stream().filter(isEvenpredicate2).map(squaredFunction2).forEach(printConsumer2);

		BinaryOperator<Integer> sumOperator = Integer::sum;

		BinaryOperator<Integer> sumOperator2 = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer number1, Integer number2) {
				return number1 + number2;
			}
		};

		System.out.println("The sum is ==> " + numbers.stream().reduce(0, sumOperator2));
		;
	}
}
