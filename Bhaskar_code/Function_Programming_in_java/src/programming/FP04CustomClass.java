package programming;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Course {
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;

	public Course(String name, String category, int reviewScore, int noOfStudents) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}

	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	@Override
	public String toString() {
		return name + ":" + noOfStudents + ":" + reviewScore;
	}

}

public class FP04CustomClass {
	public static void main(String[] args) {

		List<Course> courses = List.of(new Course("Spring", "Framework", 98, 20000),
				new Course("Spring Boot", "Framework", 95, 18000), new Course("API", "Microservice", 97, 22000),
				new Course("Microservice", "Microservice", 96, 25000), new Course("Fullstack", "Fullstack", 91, 14000),
				new Course("AWS", "Cloud", 92, 21000), new Course("AZURE", "Cloud", 99, 21000),
				new Course("Docker", "Cloud", 92, 20000), new Course("Kubernetes", "Cloud", 91, 20000)

		);

		Predicate<Course> reviewScoreGreaterthan95 = (course) -> course.getReviewScore() > 95;
		Predicate<Course> reviewScoreGreaterthan90 = (course) -> course.getReviewScore() > 90;
		Predicate<Course> reviewScoreLesserthan90 = (course) -> course.getReviewScore() < 90;

		System.out.println(courses.stream().allMatch(reviewScoreGreaterthan95));
		System.out.println(courses.stream().allMatch(reviewScoreGreaterthan90));
		System.out.println(courses.stream().noneMatch(reviewScoreLesserthan90));
		System.out.println(courses.stream().noneMatch(reviewScoreGreaterthan90));
		System.out.println(courses.stream().anyMatch(reviewScoreGreaterthan90));

		// sorting

		Comparator<Course> compareByNumberOfStudentIncreasing = Comparator.comparingInt(Course::getNoOfStudents);

		System.out.println(courses.stream().sorted(compareByNumberOfStudentIncreasing).collect(Collectors.toList()));

		Comparator<Course> compareByNumberOfStudentDecreasing = Comparator.comparingInt(Course::getNoOfStudents)
				.reversed();

		System.out.println(courses.stream().sorted(compareByNumberOfStudentDecreasing).collect(Collectors.toList()));

		Comparator<Course> compareByNumberOfStudentDecreasingAndNoOfReviews = Comparator
				.comparingInt(Course::getNoOfStudents).thenComparing(Course::getReviewScore).reversed();

		System.out.println(
				courses.stream().sorted(compareByNumberOfStudentDecreasingAndNoOfReviews).collect(Collectors.toList()));

		System.out.println(courses.stream().limit(3).collect(Collectors.toList()));

		System.out.println(courses.stream().skip(5).collect(Collectors.toList()));

		System.out.println(courses.stream().skip(5).limit(1).collect(Collectors.toList()));

		System.out.println(courses);

		System.out.println(
				courses.stream().takeWhile(course -> course.getReviewScore() >= 95).collect(Collectors.toList()));

		System.out.println(
				courses.stream().dropWhile(course -> course.getReviewScore() >= 95).collect(Collectors.toList()));

		System.out.println(courses.stream().max(compareByNumberOfStudentDecreasingAndNoOfReviews));

		System.out.println(courses.stream().min(compareByNumberOfStudentDecreasingAndNoOfReviews));

		System.out.println(courses.stream().filter(reviewScoreLesserthan90).findFirst());

		System.out.println(courses.stream().filter(reviewScoreLesserthan90).findFirst()
				.orElse(new Course("Kubernetes", "Cloud", 91, 20000)));

		System.out.println(courses.stream().filter(reviewScoreGreaterthan95).findAny());

		System.out.println(courses.stream().filter(reviewScoreGreaterthan95).mapToInt(Course::getNoOfStudents).sum());

		System.out
				.println(courses.stream().filter(reviewScoreGreaterthan95).mapToInt(Course::getNoOfStudents).average());

		System.out.println(courses.stream().filter(reviewScoreGreaterthan95).mapToInt(Course::getNoOfStudents).count());

		System.out.println(courses.stream().filter(reviewScoreGreaterthan95).mapToInt(Course::getNoOfStudents).max());

		System.out.println(courses.stream().filter(reviewScoreGreaterthan95).mapToInt(Course::getNoOfStudents).min());

		System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory)));

		System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory, Collectors.counting())));

		System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory,
				Collectors.maxBy(Comparator.comparing(Course::getReviewScore)))));

		System.out.println(courses.stream().collect(
				Collectors.groupingBy(Course::getCategory, Collectors.mapping(Course::getName, Collectors.toList()))));
	}
}
