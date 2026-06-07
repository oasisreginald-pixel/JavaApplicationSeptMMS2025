import java.util.Scanner;

public class GlobalWarmingQuiz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int correct = 0;

		String[] questions = {
			"1. What gas is most associated with human-caused greenhouse warming?\n" +
			"   1) Oxygen  2) Carbon dioxide  3) Nitrogen  4) Hydrogen",

			"2. Which agreement(s) aimed to reduce greenhouse gas emissions?\n" +
			"   1) Geneva Convention  2) Kyoto Protocol  3) Paris Agreement  4) Both 2 and 3",

			"3. Some skeptics argue warming is primarily caused by:\n" +
			"   1) Human industry  2) Natural climate cycles  3) Volcanic activity  4) Ocean currents",

			"4. What % of scientists in a 2013 study agreed humans cause climate change?\n" +
			"   1) 50%  2) 75%  3) 97%  4) 100%",

			"5. Which is a commonly cited effect of global warming?\n" +
			"   1) Rising sea levels  2) Cooler summers  3) More snowfall  4) Fewer hurricanes"
		};

		int[] answers = {2, 4, 2, 3, 1};

		System.out.println("=== Global Warming Facts Quiz ===\n");

		for (int i = 0; i < questions.length; i++) {
			System.out.println(questions[i]);
			System.out.print("Your answer: ");
			int userAnswer = input.nextInt();
			if (userAnswer == answers[i])
				correct++;
			System.out.println();
		}

		System.out.printf("You got %d out of 5 correct.%n", correct);

		if (correct == 5)
			System.out.println("Excellent!");
		else if (correct == 4)
			System.out.println("Very good!");
		else {
			System.out.println("Time to brush up on your knowledge of global warming.");
			System.out.println("\nUseful resources:");
			System.out.println("- https://climate.nasa.gov");
			System.out.println("- https://www.ipcc.ch");
			System.out.println("- https://www.skepticalscience.com");
		}
	}
}