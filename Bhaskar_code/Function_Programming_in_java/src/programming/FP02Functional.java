package programming;

import java.util.List;

public class FP02Functional {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		// printAllNumberInListFunctional(numbers);
		// printEvenNumberInListFunctional(numbers);
		// printOddNumberInListFunctional(numbers);
		// printSquareOfEvenNumbers(numbers);
		// printCubeOfOddNumber(numbers);
		//printSumOfSquares(numbers);
		//printSumOfCubes(numbers);
		//printSumOfOddNumberInList(numbers);
	}

	private static void printSumOfOddNumberInList(List<Integer> numbers) {
		System.out.println(numbers.stream().filter(number -> number %2 !=0).reduce(0, Integer::sum));
		
	}

	private static void printSumOfCubes(List<Integer> numbers) {
		System.out.println(numbers.stream().map(number -> number * number *number).reduce(0, Integer::sum));
		
	}

	private static void printSumOfSquares(List<Integer> numbers) {
		System.out.println(numbers.stream().map(number -> number * number).reduce(0, Integer::sum));

	}

	private static void printCubeOfOddNumber(List<Integer> numbers) {
		numbers.stream().filter(number -> number % 2 != 0).map(number -> number * number).forEach(System.out::println);

	}

	private static void printSquareOfEvenNumbers(List<Integer> numbers) {
		numbers.stream().filter(number -> number % 2 == 0).map(number -> number * number).forEach(System.out::println);

	}

	private static void printOddNumberInListFunctional(List<Integer> numbers) {

		numbers.stream().filter(number -> number % 2 != 0).forEach(System.out::println);

	}

	private static void printEvenNumberInListFunctional(List<Integer> numbers) {
		numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
	}

	public static void print(Integer number) {
		System.out.println(number);
	}

	private static void printAllNumberInListFunctional(List<Integer> numbers) {

		numbers.stream().forEach(System.out::println);

		System.out.println("Using method Reference ");

		numbers.stream().forEach(FP02Functional::print);
	}

}
