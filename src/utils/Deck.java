package utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private int[] cardValues = { 1, 2, 3, 4, 5, 6, 7, 10, 11, 12 };
	private String[] cardSuits = { "♥", "♦", "♣", "♠" };
	private List<Card> deck;
	private List<Card> board;

	public Deck() {
		this.deck = new ArrayList<Card>();
		this.board = new ArrayList<Card>();

		for (String suit : cardSuits) {
			for (int value : cardValues) {
				deck.add(new Card(value, suit));
			}
		}
		
		shuffle(deck);
	}

	public void shuffle(List<Card> deckToShuffle) {
		Collections.shuffle(deckToShuffle);
	}

	public synchronized List<Card> getStartingHand() {
		List<Card> startingHand = new ArrayList<Card>();

		for (int i = 0; i < 7; i++) {
			Card card = deck.get(i);
			startingHand.add(card);
		}

		deck.removeAll(startingHand);
		return startingHand;
	}

	public List<Card> getDeck() {
		return deck;
	}

	public synchronized Card withdrawCard() {
		Card cardToWithdraw = deck.get(0);
		deck.remove(cardToWithdraw);

		return cardToWithdraw;
	}

	public synchronized void putCard(Card cardToPut) {
		board.add(cardToPut);
	}
}
