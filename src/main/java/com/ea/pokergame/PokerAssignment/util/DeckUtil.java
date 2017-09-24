package com.ea.pokergame.PokerAssignment.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import com.ea.pokergame.PokerAssignment.bean.Card;
import com.ea.pokergame.PokerAssignment.bean.Player;
import com.ea.pokergame.PokerAssignment.enums.CardRankEnum;
import com.ea.pokergame.PokerAssignment.enums.CardSuitEnum;

public class DeckUtil {

	public static List<Card> prepareDeck()
	{
		List<Card> cards = new ArrayList<Card>();
		for (CardSuitEnum suit : CardSuitEnum.values()) {
			for (CardRankEnum rank : CardRankEnum.values()) {
				Card card = new Card(suit,rank);
				cards.add(card);
			}
		}
		return cards;
	}
	
	public static List<Card> handle(List<Card> cards)
	{
		List<Card> hand = new ArrayList<Card>();
		Random rc = new Random();
		for ( int j = 0; j < 5; j++)
		  {
			hand.add(cards.remove(rc.nextInt(cards.size())));		 
		  }
	
		return hand;
	}
	
	public static List<Integer> orderedOridinalRankList(HashMap<String,Player> playerMap)
	{
		List<Integer> ordinalOrderredList = new ArrayList<Integer>();
		
		Player player1 = playerMap.get("p1");
		Player player2 = playerMap.get("p2");
		
		List<Card> cards1 = player1.getCards();
		List<Card> cards2 = player2.getCards();
		
		List<Card> mergeredSet = new ArrayList<Card>();
		mergeredSet.addAll(cards1);
		mergeredSet.addAll(cards2);
		
		for (int i = 0;i<mergeredSet.size();i++)
		{
			ordinalOrderredList.add(mergeredSet.get(i).getRank().ordinal());
			Collections.sort(ordinalOrderredList);
		}
	
		return ordinalOrderredList;
	}
	
	public static List<Integer> orderedOridinalList(HashMap<String,Player> playerMap)
	{
		List<Integer> ordinalOrderredList = new ArrayList<Integer>();
		
		Player player1 = playerMap.get("p1");
		Player player2 = playerMap.get("p2");
		
		List<Card> cards1 = player1.getCards();
		List<Card> cards2 = player2.getCards();
		
		List<Card> mergeredSet = new ArrayList<Card>();
		mergeredSet.addAll(cards1);
		mergeredSet.addAll(cards2);
		
		for (int i = 0;i<mergeredSet.size();i++)
		{
			ordinalOrderredList.add(mergeredSet.get(i).getSuit().ordinal());
			Collections.sort(ordinalOrderredList);
		}
	
		return ordinalOrderredList;
	}
	
	
}
