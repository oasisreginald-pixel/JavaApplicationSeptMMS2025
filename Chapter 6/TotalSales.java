import java.util.Scanner;

public class TotalSales {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// sales[product][salesperson] - 5 products (1-5), 4 salespeople (1-4)
		double[][] sales = new double[6][5]; // index 0 unused for both

		System.out.println("Enter slips (salesperson, product, amount). Enter -1 for salesperson to stop.");

		while (true) {
			System.out.print("Salesperson (1-4) or -1 to stop: ");
			int salesperson = input.nextInt();
			if (salesperson == -1)
				break;

			System.out.print("Product (1-5): ");
			int product = input.nextInt();
			System.out.print("Amount: ");
			double amount = input.nextDouble();

			sales[product][salesperson] += amount;
		}

		// header row
		System.out.printf("%-10s", "Product");
		for (int sp = 1; sp <= 4; sp++)
			System.out.printf("SP%-8d", sp);
		System.out.printf("%-10s%n", "Total");

		double[] salespersonTotals = new double[5];
		double grandTotal = 0.0;

		for (int product = 1; product <= 5; product++) {
			System.out.printf("%-10d", product);
			double productTotal = 0.0;

			for (int sp = 1; sp <= 4; sp++) {
				System.out.printf("%-10.2f", sales[product][sp]);
				productTotal += sales[product][sp];
				salespersonTotals[sp] += sales[product][sp];
			}

			System.out.printf("%-10.2f%n", productTotal);
			grandTotal += productTotal;
		}

		System.out.printf("%-10s", "Total");
		for (int sp = 1; sp <= 4; sp++)
			System.out.printf("%-10.2f", salespersonTotals[sp]);
		System.out.printf("%-10.2f%n", grandTotal);

		input.close();
	}
}