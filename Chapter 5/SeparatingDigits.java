import java.util.Scanner;

public class SeparatingDigits {
	static int quotient(int a, int b) {
		return a / b;
	}

	static int remainder(int a, int b) {
		return a % b;
	}

	static void displayDigits(int number) {
		int[] digits = new int[5];
		int count = 0;

		while (number > 0) {
			digits[count++] = remainder(number, 10);
			number = quotient(number, 10);
		}

		for (int i = count - 1; i >= 0; i--) {
			System.out.print(digits[i]);
			if (i != 0)
				System.out.print("  ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer (1-99999): ");
		int number = input.nextInt();
		displayDigits(number);
		input.close();
	}
}