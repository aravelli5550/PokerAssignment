package com.ea.pokergame.PokerAssignment.bean;

import com.ea.pokergame.PokerAssignment.enums.CardRankEnum;
import com.ea.pokergame.PokerAssignment.enums.CardSuitEnum;

public class Card {

	private CardSuitEnum suit;
	private CardRankEnum rank;
	
	
	
	public Card(CardSuitEnum suit, CardRankEnum rank) {
		super();
		this.suit = suit;
		this.rank = rank;
	}
	public CardSuitEnum getSuit() {
		return suit;
	}
	public void setSuit(CardSuitEnum suit) {
		this.suit = suit;
	}
	public CardRankEnum getRank() {
		return rank;
	}
	public void setRank(CardRankEnum rank) {
		this.rank = rank;
	}
	
	

	
	
	
}
