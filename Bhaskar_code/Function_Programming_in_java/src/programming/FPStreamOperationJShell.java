package programming;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class FPStreamOperationJShell {
	public static void main(String[] args) {

		Stream<Integer> streamData = Stream.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		//System.out.println(streamData.count());
		//System.out.println(streamData.reduce(0, (x,y)-> x+y));
		
		int[] number= {12, 9, 13, 4, 6, 2, 4, 12, 15};
		System.out.println(Arrays.stream(number));
		System.out.println(Arrays.stream(number).sum());
		System.out.println(Arrays.stream(number).average());
		System.out.println(Arrays.stream(number).max());
		System.out.println(Arrays.stream(number).min());
		
		
		System.out.println(IntStream.range(1, 10));
		System.out.println(IntStream.range(1, 10).sum());
		System.out.println(IntStream.rangeClosed(1, 10).sum());
		
		
		System.out.println(IntStream.iterate(1, e-> e+2).limit(10).sum());
		System.out.println(IntStream.iterate(1, e-> e+2).limit(10).peek(System.out::println).sum());
		System.out.println(IntStream.iterate(2, e-> e+2).limit(10).peek(System.out::println).sum());
		
		System.out.println(IntStream.iterate(2, e-> e*2).limit(10).peek(System.out::println).sum());
		
		System.out.println(IntStream.iterate(2, e-> e*2).limit(10).boxed().collect(Collectors.toList()));
		
		
		System.out.println(IntStream.rangeClosed(1, 50).reduce(1, (x,y)-> x* y));
		System.out.println(LongStream.rangeClosed(1, 50).reduce(1, (x,y)-> x* y));
		System.out.println(LongStream.rangeClosed(1, 30).reduce(1, (x,y)-> x* y));
		System.out.println(LongStream.rangeClosed(1, 20).reduce(1, (x,y)-> x* y));
		System.out.println(LongStream.rangeClosed(1, 50).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply));
		
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");
		
		List<String> modifyableCourses =new ArrayList<>(courses);
		modifyableCourses.replaceAll(str->str.toUpperCase());
		
		System.out.println(modifyableCourses);
		
		modifyableCourses.removeIf(str -> (str.length() >8));
		
		System.out.println(modifyableCourses);
	}
}
