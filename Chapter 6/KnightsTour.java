import java.util.Scanner;

public class KnightsTour {
	static int[][] board = new int[8][8];
	static int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
	static int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter starting row (0-7): ");
		int currentRow = input.nextInt();
		System.out.print("Enter starting column (0-7): ");
		int currentColumn = input.nextInt();

		board[currentRow][currentColumn] = 1;
		int moveCount = 1;

		for (int i = 0; i < 63; i++) {
			int moveNumber = findValidMove(currentRow, currentColumn);

			if (moveNumber == -1) {
				System.out.println("No more valid moves available.");
				break;
			}

			currentRow += vertical[moveNumber];
			currentColumn += horizontal[moveNumber];
			moveCount++;
			board[currentRow][currentColumn] = moveCount;
		}

		System.out.printf("The knight made %d moves.%n%n", moveCount);
		displayBoard();
		input.close();
	}

	static int findValidMove(int currentRow, int currentColumn) {
		for (int moveNumber = 0; moveNumber < 8; moveNumber++) {
			int testRow = currentRow + vertical[moveNumber];
			int testColumn = currentColumn + horizontal[moveNumber];

			if (isValidMove(testRow, testColumn))
				return moveNumber;
		}
		return -1;
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