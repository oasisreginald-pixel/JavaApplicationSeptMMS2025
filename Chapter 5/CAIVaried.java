import java.util.Scanner;

public class CAIVaried {
	static int num1, num2;

	static void generateQuestion() {
		num1 = (int)(Math.random() * 9) + 1;
		num2 = (int)(Math.random() * 9) + 1;
		System.out.printf("How much is %d times %d? ", num1, num2);
	}

	static void correctResponse() {
		switch ((int)(Math.random() * 4)) {
			case 0: System.out.println("Very good!"); break;
			case 1: System.out.println("Excellent!"); break;
			case 2: System.out.println("Nice work!"); break;
			case 3: System.out.println("Keep up the good work!"); break;
		}
	}

	static void incorrectResponse() {
		switch ((int)(Math.random() * 4)) {
			case 0: System.out.println("No. Please try again."); break;
			case 1: System.out.println("Wrong. Try once more."); break;
			case 2: System.out.println("Don't give up!"); break;
			case 3: System.out.println("No. Keep trying."); break;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		generateQuestion();

		while (input.hasNextInt()) {
			int answer = input.nextInt();
			if (answer == num1 * num2) {
				correctResponse();
				generateQuestion();
			} else {
				incorrectResponse();
			}
		}

		input.close();
	}
}