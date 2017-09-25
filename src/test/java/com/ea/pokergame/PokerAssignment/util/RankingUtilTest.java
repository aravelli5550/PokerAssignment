package com.ea.pokergame.PokerAssignment.util;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

import com.ea.pokergame.PokerAssignment.bean.Card;
import com.ea.pokergame.PokerAssignment.bean.Player;
import com.ea.pokergame.PokerAssignment.enums.CardRankEnum;
import com.ea.pokergame.PokerAssignment.enums.CardSuitEnum;

public class RankingUtilTest {
	
	@Test
	public void testCheckOnePair() {
		
		List<Card> cardset1 = new ArrayList<Card>();
		List<Card> cardset2 = new ArrayList<Card>();

		Card c1 = new Card(CardSuitEnum.CLUBS,CardRankEnum.ACE);
		Card c2 = new Card(CardSuitEnum.CLUBS,CardRankEnum.CARD_10);
		Card c3 = new Card(CardSuitEnum.DIAMONDS,CardRankEnum.CARD_2);
		Card c4 = new Card(CardSuitEnum.CLUBS,CardRankEnum.JACK);
		Card c5 = new Card(CardSuitEnum.CLUBS,CardRankEnum.CARD_9);
		Card c6 = new Card(CardSuitEnum.CLUBS,CardRankEnum.CARD_2);
		Card c7 = new Card(CardSuitEnum.DIAMONDS,CardRankEnum.CARD_7);
		Card c8 = new Card(CardSuitEnum.HEARTS,CardRankEnum.KING);
		Card c9 = new Card(CardSuitEnum.SPADES,CardRankEnum.CARD_4);
		Card c10 = new Card(CardSuitEnum.DIAMONDS,CardRankEnum.CARD_3);
		
		cardset1.add(c1);
		cardset1.add(c2);
		cardset1.add(c3);
		cardset1.add(c4);
		cardset1.add(c5);
		cardset2.add(c6);
		cardset2.add(c7);
		cardset2.add(c8);
		cardset2.add(c9);
		cardset2.add(c10);
		
		Player p1 = new Player(cardset1);
		Player p2 = new Player(cardset2);
		
		HashMap<String,Player> playerMap = new HashMap<String,Player>();
		playerMap.put("p1", p1);
		playerMap.put("p2", p2);
		String value = RankingUtil.isOnePair(playerMap);
		
		assertEquals(value, "ONE_PAIR");

		
		
		
	}
	
	@Test
	public void testCheckTwoPair() {
		
		List<Card> cardset1 = new ArrayList<Card>();
		List<Card> cardset2 = new ArrayList<Card>();

		Card c1 = new Card(CardSuitEnum.CLUBS,CardRankEnum.ACE);
		Card c2 = new Card(CardSuitEnum.CLUBS,CardRankEnum.CARD_10);
		Card c3 = new Card(CardSuitEnum.DIAMONDS,CardRankEnum.CARD_2);
		Card c4 = new Card(CardSuitEnum.CLUBS,CardRankEnum.JACK);
		Card c5 = new Card(CardSuitEnum.CLUBS,CardRankEnum.KING);
		Card c6 = new Card(CardSuitEnum.CLUBS,CardRankEnum.CARD_2);
		Card c7 = new Card(CardSuitEnum.DIAMONDS,CardRankEnum.CARD_7);
		Card c8 = new Card(CardSuitEnum.HEARTS,CardRankEnum.KING);
		Card c9 = new Card(CardSuitEnum.SPADES,CardRankEnum.CARD_4);
		Card c10 = new Card(CardSuitEnum.DIAMONDS,CardRankEnum.CARD_3);
		
		cardset1.add(c1);
		cardset1.add(c2);
		cardset1.add(c3);
		cardset1.add(c4);
		cardset1.add(c5);
		cardset2.add(c6);
		cardset2.add(c7);
		cardset2.add(c8);
		cardset2.add(c9);
		cardset2.add(c10);
		
		Player p1 = new Player(cardset1);
		Player p2 = new Player(cardset2);
		
		HashMap<String,Player> playerMap = new HashMap<String,Player>();
		playerMap.put("p1", p1);
		playerMap.put("p2", p2);
		String value = RankingUtil.isTwoPair(playerMap);
		
		assertEquals(value, "TWO_PAIR");

		
		
		
	}
	
