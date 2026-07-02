import java.util.Scanner;

public class CAIAllTypes {
	static int num1, num2, operation, level;

	static void generateQuestion(int opChoice) {
		int max = (int) Math.pow(10, level);
		num1 = (int)(Math.random() * max) + 1;
		num2 = (int)(Math.random() * max) + 1;

		if (opChoice == 5)
			operation = (int)(Math.random() * 4) + 1;
		else
			operation = opChoice;

		switch (operation) {
			case 1: System.out.printf("%d + %d = ? ", num1, num2); break;
			case 2: System.out.printf("%d - %d = ? ", num1, num2); break;
			case 3: System.out.printf("%d * %d = ? ", num1, num2); break;
			case 4:
				num1 = num1 * num2; // ensure clean division
				System.out.printf("%d / %d = ? ", num1, num2); break;
		}
	}

	static boolean checkAnswer(int answer) {
		switch (operation) {
			case 1: return answer == num1 + num2;
			case 2: return answer == num1 - num2;
			case 3: return answer == num1 * num2;
			case 4: return answer == num1 / num2;
			default: return false;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Difficulty level: ");
		level = input.nextInt();
		System.out.println("Type: 1=Add  2=Sub  3=Mult  4=Div  5=Random");
		System.out.print("Your choice: ");
		int opChoice = input.nextInt();

		generateQuestion(opChoice);

		while (input.hasNextInt()) {
			int answer = input.nextInt();
			if (checkAnswer(answer))
				System.out.println("Correct!");
			else
				System.out.println("Wrong. Try again.");
			generateQuestion(opChoice);
		}

		input.close();
	}
}