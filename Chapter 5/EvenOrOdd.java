import java.util.Scanner;

public class EvenOrOdd {
	static boolean isEven(int n) {
		return n % 2 == 0;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter integers (non-integer to quit): ");

		while (input.hasNextInt()) {
			int n = input.nextInt();
			System.out.printf("%d is %s%n", n, isEven(n) ? "even" : "odd");
		}

		input.close();
	}
}