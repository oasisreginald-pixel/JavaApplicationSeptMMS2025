import java.util.Scanner;

public class CAIDifficulty {
	static int num1, num2, level;

	static void generateQuestion() {
		int max = (int) Math.pow(10, level);
		num1 = (int)(Math.random() * max);
		num2 = (int)(Math.random() * max);
		System.out.printf("How much is %d times %d? ", num1, num2);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter difficulty level (1=single digit, 2=two digits, etc.): ");
		level = input.nextInt();
		generateQuestion();

		while (input.hasNextInt()) {
			int answer = input.nextInt();
			if (answer == num1 * num2) {
				System.out.println("Correct!");
				generateQuestion();
			} else {
				System.out.println("Wrong. Try again.");
			}
		}

		input.close();
	}
}