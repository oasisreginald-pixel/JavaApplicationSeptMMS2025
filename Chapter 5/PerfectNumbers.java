public class PerfectNumbers {
	static boolean isPerfect(int number) {
		int sum = 0;
		for (int i = 1; i < number; i++)
			if (number % i == 0)
				sum += i;
		return sum == number;
	}

	public static void main(String[] args) {
		System.out.println("Perfect numbers between 1 and 1000:");
		for (int i = 1; i <= 1000; i++) {
			if (isPerfect(i)) {
				System.out.printf("%d = ", i);
				boolean first = true;
				for (int f = 1; f < i; f++) {
					if (i % f == 0) {
						if (!first) System.out.print(" + ");
						System.out.print(f);
						first = false;
					}
				}
				System.out.println();
			}
		}
	}
}