import java.util.Scanner;

public class KnightsTourHeuristic {
	static int[][] board = new int[8][8];
	static int[][] accessibility = new int[8][8];
	static int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
	static int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter starting row (0-7): ");
		int currentRow = input.nextInt();
		System.out.print("Enter starting column (0-7): ");
		int currentColumn = input.nextInt();

		initializeAccessibility();
		board[currentRow][currentColumn] = 1;
		updateAccessibility(currentRow, currentColumn);
		int moveCount = 1;

		for (int i = 0; i < 63; i++) {
			int moveNumber = findBestMove(currentRow, currentColumn);

			if (moveNumber == -1) {
				System.out.println("No more valid moves available.");
				break;
			}

			currentRow += vertical[moveNumber];
			currentColumn += horizontal[moveNumber];
			moveCount++;
			board[currentRow][currentColumn] = moveCount;
			updateAccessibility(currentRow, currentColumn);
		}

		System.out.printf("The knight made %d moves.%n", moveCount);
		if (moveCount == 64)
			System.out.println("Full tour achieved!");
		System.out.println();
		displayBoard();
		input.close();
	}

	static void initializeAccessibility() {
		for (int row = 0; row < 8; row++) {
			for (int col = 0; col < 8; col++) {
				int count = 0;
				for (int move = 0; move < 8; move++) {
					int testRow = row + vertical[move];
					int testCol = col + horizontal[move];
					if (testRow >= 0 && testRow < 8 && testCol >= 0 && testCol < 8)
						count++;
				}
				accessibility[row][col] = count;
			}
		}
	}

	static void updateAccessibility(int row, int col) {
		accessibility[row][col] = -1; // mark visited so it's never selected again
		for (int move = 0; move < 8; move++) {
			int testRow = row + vertical[move];
			int testCol = col + horizontal[move];
			if (testRow >= 0 && testRow < 8 && testCol >= 0 && testCol < 8 && accessibility[testRow][testCol] > 0)
				accessibility[testRow][testCol]--;
		}
	}

	static int findBestMove(int currentRow, int currentColumn) {
		int bestMove = -1;
		int lowestAccessibility = Integer.MAX_VALUE;

		for (int moveNumber = 0; moveNumber < 8; moveNumber++) {
			int testRow = currentRow + vertical[moveNumber];
			int testColumn = currentColumn + horizontal[moveNumber];

			if (isValidMove(testRow, testColumn)) {
				if (accessibility[testRow][testColumn] < lowestAccessibility) {
					lowestAccessibility = accessibility[testRow][testColumn];
					bestMove = moveNumber;
				}
			}
		}
		return bestMove;
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