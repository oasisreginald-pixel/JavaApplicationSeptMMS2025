public class VarargsProduct {
	static long product(int... numbers) {
		long result = 1;
		for (int num : numbers)
			result *= num;
		return result;
	}

	public static void main(String[] args) {
		System.out.printf("product(2, 3) = %d%n", product(2, 3));
		System.out.printf("product(2, 3, 4) = %d%n", product(2, 3, 4));
		System.out.printf("product(2, 3, 4, 5) = %d%n", product(2, 3, 4, 5));
		System.out.printf("product(10) = %d%n", product(10));
	}
}