	@Test
	public void testCheckThreeOfKind() {
		
		List<Card> cardset1 = new ArrayList<Card>();
		List<Card> cardset2 = new ArrayList<Card>();

		Card c1 = new Card(CardSuitEnum.CLUBS,CardRankEnum.ACE);
		Card c2 = new Card(CardSuitEnum.CLUBS,CardRankEnum.CARD_10);
		Card c3 = new Card(CardSuitEnum.DIAMONDS,CardRankEnum.CARD_3);
		Card c4 = new Card(CardSuitEnum.CLUBS,CardRankEnum.JACK);
		Card c5 = new Card(CardSuitEnum.CLUBS,CardRankEnum.KING);
		Card c6 = new Card(CardSuitEnum.CLUBS,CardRankEnum.CARD_2);
		Card c7 = new Card(CardSuitEnum.DIAMONDS,CardRankEnum.CARD_7);
		Card c8 = new Card(CardSuitEnum.HEARTS,CardRankEnum.KING);
		Card c9 = new Card(CardSuitEnum.SPADES,CardRankEnum.CARD_4);
		Card c10 = new Card(CardSuitEnum.DIAMONDS,CardRankEnum.KING);
		
		cardset1.add(c1);
		cardset1.add(c2);
		cardset1.add(c3);
		cardset1.add(c4);
		cardset1.add(c5);
		cardset2.add(c6);
		cardset2.add(c7);
		cardset2.add(c8);
		cardset2.add(c9);
		cardset2.add(c10);
		
		Player p1 = new Player(cardset1);
		Player p2 = new Player(cardset2);
		
		HashMap<String,Player> playerMap = new HashMap<String,Player>();
		playerMap.put("p1", p1);
		playerMap.put("p2", p2);
		String value = RankingUtil.isThreeOfKind(playerMap);
		
		assertEquals(value, "THREE_OF_A_KIND");

		
		
		
	}
	
	@Test
	public void testCheckFullHouse() {
		
		List<Card> cardset1 = new ArrayList<Card>();
		List<Card> cardset2 = new ArrayList<Card>();

		Card c1 = new Card(CardSuitEnum.CLUBS,CardRankEnum.ACE);
		Card c2 = new Card(CardSuitEnum.CLUBS,CardRankEnum.CARD_10);
		Card c3 = new Card(CardSuitEnum.DIAMONDS,CardRankEnum.CARD_2);
		Card c4 = new Card(CardSuitEnum.CLUBS,CardRankEnum.JACK);
		Card c5 = new Card(CardSuitEnum.CLUBS,CardRankEnum.KING);
		Card c6 = new Card(CardSuitEnum.CLUBS,CardRankEnum.CARD_2);
		Card c7 = new Card(CardSuitEnum.DIAMONDS,CardRankEnum.CARD_7);
		Card c8 = new Card(CardSuitEnum.HEARTS,CardRankEnum.KING);
		Card c9 = new Card(CardSuitEnum.SPADES,CardRankEnum.CARD_4);
		Card c10 = new Card(CardSuitEnum.DIAMONDS,CardRankEnum.KING);
		
		cardset1.add(c1);
		cardset1.add(c2);
		cardset1.add(c3);
		cardset1.add(c4);
		cardset1.add(c5);
		cardset2.add(c6);
		cardset2.add(c7);
		cardset2.add(c8);
		cardset2.add(c9);
		cardset2.add(c10);
		
		Player p1 = new Player(cardset1);
		Player p2 = new Player(cardset2);
		
		HashMap<String,Player> playerMap = new HashMap<String,Player>();
		playerMap.put("p1", p1);
		playerMap.put("p2", p2);
		String value = RankingUtil.isFullHouse(playerMap);
		
		assertEquals(value, "FULL_HOUSE");

		
		
		
	}
	
