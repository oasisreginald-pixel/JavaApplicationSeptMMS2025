import java.util.Scanner;

public class Multiples {
	static boolean isMultiple(int first, int second) {
		return second % first == 0;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two integers (or 0 0 to quit): ");
		int a = input.nextInt();
		int b = input.nextInt();

		while (a != 0 || b != 0) {
			if (isMultiple(a, b))
				System.out.printf("%d is a multiple of %d%n", b, a);
			else
				System.out.printf("%d is NOT a multiple of %d%n", b, a);

			System.out.print("Enter two integers (or 0 0 to quit): ");
			a = input.nextInt();
			b = input.nextInt();
		}

		input.close();
	}
}