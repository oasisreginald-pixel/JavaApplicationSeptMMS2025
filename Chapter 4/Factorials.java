public class Factorials {
	public static void main(String[] args) {
		System.out.printf("%-10s %s%n", "Number", "Factorial");
		System.out.println("---------------------------");

		long factorial = 1;

		for (int i = 1; i <= 20; i++) {
			factorial *= i;
			System.out.printf("%-10d %d%n", i, factorial);
		}

		System.out.println("\nNote: 100! cannot be stored in a long.");
		System.out.println("long max = " + Long.MAX_VALUE);
		System.out.println("100! far exceeds this, causing overflow.");
	}
}