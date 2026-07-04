public class DealerSimulation {
	public static void main(String[] args) {
		DeckOfCards deck = new DeckOfCards();
		deck.shuffle();

		Card[] dealerHand = deck.dealHand();

		System.out.println("Dealer's hand is dealt face down.");

		int initialRank = evaluateHand(deck, dealerHand);
		System.out.printf("(Hidden) Dealer's initial hand rank: %s%n", rankName(initialRank));

		int cardsToReplace = decideCardsToReplace(initialRank);
		System.out.printf("Dealer decides to replace %d card(s).%n", cardsToReplace);

		dealerHand = replaceWeakestCards(deck, dealerHand, cardsToReplace);

		int finalRank = evaluateHand(deck, dealerHand);

		System.out.println("\nDealer's final hand (now revealed):");
		for (Card card : dealerHand)
			System.out.println(card);

		System.out.printf("%nDealer's final hand rank: %s%n", rankName(finalRank));
	}

	// dealer's strategy: weak hands -> replace more cards
	static int decideCardsToReplace(int rank) {
		if (rank >= 4)       // straight or better
			return 0;
		else if (rank >= 2)  // two pairs or three of a kind
			return 1;
		else if (rank == 1)  // a single pair
			return 2;
		else                 // nothing
			return 3;
	}

	// simplistic strategy: replace the last N cards in the hand array
	// (a more advanced version would identify and keep only paired/matching cards)
	static Card[] replaceWeakestCards(DeckOfCards deck, Card[] hand, int numToReplace) {
		for (int i = hand.length - numToReplace; i < hand.length; i++)
			hand[i] = deck.dealCard();
		return hand;
	}

	static int evaluateHand(DeckOfCards deck, Card[] hand) {
		if (deck.hasFourOfAKind(hand)) return 7;
		if (deck.hasFullHouse(hand)) return 6;
		if (deck.hasFlush(hand)) return 5;
		if (deck.hasStraight(hand)) return 4;
		if (deck.hasThreeOfAKind(hand)) return 3;
		if (deck.hasTwoPairs(hand)) return 2;
		if (deck.hasPair(hand)) return 1;
		return 0;
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