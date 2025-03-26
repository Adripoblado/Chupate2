package main;

import java.util.List;

import utils.Card;
import utils.Deck;

public class Player {

	List<Card> hand;
	Deck deck;

	public Player(Deck deck) {
		this.deck = deck;
		this.hand = deck.getStartingHand();
	}

	public void putCard(Card cardToRemove) {
		this.hand.remove(cardToRemove);
		deck.putCard(cardToRemove);
	}

	public void withdrawCard() {
		this.hand.add(deck.withdrawCard());
	}
}
