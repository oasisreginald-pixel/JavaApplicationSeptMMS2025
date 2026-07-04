public class EightQueens {
	static int[][] board = new int[8][8]; // 0 = empty, 1 = queen
	static int[] queenColumn = new int[8]; // queenColumn[row] = column of queen in that row

	public static void main(String[] args) {
		int[][] elimination = calculateElimination();
		boolean success = placeQueens(0, elimination);

		if (success) {
			System.out.println("Solution found!");
			displayBoard();
		} else {
			System.out.println("No solution found with this heuristic.");
		}
	}

	static int[][] calculateElimination() {
		int[][] elim = new int[8][8];
		for (int row = 0; row < 8; row++) {
			for (int col = 0; col < 8; col++) {
				int count = 0;
				// count squares eliminated: same row, same column, both diagonals
				for (int i = 0; i < 8; i++) {
					if (i != col) count++; // row
					if (i != row) count++; // column
				}
				// diagonals
				for (int d = -7; d <= 7; d++) {
					if (d != 0) {
						if (row + d >= 0 && row + d < 8 && col + d >= 0 && col + d < 8) count++;
						if (row + d >= 0 && row + d < 8 && col - d >= 0 && col - d < 8) count++;
					}
				}
				elim[row][col] = count;
			}
		}
		return elim;
	}

	static boolean placeQueens(int row, int[][] elimination) {
		if (row == 8)
			return true;

		// find column in this row with smallest elimination number that's still safe
		int bestCol = -1;
		int lowestElim = Integer.MAX_VALUE;

		for (int col = 0; col < 8; col++) {
			if (isSafe(row, col) && elimination[row][col] < lowestElim) {
				lowestElim = elimination[row][col];
				bestCol = col;
			}
		}

		if (bestCol == -1)
			return false;

		queenColumn[row] = bestCol;
		board[row][bestCol] = 1;

		if (placeQueens(row + 1, elimination))
			return true;

		// backtrack
		board[row][bestCol] = 0;
		return false;
	}

	static boolean isSafe(int row, int col) {
		for (int r = 0; r < row; r++) {
			int c = queenColumn[r];
			if (c == col || Math.abs(c - col) == Math.abs(r - row))
				return false;
		}
		return true;
	}

	static void displayBoard() {
		for (int row = 0; row < 8; row++) {
			for (int col = 0; col < 8; col++)
				System.out.print(board[row][col] == 1 ? " Q " : " . ");
			System.out.println();
		}
	}
}