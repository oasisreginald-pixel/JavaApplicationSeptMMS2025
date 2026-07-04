public class KnightsTourClosedTest {
	static int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
	static int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};

	static boolean isClosedTour(int startRow, int startCol, int finalRow, int finalCol) {
		for (int moveNumber = 0; moveNumber < 8; moveNumber++) {
			int testRow = finalRow + vertical[moveNumber];
			int testCol = finalCol + horizontal[moveNumber];

			if (testRow == startRow && testCol == startCol)
				return true;
		}
		return false;
	}


	public static void main(String[] args) {
		// Example test
		System.out.println(isClosedTour(0, 0, 1, 2)); // true: (1,2) -> (0,0) is a valid knight move
		System.out.println(isClosedTour(0, 0, 5, 5)); // false
	}
}