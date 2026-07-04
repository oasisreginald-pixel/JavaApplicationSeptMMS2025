import java.util.Scanner;

public class SalesCommissions {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] counters = new int[10]; // index 0-8 = ranges, index 9 = $1000 and over

		System.out.print("Enter number of salespeople (-1 to stop): ");
		int numSalespeople = input.nextInt();

		for (int i = 0; i < numSalespeople; i++) {
			System.out.printf("Enter gross sales for salesperson %d: ", i + 1);
			double grossSales = input.nextDouble();

			int salary = (int)(200 + 0.09 * grossSales); // truncated to integer

			if (salary >= 1000)
				counters[9]++;
			else
				counters[(salary - 200) / 100]++;
		}

		System.out.println("\nSalary Range          Number of Salespeople");
		String[] labels = {
			"$200-299", "$300-399", "$400-499", "$500-599", "$600-699",
			"$700-799", "$800-899", "$900-999", "", "$1000 and over"
		};

		for (int i = 0; i < counters.length; i++) {
			if (i == 8) continue; // there's no separate i) bucket - 8 ranges + $1000+
			System.out.printf("%-20s %d%n", labels[i], counters[i]);
		}

		input.close();
	}
}