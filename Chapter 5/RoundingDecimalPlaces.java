import java.util.Scanner;

public class RoundingDecimalPlaces {
	static double roundToInteger(double number) {
		return Math.floor(number + 0.5);
	}

	static double roundToTenths(double number) {
		return Math.floor(number * 10 + 0.5) / 10;
	}

	static double roundToHundredths(double number) {
		return Math.floor(number * 100 + 0.5) / 100;
	}

	static double roundToThousandths(double number) {
		return Math.floor(number * 1000 + 0.5) / 1000;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a double value: ");
		double x = input.nextDouble();

		System.out.printf("Original:      %.4f%n", x);
		System.out.printf("Integer:       %.0f%n", roundToInteger(x));
		System.out.printf("Tenths:        %.1f%n", roundToTenths(x));
		System.out.printf("Hundredths:    %.2f%n", roundToHundredths(x));
		System.out.printf("Thousandths:   %.3f%n", roundToThousandths(x));

		input.close();
	}
}