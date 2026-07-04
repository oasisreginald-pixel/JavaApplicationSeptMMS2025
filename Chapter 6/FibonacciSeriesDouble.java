import java.util.Scanner;

public class FibonacciSeriesDouble {
	static double fibonacci(double n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter value for n: ");
		double n = input.nextDouble();

		System.out.printf("Fibonacci(%.0f) = %.0f%n", n, fibonacci(n));
		input.close();
	}
}