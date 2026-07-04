import java.util.Scanner;

public class TurtleGraphics {
	static int[][] floor = new int[20][20];
	static int currentRow = 0, currentCol = 0;
	static boolean penDown = false;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of commands: ");
		int numCommands = input.nextInt();
		int[] commands = new int[numCommands];

		System.out.println("Enter commands (1=pen up, 2=pen down, 3=turn right, 4=turn left, 5,n=move n, 6=print, 9=end):");
		for (int i = 0; i < numCommands; i++)
			commands[i] = input.nextInt();

		processCommands(commands, input);
		input.close();
	}

	static int direction = 0; // 0=right, 1=down, 2=left, 3=up

	static void processCommands(int[] commands, Scanner input) {
		for (int i = 0; i < commands.length; i++) {
			int command = commands[i];

			switch (command) {
				case 1: penDown = false; break;
				case 2: penDown = true; break;
				case 3: direction = (direction + 1) % 4; break; // turn right
				case 4: direction = (direction + 3) % 4; break; // turn left
				case 5:
					i++;
					int distance = commands[i];
					move(distance);
					break;
				case 6: displayFloor(); break;
				case 9: return; // end of data
			}
		}
	}

	static void move(int distance) {
		for (int step = 0; step < distance; step++) {
			if (penDown && currentRow >= 0 && currentRow < 20 && currentCol >= 0 && currentCol < 20)
				floor[currentRow][currentCol] = 1;

			switch (direction) {
				case 0: currentCol++; break; // right
				case 1: currentRow++; break; // down
				case 2: currentCol--; break; // left
				case 3: currentRow--; break; // up
			}
		}

		if (penDown && currentRow >= 0 && currentRow < 20 && currentCol >= 0 && currentCol < 20)
			floor[currentRow][currentCol] = 1;
	}

	static void displayFloor() {
		for (int row = 0; row < 20; row++) {
			for (int col = 0; col < 20; col++)
				System.out.print(floor[row][col] == 1 ? "*" : " ");
			System.out.println();
		}
	}
}