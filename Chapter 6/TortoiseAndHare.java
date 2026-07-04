import java.util.Random;

public class TortoiseAndHare {
	public static void main(String[] args) {
		Random random = new Random();
		int tortoise = 1, hare = 1;

		System.out.println("BANG !!!!!");
		System.out.println("AND THEY'RE OFF !!!!!");

		while (tortoise < 70 && hare < 70) {
			// move tortoise
			int tortoiseMove = 1 + random.nextInt(10);
			if (tortoiseMove <= 5)
				tortoise += 3; // fast plod
			else if (tortoiseMove <= 7)
				tortoise -= 6; // slip
			else
				tortoise += 1; // slow plod

			if (tortoise < 1)
				tortoise = 1;

			// move hare
			int hareMove = 1 + random.nextInt(10);
			if (hareMove <= 2)
				hare -= 12; // big slip
			else if (hareMove <= 3)
				hare += 9; // big hop
			else if (hareMove <= 6)
				hare += 1; // small hop
			else if (hareMove <= 8)
				hare -= 2; // small slip
			else
				; // sleep, no movement

			if (hare < 1)
				hare = 1;

			displayPositions(tortoise, hare);

			if (tortoise >= 70 && hare >= 70) {
				System.out.println("It's a tie!");
				return;
			} else if (tortoise >= 70) {
				System.out.println("FINGERLORD WINS!!! YAY!!!");
				return;
			} else if (hare >= 70) {
				System.out.println("Hare wins. Yuch.");
				return;
			}
		}
	}

	static void displayPositions(int tortoise, int hare) {
		StringBuilder line = new StringBuilder();
		for (int i = 1; i <= 70; i++)
			line.append(" ");

		if (tortoise == hare) {
			// OUCH!!! starting at that position
			int pos = Math.min(tortoise - 1, 70 - 8); // ensure it fits
			line.replace(pos, pos + 8, "OUCH!!!!");
		} else {
			if (tortoise >= 1 && tortoise <= 70)
				line.setCharAt(tortoise - 1, 'T');
			if (hare >= 1 && hare <= 70)
				line.setCharAt(hare - 1, 'H');
		}

		System.out.println(line.toString());
	}
}