import java.util.Scanner;

public class CAIMonitored {
	static int num1, num2;
	static int correct = 0, incorrect = 0;

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
		correct = 0;
		incorrect = 0;
		generateQuestion();

		while (input.hasNextInt()) {
			int answer = input.nextInt();
			if (answer == num1 * num2) {
				correctResponse();
				correct++;
			} else {
				incorrectResponse();
				incorrect++;
			}

			if (correct + incorrect == 10) {
				double percentage = (double) correct / 10 * 100;
				System.out.printf("You got %.0f%% correct.%n", percentage);
				if (percentage < 75)
					System.out.println("Please ask your teacher for extra help.");
				else
					System.out.println("Congratulations, you are ready to go to the next level!");

				correct = 0;
				incorrect = 0;
				System.out.println("--- New student, start fresh! ---");
			}

			generateQuestion();
		}

		input.close();
	}
}