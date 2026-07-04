import java.util.Random;

public class KnightsTourBruteForce {
	static int[][] board = new int[8][8];
	static int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
	static int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};
	static Random random = new Random();

	public static void main(String[] args) {
		// Part (a): single random tour
		System.out.println("--- Single Random Tour ---");
		int length = runRandomTour(0, 0);
		System.out.printf("Knight reached %d squares.%n%n", length);
		displayBoard();

		// Part (b): 1000 tours, tally lengths
		System.out.println("\n--- 1000 Random Tours ---");
		int[] tourLengths = new int[65]; // index 1-64

		for (int i = 0; i < 1000; i++) {
			int len = runRandomTour(0, 0);
			tourLengths[len]++;
		}

		System.out.printf("%-10s%s%n", "Length", "Frequency");
		int bestLength = 0;
		for (int len = 1; len <= 64; len++) {
			if (tourLengths[len] > 0) {
				System.out.printf("%-10d%d%n", len, tourLengths[len]);
				bestLength = len;
			}
		}
		System.out.printf("Best tour length: %d%n", bestLength);

		// Part (c): run until a full tour (64) is found
		System.out.println("\n--- Running until full tour found ---");
		int attempts = 0;
		int len;
		long startTime = System.currentTimeMillis();

		do {
			len = runRandomTour(0, 0);
			attempts++;
		} while (len < 64);

		long endTime = System.currentTimeMillis();
		System.out.printf("Full tour found after %d attempts.%n", attempts);
		System.out.printf("Time taken: %d ms%n", endTime - startTime);
	}

	static int runRandomTour(int startRow, int startCol) {
		board = new int[8][8]; // reset board
		int currentRow = startRow, currentColumn = startCol;
		board[currentRow][currentColumn] = 1;
		int moveCount = 1;

		for (int i = 0; i < 63; i++) {
			int moveNumber = randomValidMove(currentRow, currentColumn);
			if (moveNumber == -1)
				break;

			currentRow += vertical[moveNumber];
			currentColumn += horizontal[moveNumber];
			moveCount++;
			board[currentRow][currentColumn] = moveCount;
		}

		return moveCount;
	}

	static int randomValidMove(int currentRow, int currentColumn) {
		int[] possibleMoves = new int[8];
		int count = 0;

		for (int moveNumber = 0; moveNumber < 8; moveNumber++) {
			int testRow = currentRow + vertical[moveNumber];
			int testColumn = currentColumn + horizontal[moveNumber];

			if (isValidMove(testRow, testColumn))
				possibleMoves[count++] = moveNumber;
		}

		if (count == 0)
			return -1;

		return possibleMoves[random.nextInt(count)];
	}

	static boolean isValidMove(int row, int column) {
		return row >= 0 && row < 8 && column >= 0 && column < 8 && board[row][column] == 0;
	}

	static void displayBoard() {
		for (int row = 0; row < 8; row++) {
			for (int col = 0; col < 8; col++)
				System.out.printf("%4d", board[row][col]);
			System.out.println();
		}
	}
}