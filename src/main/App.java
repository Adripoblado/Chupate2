package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import utils.Deck;

public class App {
	
	public static void main(String[] args) throws IOException {
		List<Player> playerList = new ArrayList<Player>();
		Deck deck = new Deck();

		System.out.println("Introduce el número de jugadores (incluído el usuario): ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int players = enrollPlayers(br.readLine());
		while (players < 2 || players > 5) {
			System.err.println("El valor introducido no es válido, introduce un número entre 2 y 5:");
			players = enrollPlayers(br.readLine());
		}

		for (int i = 0; i < players; i++) {
			playerList.add(new Player(deck));
		}
		
		Game game = new Game(deck, playerList);
		game.run();
	}

	private static int enrollPlayers(String players) {
		int num = 0;
		try {
			num = Integer.parseInt(players);
		} catch (NumberFormatException e) {
			num = -1;
		}
		
		return num;
	}
}
