package programming;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CourseExcercisesFP {
	public static void main(String[] args) {

		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
				"Kubernetes");

		// printAllCoursesFunctional(courses);

		// printCoursesWhichContainesSpring(courses);

		// printCoursesWithAtLeast4Characters(courses);

		// printCharacterInEachCourses(courses);

		// printCoursesInSortingOrder(courses);

		// printCoursesInReverseOrder(courses);

		// printCoursesByIncreasingLength(courses);

		printListByCourseLength(courses);
	}

	private static void printListByCourseLength(List<String> courses) {
		System.out.println(courses.stream().map(course -> course.length()).collect(Collectors.toList()));

	}

	private static void printCoursesByIncreasingLength(List<String> courses) {
		courses.stream().sorted(Comparator.comparing(course -> course.length())).forEach(System.out::println);

	}

	private static void printCoursesInReverseOrder(List<String> courses) {
		courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

	}

	private static void printCoursesInSortingOrder(List<String> courses) {
		courses.stream().sorted().forEach(System.out::println);
	}

	private static void printCharacterInEachCourses(List<String> courses) {
		courses.stream().map(course -> course.length()).forEach(System.out::println);

	}

	private static void printCoursesWhichContainesSpring(List<String> courses) {
		courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);

	}

	private static void printCoursesWithAtLeast4Characters(List<String> courses) {
		courses.stream().filter(course -> course.length() >= 4).forEach(System.out::println);

	}

	private static void printAllCoursesFunctional(List<String> courses) {

		courses.stream().forEach(System.out::println);

	}
}
