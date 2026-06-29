import java.util.Scanner;

public class GuessTheNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String playAgain;

		do {
			int secret = (int)(Math.random() * 1000) + 1;
			System.out.println("Guess a number between 1 and 1000.");
			int guess = input.nextInt();

			while (guess != secret) {
				if (guess > secret)
					System.out.print("Too high. Try again: ");
				else
					System.out.print("Too low. Try again: ");
				guess = input.nextInt();
			}

			System.out.println("Congratulations. You guessed the number!");
			System.out.print("Play again? (yes/no): ");
			playAgain = input.next();
		} while (playAgain.equalsIgnoreCase("yes"));

		input.close();
	}
}