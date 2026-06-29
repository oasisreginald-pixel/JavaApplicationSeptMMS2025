import java.util.Scanner;

public class TemperatureConversion {
	static double celsius(double fahrenheit) {
		return 5.0 / 9.0 * (fahrenheit - 32);
	}

	static double fahrenheit(double celsius) {
		return 9.0 / 5.0 * celsius + 32;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 1 to convert Fahrenheit to Celsius, 2 for Celsius to Fahrenheit: ");
		int choice = input.nextInt();

		if (choice == 1) {
			System.out.print("Enter Fahrenheit temperature: ");
			double f = input.nextDouble();
			System.out.printf("%.2f F = %.2f C%n", f, celsius(f));
		} else {
			System.out.print("Enter Celsius temperature: ");
			double c = input.nextDouble();
			System.out.printf("%.2f C = %.2f F%n", c, fahrenheit(c));
		}

		input.close();
	}
}