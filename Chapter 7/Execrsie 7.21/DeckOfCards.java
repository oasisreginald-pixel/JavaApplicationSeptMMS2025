import java.security.SecureRandom;

public class DeckOfCards {
	private Card[] deck;
	private int currentCard;
	private static final int NUMBER_OF_CARDS = 52;
	private static SecureRandom randomNumbers = new SecureRandom();
	private static final String[] FACES = {
		"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven",
		"Eight", "Nine", "Ten", "Jack", "Queen", "King"
	};
	private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};

	public DeckOfCards() {
		deck = new Card[NUMBER_OF_CARDS];
		currentCard = 0;
		for (int count = 0; count < deck.length; count++)
			deck[count] = new Card(FACES[count % 13], SUITS[count / 13]);
	}

	// Fisher-Yates shuffle algorithm
	public void shuffle() {
		currentCard = 0;
		for (int i = deck.length - 1; i > 0; i--) {
			int j = randomNumbers.nextInt(i + 1);
			Card temp = deck[i];
			deck[i] = deck[j];
			deck[j] = temp;
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