package programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FP05FlatMap {
	public static void main(String[] args) {

		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");

		List<String> courses2 = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure",
				"Docker", "Kubernetes");

		System.out.println(courses.stream().collect(Collectors.joining(",")));

		System.out.println(courses.stream().map(str -> str.split("")).flatMap(Arrays::stream).distinct()
				.collect(Collectors.toList()));

		System.out.println(courses.stream()
				.flatMap(course -> courses2.stream().filter(course2 -> course2.length() == course.length())
						.map(course2 -> List.of(course, course2)))
				.filter(list -> !list.get(0).equals(list.get(1))).collect(Collectors.toList()));
	}
}