	@Test
	public void testCheckFlush() {
		
		List<Card> cardset1 = new ArrayList<Card>();
		List<Card> cardset2 = new ArrayList<Card>();

		Card c1 = new Card(CardSuitEnum.CLUBS,CardRankEnum.ACE);
		Card c2 = new Card(CardSuitEnum.CLUBS,CardRankEnum.CARD_2);
		Card c3 = new Card(CardSuitEnum.DIAMONDS,CardRankEnum.CARD_2);
		Card c4 = new Card(CardSuitEnum.CLUBS,CardRankEnum.JACK);
		Card c5 = new Card(CardSuitEnum.CLUBS,CardRankEnum.KING);
		Card c6 = new Card(CardSuitEnum.CLUBS,CardRankEnum.CARD_2);
		Card c7 = new Card(CardSuitEnum.DIAMONDS,CardRankEnum.CARD_7);
		Card c8 = new Card(CardSuitEnum.HEARTS,CardRankEnum.KING);
		Card c9 = new Card(CardSuitEnum.SPADES,CardRankEnum.CARD_4);
		Card c10 = new Card(CardSuitEnum.DIAMONDS,CardRankEnum.KING);
		
		cardset1.add(c1);
		cardset1.add(c2);
		cardset1.add(c3);
		cardset1.add(c4);
		cardset1.add(c5);
		cardset2.add(c6);
		cardset2.add(c7);
		cardset2.add(c8);
		cardset2.add(c9);
		cardset2.add(c10);
		
		Player p1 = new Player(cardset1);
		Player p2 = new Player(cardset2);
		
		HashMap<String,Player> playerMap = new HashMap<String,Player>();
		playerMap.put("p1", p1);
		playerMap.put("p2", p2);
		String value = RankingUtil.isFlush(playerMap);
		
		assertEquals(value, "FLUSH");

		
		
		
	}
	
	@Test
	public void testCheckStraight() {
		
		List<Card> cardset1 = new ArrayList<Card>();
		List<Card> cardset2 = new ArrayList<Card>();

		Card c1 = new Card(CardSuitEnum.CLUBS,CardRankEnum.ACE);
		Card c2 = new Card(CardSuitEnum.HEARTS,CardRankEnum.CARD_2);
		Card c3 = new Card(CardSuitEnum.DIAMONDS,CardRankEnum.CARD_3);
		Card c4 = new Card(CardSuitEnum.HEARTS,CardRankEnum.CARD_7);
		Card c5 = new Card(CardSuitEnum.CLUBS,CardRankEnum.CARD_6);
		Card c6 = new Card(CardSuitEnum.CLUBS,CardRankEnum.CARD_2);
		Card c7 = new Card(CardSuitEnum.DIAMONDS,CardRankEnum.CARD_5);
		Card c8 = new Card(CardSuitEnum.HEARTS,CardRankEnum.KING);
		Card c9 = new Card(CardSuitEnum.SPADES,CardRankEnum.CARD_4);
		Card c10 = new Card(CardSuitEnum.DIAMONDS,CardRankEnum.KING);
		
		cardset1.add(c1);
		cardset1.add(c2);
		cardset1.add(c3);
		cardset1.add(c4);
		cardset1.add(c5);
		cardset2.add(c6);
		cardset2.add(c7);
		cardset2.add(c8);
		cardset2.add(c9);
		cardset2.add(c10);
		
		Player p1 = new Player(cardset1);
		Player p2 = new Player(cardset2);
		
		HashMap<String,Player> playerMap = new HashMap<String,Player>();
		playerMap.put("p1", p1);
		playerMap.put("p2", p2);
		String value = RankingUtil.isStraight(playerMap);
		
		assertEquals(value, "STRAIGHT");

		
		
		
	}
	
	@Test
	public void testCheckFourOfKind() {
		
		List<Card> cardset1 = new ArrayList<Card>();
		List<Card> cardset2 = new ArrayList<Card>();

		Card c1 = new Card(CardSuitEnum.CLUBS,CardRankEnum.ACE);
		Card c2 = new Card(CardSuitEnum.HEARTS,CardRankEnum.CARD_2);
		Card c3 = new Card(CardSuitEnum.DIAMONDS,CardRankEnum.CARD_2);
		Card c4 = new Card(CardSuitEnum.HEARTS,CardRankEnum.CARD_2);
		Card c5 = new Card(CardSuitEnum.CLUBS,CardRankEnum.CARD_6);
		Card c6 = new Card(CardSuitEnum.CLUBS,CardRankEnum.CARD_2);
		Card c7 = new Card(CardSuitEnum.DIAMONDS,CardRankEnum.CARD_5);
		Card c8 = new Card(CardSuitEnum.HEARTS,CardRankEnum.KING);
		Card c9 = new Card(CardSuitEnum.SPADES,CardRankEnum.CARD_4);
		Card c10 = new Card(CardSuitEnum.DIAMONDS,CardRankEnum.KING);
		
		cardset1.add(c1);
		cardset1.add(c2);
		cardset1.add(c3);
		cardset1.add(c4);
		cardset1.add(c5);
		cardset2.add(c6);
		cardset2.add(c7);
		cardset2.add(c8);
		cardset2.add(c9);
		cardset2.add(c10);
		
		Player p1 = new Player(cardset1);
		Player p2 = new Player(cardset2);
		
		HashMap<String,Player> playerMap = new HashMap<String,Player>();
		playerMap.put("p1", p1);
		playerMap.put("p2", p2);
		String value = RankingUtil.isFourOfKind(playerMap);
		
		assertEquals(value, "FOUR_OF_A_KIND");

		
		
		
	}
	
