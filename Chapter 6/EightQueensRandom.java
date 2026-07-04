import java.util.Random;

public class EightQueensRandom {
	static int[] queenColumn = new int[8];
	static Random random = new Random();

	public static void main(String[] args) {
		long attempts = 0;
		boolean solved = false;

		while (!solved) {
			placeRandomly();
			attempts++;
			solved = isValidSolution();

			if (attempts % 1_000_000 == 0)
				System.out.printf("Attempt %,d...%n", attempts);
		}

		System.out.printf("Solution found after %,d attempts!%n", attempts);
		displayBoard();
	}

	static void placeRandomly() {
		for (int row = 0; row < 8; row++)
			queenColumn[row] = random.nextInt(8);
	}

	static boolean isValidSolution() {
		for (int row1 = 0; row1 < 8; row1++) {
			for (int row2 = row1 + 1; row2 < 8; row2++) {
				if (queenColumn[row1] == queenColumn[row2])
					return false; // same column
				if (Math.abs(queenColumn[row1] - queenColumn[row2]) == Math.abs(row1 - row2))
					return false; // same diagonal
			}
		}
		return true;
	}

	static void displayBoard() {
		for (int row = 0; row < 8; row++) {
			for (int col = 0; col < 8; col++)
				System.out.print(queenColumn[row] == col ? " Q " : " . ");
			System.out.println();
		}
	}
}