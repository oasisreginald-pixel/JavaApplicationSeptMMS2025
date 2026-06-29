public class PrimeNumbers {
	static boolean isPrime(int n) {
		if (n < 2) return false;
		for (int i = 2; i <= Math.sqrt(n); i++)  
			if (n % i == 0) return false;
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Prime numbers less than 10,000:");
		int count = 0;
		for (int i = 2; i < 10000; i++) {
			if (isPrime(i)) {
				System.out.printf("%d ", i);
				count++;
			}
		}
		System.out.printf("%nTotal primes found: %d%n", count);
	}
}