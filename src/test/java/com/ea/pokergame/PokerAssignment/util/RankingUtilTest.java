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
	public void testCheckRoyalFlush() {
		
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
		System.out.print(value);
		
		assertEquals(value, "ONE_PAIR");

		
		
		
	}

}
