public class CompoundInterest {
	public static void main(String[] args) {
		double principal = 1000.00;

		for (int rate = 5; rate <= 10; rate++) {
			System.out.printf("%nInterest Rate: %d%%%n", rate);
			System.out.printf("%-10s %s%n", "Year", "Amount on deposit");
			System.out.println("----------------------------");

			for (int year = 1; year <= 10; year++) {
				double amount = principal * Math.pow(1 + rate / 100.0, year);
				System.out.printf("%-10d %.2f%n", year, amount);
			}
		}
	}
}