	@Test
	public void testCheckStraightFlush() {
		
		List<Card> cardset1 = new ArrayList<Card>();
		List<Card> cardset2 = new ArrayList<Card>();

		Card c1 = new Card(CardSuitEnum.CLUBS,CardRankEnum.ACE);
		Card c2 = new Card(CardSuitEnum.HEARTS,CardRankEnum.CARD_2);
		Card c3 = new Card(CardSuitEnum.HEARTS,CardRankEnum.CARD_3);
		Card c4 = new Card(CardSuitEnum.HEARTS,CardRankEnum.CARD_7);
		Card c5 = new Card(CardSuitEnum.HEARTS,CardRankEnum.CARD_6);
		Card c6 = new Card(CardSuitEnum.CLUBS,CardRankEnum.CARD_2);
		Card c7 = new Card(CardSuitEnum.HEARTS,CardRankEnum.CARD_5);
		Card c8 = new Card(CardSuitEnum.CLUBS,CardRankEnum.KING);
		Card c9 = new Card(CardSuitEnum.HEARTS,CardRankEnum.CARD_4);
		Card c10 = new Card(CardSuitEnum.DIAMONDS,CardRankEnum.KING);
		
		cardset1.add(c1);
		cardset1.add(c2);
		cardset1.add(c3);
		cardset1.add(c4);
		cardset1.add(c5);
		cardset2.add(c6);
		cardset2.add(c7);
		cardset2.add(c8);
		cardset2.add(c9);
		cardset2.add(c10);
		
		Player p1 = new Player(cardset1);
		Player p2 = new Player(cardset2);
		
		HashMap<String,Player> playerMap = new HashMap<String,Player>();
		playerMap.put("p1", p1);
		playerMap.put("p2", p2);
		String value = RankingUtil.isStraightFlush(playerMap);
		
		assertEquals(value, "STRAIGHT_FLUSH");

		
		
		
	}
	
	@Test
	public void testCheckRoyalFlush() {
		
		List<Card> cardset1 = new ArrayList<Card>();
		List<Card> cardset2 = new ArrayList<Card>();

		Card c1 = new Card(CardSuitEnum.CLUBS,CardRankEnum.CARD_5);
		Card c2 = new Card(CardSuitEnum.HEARTS,CardRankEnum.ACE);
		Card c3 = new Card(CardSuitEnum.HEARTS,CardRankEnum.KING);
		Card c4 = new Card(CardSuitEnum.HEARTS,CardRankEnum.QUEEN);
		Card c5 = new Card(CardSuitEnum.HEARTS,CardRankEnum.CARD_10);
		Card c6 = new Card(CardSuitEnum.HEARTS,CardRankEnum.JACK);
		Card c7 = new Card(CardSuitEnum.HEARTS,CardRankEnum.CARD_5);
		Card c8 = new Card(CardSuitEnum.CLUBS,CardRankEnum.CARD_2);
		Card c9 = new Card(CardSuitEnum.HEARTS,CardRankEnum.CARD_4);
		Card c10 = new Card(CardSuitEnum.DIAMONDS,CardRankEnum.CARD_2);
		
		cardset1.add(c1);
		cardset1.add(c2);
		cardset1.add(c3);
		cardset1.add(c4);
		cardset1.add(c5);
		cardset2.add(c6);
		cardset2.add(c7);
		cardset2.add(c8);
		cardset2.add(c9);
		cardset2.add(c10);
		
		Player p1 = new Player(cardset1);
		Player p2 = new Player(cardset2);
		
		HashMap<String,Player> playerMap = new HashMap<String,Player>();
		playerMap.put("p1", p1);
		playerMap.put("p2", p2);
		String value = RankingUtil.isRoyalFlush(playerMap);
		
		assertEquals(value, "ROYAL_FLUSH");

		
		
		
	}

}
