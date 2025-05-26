package programming;

import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FP03FunctionalInterfaces2 {
	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		Predicate<Integer> isEvenpredicate = number -> number % 2 == 0;
		Function<Integer, Integer> squaredFunction = number -> number * number;
		Consumer<Integer> printConsumer = System.out::println;
		BinaryOperator<Integer> sumOperator = Integer::sum;

		Supplier<Integer> supplier = () -> {
			Random random = new Random();
			return random.nextInt(1000);
		};

		System.out.println(supplier.get());

		UnaryOperator<Integer> unary = x -> x * 4;

		System.out.println(unary.apply(4));

		BiPredicate<Integer, String> biPredicate = new BiPredicate<Integer, String>() {

			@Override
			public boolean test(Integer number, String string) {
				// TODO Auto-generated method stub
				return number < 10 && string.length() > 5;
			}

		};

		System.out.println(biPredicate.test(5, "Bhaskar"));

		BiFunction<Integer, String, String> biFunction = new BiFunction<Integer, String, String>() {

			@Override
			public String apply(Integer number, String String) {

				return number + " " + String;
			}
		};

		System.out.println(biFunction.apply(10, "Kanishk"));

		BiConsumer<Integer, String> biConsumer = new BiConsumer<Integer, String>() {

			@Override
			public void accept(Integer number, String string) {

				System.out.println(number + " " + string);
			}
		};

		biConsumer.accept(25, "Sammy");

		
		
		// numbers.stream().filter(isEvenpredicate).map(squaredFunction).forEach(printConsumer);
	}
}
