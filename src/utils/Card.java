package utils;

public class Card {

	String suit;
	int value;
	
	public Card(int value, String suit) {
		this.value = value;
		this.suit = suit;
	}
	
	public String getSuit() {
		return this.suit;
	}
	
	public int getValue() {
		return this.value;
	}
}
