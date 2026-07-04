public class TwoHandPoker {
	public static void main(String[] args) {
		DeckOfCards deck = new DeckOfCards();
		deck.shuffle();

		Card[] hand1 = deck.dealHand();
		Card[] hand2 = deck.dealHand();

		System.out.println("Player 1's hand:");
		for (Card card : hand1)
			System.out.println(card);

		System.out.println("\nPlayer 2's hand:");
		for (Card card : hand2)
			System.out.println(card);

		int rank1 = evaluateHand(deck, hand1);
		int rank2 = evaluateHand(deck, hand2);

		System.out.printf("%nPlayer 1's hand rank: %s%n", rankName(rank1));
		System.out.printf("Player 2's hand rank: %s%n", rankName(rank2));

		System.out.println();
		if (rank1 > rank2)
			System.out.println("Player 1 wins!");
		else if (rank2 > rank1)
			System.out.println("Player 2 wins!");
		else
			System.out.println("It's a tie!");
	}

	// higher number = stronger hand
	static int evaluateHand(DeckOfCards deck, Card[] hand) {
		if (deck.hasFourOfAKind(hand)) return 7;
		if (deck.hasFullHouse(hand)) return 6;
		if (deck.hasFlush(hand)) return 5;
		if (deck.hasStraight(hand)) return 4;
		if (deck.hasThreeOfAKind(hand)) return 3;
		if (deck.hasTwoPairs(hand)) return 2;
		if (deck.hasPair(hand)) return 1;
		return 0; // high card
	}

	static String rankName(int rank) {
		switch (rank) {
			case 7: return "Four of a Kind";
			case 6: return "Full House";
			case 5: return "Flush";
			case 4: return "Straight";
			case 3: return "Three of a Kind";
			case 2: return "Two Pairs";
			case 1: return "Pair";
			default: return "High Card";
		}
	}
}