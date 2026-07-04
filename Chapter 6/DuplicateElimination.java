import java.util.Scanner;

public class DuplicateElimination {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] uniqueNumbers = new int[5];
		int count = 0;

		for (int i = 0; i < 5; i++) {
			System.out.print("Enter a number between 10 and 100: ");
			int number = input.nextInt();

			boolean isDuplicate = false;
			for (int j = 0; j < count; j++) {
				if (uniqueNumbers[j] == number) {
					isDuplicate = true;
					break;
				}
			}

			if (!isDuplicate) {
				uniqueNumbers[count] = number;
				count++;
				System.out.print("Unique values so far: ");
				for (int j = 0; j < count; j++)
					System.out.printf("%d ", uniqueNumbers[j]);
				System.out.println();
			} else {
				System.out.println("Duplicate! Not added.");
			}
		}

		input.close();
	}
}