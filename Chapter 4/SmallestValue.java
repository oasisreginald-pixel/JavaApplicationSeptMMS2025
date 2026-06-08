import java.util.Scanner;

public class SmallestValue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("How many numbers will you enter? ");
		int count = input.nextInt();

		System.out.print("Enter number 1: ");
		int smallest = input.nextInt();

		for (int i = 2; i <= count; i++) {
			System.out.printf("Enter number %d: ", i);
			int number = input.nextInt();
			if (number < smallest)
				smallest = number;
		}

		System.out.printf("The smallest value is: %d%n", smallest);
	}
}