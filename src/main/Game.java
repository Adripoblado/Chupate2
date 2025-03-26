package main;

import java.util.List;

import utils.Deck;

public class Game extends Thread {

	List<Player> playerList;
	Deck deck;
	
	public Game(Deck deck, List<Player> playerList) {
		this.deck = deck;
		this.playerList = playerList;
	}
	
	@Override
	public void run() {
	}
}
