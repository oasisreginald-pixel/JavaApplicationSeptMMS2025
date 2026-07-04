public class EightQueensExhaustive {
	static int[] queenColumn = new int[8];
	static long attempts = 0;

	public static void main(String[] args) {
		boolean found = tryAllCombinations(0);

		if (found) {
			System.out.printf("Solution found after %,d combinations checked!%n", attempts);
			displayBoard();
		} else {
			System.out.println("No solution found.");
		}
	}

	static boolean tryAllCombinations(int row) {
		if (row == 8) {
			attempts++;
			return isValidSolution();
		}

		for (int col = 0; col < 8; col++) {
			queenColumn[row] = col;
			if (tryAllCombinations(row + 1))
				return true;
		}
		return false;
	}

	static boolean isValidSolution() {
		for (int row1 = 0; row1 < 8; row1++) {
			for (int row2 = row1 + 1; row2 < 8; row2++) {
				if (queenColumn[row1] == queenColumn[row2])
					return false;
				if (Math.abs(queenColumn[row1] - queenColumn[row2]) == Math.abs(row1 - row2))
					return false;
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