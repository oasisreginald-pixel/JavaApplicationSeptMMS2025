import java.security.SecureRandom;

public class DeckOfCards {
	private Card[] deck;
	private int currentCard;
	private static final int NUMBER_OF_CARDS = 52;
	private static SecureRandom randomNumbers = new SecureRandom();

	private static final Face[] FACES = Face.values();
	private static final Suit[] SUITS = Suit.values();

	public DeckOfCards() {
		deck = new Card[NUMBER_OF_CARDS];
		currentCard = 0;

		for (int count = 0; count < deck.length; count++)
			deck[count] = new Card(FACES[count % 13], SUITS[count / 13]);
	}

	public void shuffle() {
		currentCard = 0;

		for (int first = 0; first < deck.length; first++) {
			int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}
	}

	public Card dealCard() {
		if (currentCard < deck.length)
			return deck[currentCard++];
		else
			return null;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < deck.length; i++) {
			sb.append(String.format("%-19s", deck[i].toString()));
			if ((i + 1) % 4 == 0)
				sb.append("\n");
		}
		return sb.toString();
	}
}