import java.util.Scanner;

public class CoinToss {
	enum Coin { HEADS, TAILS }

	static Coin flip() {
		return (Math.random() < 0.5) ? Coin.HEADS : Coin.TAILS;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int heads = 0, tails = 0;
		String choice;

		do {
			System.out.print("Enter 'toss' to toss coin or 'quit' to stop: ");
			choice = input.next();
			if (choice.equalsIgnoreCase("toss")) {
				Coin result = flip();
				if (result == Coin.HEADS) heads++;
				else tails++;
				System.out.printf("Result: %s  |  Heads: %d  Tails: %d%n", result, heads, tails);
			}
		} while (!choice.equalsIgnoreCase("quit"));

		input.close();
	}
}