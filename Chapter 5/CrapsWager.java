import java.util.Scanner;

public class CrapsWager {
	static int rollDice() {
		return (int)(Math.random() * 6) + 1 + (int)(Math.random() * 6) + 1;
	}

	static String chatter(int bankBalance) {
		int choice = (int)(Math.random() * 3);
		if (bankBalance > 1200) return "You're up big. Now's the time to cash in your chips!";
		else if (choice == 0) return "Oh, you're going for broke, huh?";
		else if (choice == 1) return "Aw c'mon, take a chance!";
		else return "Keep it going, feeling lucky?";
	}

	static boolean playCraps() {
		int sum = rollDice();
		System.out.printf("Player rolled %d%n", sum);
		int point;

		if (sum == 7 || sum == 11) {
			System.out.println("Player wins!");
			return true;
		} else if (sum == 2 || sum == 3 || sum == 12) {
			System.out.println("Player loses!");
			return false;
		} else {
			point = sum;
			System.out.printf("Point is %d%n", point);
			while (true) {
				sum = rollDice();
				System.out.printf("Player rolled %d%n", sum);
				if (sum == point) { System.out.println("Player wins!"); return true; }
				else if (sum == 7) { System.out.println("Player loses!"); return false; }
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int bankBalance = 1000;

		while (bankBalance > 0) {
			System.out.printf("Bank balance: $%d%n", bankBalance);
			System.out.println(chatter(bankBalance));
			System.out.print("Enter wager: ");
			int wager = input.nextInt();

			while (wager > bankBalance) {
				System.out.printf("Wager exceeds balance $%d. Re-enter: ", bankBalance);
				wager = input.nextInt();
			}

			if (playCraps())
				bankBalance += wager;
			else
				bankBalance -= wager;

			System.out.printf("New balance: $%d%n", bankBalance);

			if (bankBalance == 0) {
				System.out.println("Sorry. You busted!");
				break;
			}

			System.out.print("Play again? (yes/no): ");
			if (!input.next().equalsIgnoreCase("yes")) break;
		}

		input.close();
	}
}