package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		int sum = addSumOfListFunctional(numbers);

		System.out.println("The sum of all number in the list is " + sum);

	}

	private static int addSumOfListFunctional(List<Integer> numbers) {

		return numbers.stream().reduce(0, Integer::sum);
	}

}
