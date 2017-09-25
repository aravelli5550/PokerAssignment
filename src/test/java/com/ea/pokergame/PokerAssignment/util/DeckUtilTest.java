package com.ea.pokergame.PokerAssignment.util;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.ea.pokergame.PokerAssignment.bean.Card;


public class DeckUtilTest {
	
	@Test
	public void testDeck() {
		
		List<Card> cards = DeckUtil.prepareDeck();
		assertEquals(cards.size(), 52);
		
	}
	
	@Test
	public void testhand() {
		
		List<Card> cards = DeckUtil.prepareDeck();
		List<Card> handCards = DeckUtil.handle(cards);
		assertEquals(handCards.size(), 5);
		
	}

}
