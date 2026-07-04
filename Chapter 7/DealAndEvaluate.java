public class DealAndEvaluate {
	public static void main(String[] args) {
		DeckOfCards deck = new DeckOfCards();
		deck.shuffle();

		Card[] hand = deck.dealHand();

		System.out.println("Hand dealt:");
		for (Card card : hand)
			System.out.println(card);

		System.out.println();
		System.out.printf("Pair: %b%n", deck.hasPair(hand));
		System.out.printf("Two Pairs: %b%n", deck.hasTwoPairs(hand));
		System.out.printf("Three of a Kind: %b%n", deck.hasThreeOfAKind(hand));
		System.out.printf("Four of a Kind: %b%n", deck.hasFourOfAKind(hand));
		System.out.printf("Flush: %b%n", deck.hasFlush(hand));
		System.out.printf("Straight: %b%n", deck.hasStraight(hand));
		System.out.printf("Full House: %b%n", deck.hasFullHouse(hand));
	}
}