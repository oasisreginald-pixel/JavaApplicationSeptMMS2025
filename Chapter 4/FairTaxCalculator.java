import java.util.Scanner;

public class FairTaxCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[] categories = {
			"Housing", "Food", "Clothing",
			"Transportation", "Education",
			"Health care", "Vacations"
		};

		double totalExpenses = 0;

		System.out.println("=== FairTax Calculator ===");
		System.out.println("Enter your yearly expenses:\n");

		for (int i = 0; i < categories.length; i++) {
			System.out.printf("%s: $", categories[i]);
			totalExpenses += input.nextDouble();
		}

		System.out.printf("%nTotal yearly expenses:       $%.2f%n", totalExpenses);
		System.out.printf("Estimated FairTax (23%%):     $%.2f%n", totalExpenses * 0.23);
		System.out.printf("Estimated FairTax (30%% alt): $%.2f%n", totalExpenses * 0.30);
	}
}