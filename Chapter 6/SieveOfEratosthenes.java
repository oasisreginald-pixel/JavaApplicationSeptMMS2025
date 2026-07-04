public class SieveOfEratosthenes {
	public static void main(String[] args) {
		boolean[] isPrime = new boolean[1000];

		for (int i = 0; i < isPrime.length; i++)
			isPrime[i] = true;

		for (int i = 2; i < isPrime.length; i++) {
			if (isPrime[i]) {
				for (int multiple = i * 2; multiple < isPrime.length; multiple += i)
					isPrime[multiple] = false;
			}
		}

		System.out.println("Prime numbers between 2 and 999:");
		int count = 0;
		for (int i = 2; i < isPrime.length; i++) {
			if (isPrime[i]) {
				System.out.printf("%-5d", i);
				count++;
				if (count % 10 == 0)
					System.out.println();
			}
		}
		System.out.printf("%n%nTotal primes found: %d%n", count);
	}
}