package programming;

import java.util.List;

public class FP02Structured {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		int sum = addSumOfList(numbers);

		System.out.println("The sum of all number in the list is " + sum);

	}

	private static int addSumOfList(List<Integer> numbers) {
		int sum=0;
		for (Integer number : numbers) {
			sum +=number;
		}
		return sum;
	}

}
