import java.util.Scanner;

public class GuessWithCount {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String playAgain;

		do {
			int secret = (int)(Math.random() * 1000) + 1;
			int guesses = 0;
			System.out.println("Guess a number between 1 and 1000.");
			int guess = input.nextInt();
			guesses++;

			while (guess != secret) {
				if (guess > secret)
					System.out.print("Too high. Try again: ");
				else
					System.out.print("Too low. Try again: ");
				guess = input.nextInt();
				guesses++;
			}

			System.out.println("Congratulations. You guessed the number!");
			System.out.printf("You guessed it in %d tries.%n", guesses);

			if (guesses < 10)
				System.out.println("Either you know the secret or you got lucky!");
			else if (guesses == 10)
				System.out.println("Aha! You know the secret!");
			else
				System.out.println("You should be able to do better!");

			System.out.print("Play again? (yes/no): ");
			playAgain = input.next();
		} while (playAgain.equalsIgnoreCase("yes"));

		input.close();
	}
}