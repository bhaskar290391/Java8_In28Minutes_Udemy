package programming;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		//printAllNumberInListStructured(numbers);
		printEvenNumberInListStructured(numbers);

	}

	private static void printEvenNumberInListStructured(List<Integer> numbers) {
		
		for (Integer number : numbers) {
			
			if(number %2 == 0) {
				System.out.println(number);
			}
		}
		
	}

	private static void printAllNumberInListStructured(List<Integer> numbers) {

		for (Integer number : numbers) {
			System.out.println(number);
		}
	}

}
