import java.util.Scanner;

public class Polling {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[] topics = {
			"Climate Change",
			"Education Access",
			"Healthcare Affordability",
			"Poverty Reduction",
			"Digital Literacy"
		};

		int[][] responses = new int[5][11]; // rows = topics, cols 1-10 = ratings

		System.out.println("Please rate the following issues from 1 (least important) to 10 (most important).");
		System.out.println("Type -1 at any time to stop collecting responses.\n");

		boolean collecting = true;
		while (collecting) {
			for (int t = 0; t < topics.length; t++) {
				System.out.printf("Rate '%s' (1-10): ", topics[t]);
				int rating = input.nextInt();

				if (rating == -1) {
					collecting = false;
					break;
				}

				if (rating >= 1 && rating <= 10)
					responses[t][rating]++;
				else
					System.out.println("Invalid rating, skipping.");
			}

			if (collecting) {
				System.out.print("\nAnother respondent? (1=yes, 2=no): ");
				int again = input.nextInt();
				if (again == 2)
					collecting = false;
				System.out.println();
			}
		}

		// a) Tabular report
		System.out.printf("%-25s", "Topic");
		for (int rating = 1; rating <= 10; rating++)
			System.out.printf("%4d", rating);
		System.out.println();

		int[] topicTotals = new int[5];

		for (int t = 0; t < topics.length; t++) {
			System.out.printf("%-25s", topics[t]);
			int sumPoints = 0;
			int countResponses = 0;

			for (int rating = 1; rating <= 10; rating++) {
				System.out.printf("%4d", responses[t][rating]);
				sumPoints += rating * responses[t][rating];
				countResponses += responses[t][rating];
			}

			topicTotals[t] = sumPoints;

			// b) average
			double average = (countResponses == 0) ? 0 : (double) sumPoints / countResponses;
			System.out.printf("   Avg: %.2f%n", average);
		}

		// c) highest point total
		int highestIndex = 0;
		for (int t = 1; t < topics.length; t++) {
			if (topicTotals[t] > topicTotals[highestIndex])
				highestIndex = t;
		}
		System.out.printf("%nHighest-rated issue: %s (Total points: %d)%n", topics[highestIndex], topicTotals[highestIndex]);

		// d) lowest point total
		int lowestIndex = 0;
		for (int t = 1; t < topics.length; t++) {
			if (topicTotals[t] < topicTotals[lowestIndex])
				lowestIndex = t;
		}
		System.out.printf("Lowest-rated issue: %s (Total points: %d)%n", topics[lowestIndex], topicTotals[lowestIndex]);

		input.close();
	}
}