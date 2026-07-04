import java.util.Scanner;

public class AirlineReservations {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean[] seats = new boolean[11]; // index 1-10 used, 0 ignored
		// First class: seats 1-5, Economy: seats 6-10

		boolean planeNotFull = true;

		while (planeNotFull) {
			System.out.println("Please type 1 for First Class");
			System.out.println("Please type 2 for Economy");
			int choice = input.nextInt();

			int start, end;
			String section;

			if (choice == 1) {
				start = 1; end = 5; section = "First Class";
			} else {
				start = 6; end = 10; section = "Economy";
			}

			boolean assigned = false;

			for (int i = start; i <= end; i++) {
				if (!seats[i]) {
					seats[i] = true;
					assigned = true;
					System.out.printf("Boarding pass: Seat %d, %s%n", i, section);
					break;
				}
			}

			if (!assigned) {
				// section is full, ask about the other section
				int altStart = (choice == 1) ? 6 : 1;
				int altEnd = (choice == 1) ? 10 : 5;
				String altSection = (choice == 1) ? "Economy" : "First Class";

				System.out.printf("%s is full. Would you accept %s instead? (1=yes, 2=no): ", section, altSection);
				int response = input.nextInt();

				if (response == 1) {
					for (int i = altStart; i <= altEnd; i++) {
						if (!seats[i]) {
							seats[i] = true;
							assigned = true;
							System.out.printf("Boarding pass: Seat %d, %s%n", i, altSection);
							break;
						}
					}
				}

				if (!assigned)
					System.out.println("Next flight leaves in 3 hours.");
			}

			// check if plane is completely full
			planeNotFull = false;
			for (int i = 1; i <= 10; i++) {
				if (!seats[i]) {
					planeNotFull = true;
					break;
				}
			}

			if (planeNotFull) {
				System.out.print("Process another passenger? (1=yes, 2=no): ");
				int again = input.nextInt();
				if (again == 2)
					break;
			} else {
				System.out.println("Flight is full!");
			}
		}

		input.close();
	}
}