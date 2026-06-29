import java.util.Scanner;

public class CAI {
	static int num1, num2;

	static void generateQuestion() {
		num1 = (int)(Math.random() * 9) + 1;
		num2 = (int)(Math.random() * 9) + 1;
		System.out.printf("How much is %d times %d? ", num1, num2);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		generateQuestion();

		while (input.hasNextInt()) {
			int answer = input.nextInt();
			if (answer == num1 * num2) {
				System.out.println("Very good!");
				generateQuestion();
			} else {
				System.out.print("No. Please try again. ");
			}
		}

		input.close();
	}
}