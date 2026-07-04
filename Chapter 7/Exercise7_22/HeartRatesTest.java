import java.util.Scanner;

public class HeartRatesTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first name: ");
		String firstName = input.next();

		System.out.print("Enter last name: ");
		String lastName = input.next();

		System.out.print("Enter birth month (1-12): ");
		int birthMonth = input.nextInt();

		System.out.print("Enter birth day: ");
		int birthDay = input.nextInt();

		System.out.print("Enter birth year: ");
		int birthYear = input.nextInt();

		HeartRates person = new HeartRates(firstName, lastName, birthMonth, birthDay, birthYear);

		// today's date used to calculate age
		int currentMonth = 6;
		int currentDay = 30;
		int currentYear = 2026;

		System.out.printf("%nName: %s %s%n", person.getFirstName(), person.getLastName());
		System.out.printf("Date of birth: %d/%d/%d%n", person.getBirthMonth(), person.getBirthDay(), person.getBirthYear());

		int age = person.getAge(currentMonth, currentDay, currentYear);
		int maxRate = person.getMaximumHeartRate(currentMonth, currentDay, currentYear);
		int lowTarget = person.getTargetHeartRateLow(currentMonth, currentDay, currentYear);
		int highTarget = person.getTargetHeartRateHigh(currentMonth, currentDay, currentYear);

		System.out.printf("Age: %d years%n", age);
		System.out.printf("Maximum heart rate: %d beats per minute%n", maxRate);
		System.out.printf("Target heart rate range: %d-%d beats per minute%n", lowTarget, highTarget);

		input.close();
	}
}