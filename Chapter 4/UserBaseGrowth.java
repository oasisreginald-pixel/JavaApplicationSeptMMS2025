public class UserBaseGrowth {
	public static void main(String[] args) {
		double users = 1_000_000_000.0;
		double growthRate = 0.04;
		int months15 = 0, months20 = 0;
		boolean found15 = false, found20 = false;

		for (int month = 1; !found20; month++) {
			users *= (1 + growthRate);

			if (!found15 && users >= 1_500_000_000.0) {
				months15 = month;
				found15 = true;
			}
			if (users >= 2_000_000_000.0) {
				months20 = month;
				found20 = true;
			}
		}

		System.out.printf("Months to reach 1.5 billion users: %d%n", months15);
		System.out.printf("Months to reach 2.0 billion users: %d%n", months20);
	}
}