import java.util.Scanner;

public class FibonacciSeries {
	static long fibonacci(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter value for n: ");
		int n = input.nextInt();

		System.out.printf("Fibonacci(%d) = %d%n", n, fibonacci(n));
		input.close();
	}
}