package com.ea.pokergame.PokerAssignment.bean;

import java.util.List;

public class Player {
	
	private List<Card> cards;

	
	
	public Player(List<Card> cards) {
		super();
		this.cards = cards;
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	
	
	

}
