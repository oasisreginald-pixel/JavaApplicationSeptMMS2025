import java.util.Scanner;

public class ParkingCharges {
	static double calculateCharges(double hours) {
		double charge;
		if (hours <= 3)
			charge = 2.00;
		else
			charge = 2.00 + (Math.ceil(hours - 3) * 0.50);

		if (charge > 10.00)
			charge = 10.00;

		return charge;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double total = 0;
		String another;

		do {
			System.out.print("Enter hours parked: ");
			double hours = input.nextDouble();
			double charge = calculateCharges(hours);
			total += charge;
			System.out.printf("Charge for this customer: $%.2f%n", charge);
			System.out.printf("Running total of receipts: $%.2f%n", total);
			System.out.print("Another customer? (yes/no): ");
			another = input.next();
		} while (another.equalsIgnoreCase("yes"));

		input.close();
	}
}