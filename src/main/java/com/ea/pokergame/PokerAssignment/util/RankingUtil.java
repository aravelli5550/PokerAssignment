package com.ea.pokergame.PokerAssignment.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import com.ea.pokergame.PokerAssignment.bean.Card;
import com.ea.pokergame.PokerAssignment.bean.Player;
import com.ea.pokergame.PokerAssignment.enums.CardRankEnum;
import com.ea.pokergame.PokerAssignment.enums.RankingEnum;

public class RankingUtil {
	
public static String isRoyalFlush(HashMap<String,Player> playerMap)
	{
		Player player1 = playerMap.get("p1");
		Player player2 = playerMap.get("p2");
		String result = null;
		
		List<Card> cards1 = player1.getCards();
		List<Card> cards2 = player2.getCards();
		
		ArrayList<Integer> ordinals = new ArrayList<Integer>();
		int counter = 0;
		
		List<Card> mergeredSet = new ArrayList<Card>();
		mergeredSet.addAll(cards1);
		mergeredSet.addAll(cards2);
		
		List<Card> sequenceList = sequence(mergeredSet,5,true);

		if(sequenceList!=null)
		{
			for(Card card:sequenceList)
			{
				if(card.getRank().equals(CardRankEnum.CARD_10)||(card.getRank().equals(CardRankEnum.JACK)||card.getRank().equals(CardRankEnum.QUEEN)||card.getRank().equals(CardRankEnum.KING)
						||card.getRank().equals(CardRankEnum.ACE)))
				{
					counter ++;
				} else
				{
					counter --;
				}
			}
			if(counter == 5)
			{
				result = RankingEnum.ROYAL_FLUSH.toString();
				return result;
			}
		}
		
		
		
		return result;
	}
	
	public static String isStraightFlush(HashMap<String,Player> playerMap)
	{
		String result = null;
		Player player1 = playerMap.get("p1");
		Player player2 = playerMap.get("p2");
		
		List<Card> cards1 = player1.getCards();
		List<Card> cards2 = player2.getCards();
		
		ArrayList<Integer> ordinals = new ArrayList<Integer>();
		int counter = 0;
		
		List<Card> mergeredSet = new ArrayList<Card>();
		mergeredSet.addAll(cards1);
		mergeredSet.addAll(cards2);
		
		List<Card> sequenceList = sequence(mergeredSet,5,true);

		if(sequenceList!=null)
		{
			result = RankingEnum.STRAIGHT_FLUSH.toString();
			return result;
		}
		
		
		
		return result;
	}
	
	public static String isFullHouse(HashMap<String,Player> playerMap)
	{
		String result = null;
		List<Integer> ordinals = DeckUtil.orderedOridinalRankList(playerMap);
		int pairCount = 0;
		int count =0;
		
		HashMap<Integer,Integer> pairs = new HashMap<Integer,Integer>();
		
		
		for(int j = 0;j<ordinals.size();j++)
		{
			pairCount = Collections.frequency(ordinals, ordinals.get(j));
			pairs.put(ordinals.get(j), pairCount);
			
		}
		
			if(pairs.containsValue(3) && pairs.containsValue(2))
			{
				result = RankingEnum.FULL_HOUSE.toString();
				return result;
			}
		
	
		
		

		return result;
	}
	
	public static String isFourOfKind(HashMap<String,Player> playerMap)
	{
		String result = null;
		List<Integer> ordinals = DeckUtil.orderedOridinalRankList(playerMap);
		int pairCount = 0;
		HashMap<Integer,Integer> pairs = new HashMap<Integer,Integer>();
		
		
		for(int j = 0;j<ordinals.size();j++)
		{
			pairCount = Collections.frequency(ordinals, ordinals.get(j));
			pairs.put(ordinals.get(j), pairCount);
			
		}
		
		for (HashMap.Entry<Integer, Integer> entry : pairs.entrySet()) {
			if(entry.getValue() == 4)
			{
				result =  RankingEnum.FOUR_OF_A_KIND.toString();
				return result;
			}
		}

		return result;
	}
	
	public static String isThreeOfKind(HashMap<String,Player> playerMap)
	{
		String result = null;
		List<Integer> ordinals = DeckUtil.orderedOridinalRankList(playerMap);
		int pairCount = 0;
		HashMap<Integer,Integer> pairs = new HashMap<Integer,Integer>();
		
		
		for(int j = 0;j<ordinals.size();j++)
		{
			pairCount = Collections.frequency(ordinals, ordinals.get(j));
			pairs.put(ordinals.get(j), pairCount);
			
		}
		
		for (HashMap.Entry<Integer, Integer> entry : pairs.entrySet()) {
			if(entry.getValue() ==3)
			{
				result =  RankingEnum.THREE_OF_A_KIND.toString();
				return result;
			}
		}

		return result;
	}
	
	public static String isStraight(HashMap<String,Player> playerMap)
	{
		String result = null;
		Player player1 = playerMap.get("p1");
		Player player2 = playerMap.get("p2");
		
		List<Card> cards1 = player1.getCards();
		List<Card> cards2 = player2.getCards();
		
		ArrayList<Integer> ordinals = new ArrayList<Integer>();
		int counter = 0;
		
		List<Card> mergeredSet = new ArrayList<Card>();
		mergeredSet.addAll(cards1);
		mergeredSet.addAll(cards2);
		
		for (int i = 0;i<mergeredSet.size();i++)
		{
			ordinals.add(mergeredSet.get(i).getRank().ordinal());
			Collections.sort(ordinals);
		}
		
		for(int j = 1;j<ordinals.size();j++)
		{
			
			if(ordinals.get(j)-ordinals.get(j-1)==1||(ordinals.get(j)-ordinals.get(j-1)==1&&ordinals.get(ordinals.size()-1)-ordinals.get(0)==13))
				{
					counter++;
					if(counter>=4)
					{
						result = RankingEnum.STRAIGHT.toString();
						return result;
					}
				} else
				{
					counter = 0;
				}
		
		}
	
		return result;
	}
	
	public static String isFlush(HashMap<String,Player> playerMap)
	{
		String result = null;
		Player player1 = playerMap.get("p1");
		Player player2 = playerMap.get("p2");
		
		List<Card> cards1 = player1.getCards();
		List<Card> cards2 = player2.getCards();
		
		ArrayList<Integer> ordinals = new ArrayList<Integer>();
		int counter = 0;
		
		List<Card> mergeredSet = new ArrayList<Card>();
		mergeredSet.addAll(cards1);
		mergeredSet.addAll(cards2);
		
		for (int i = 0;i<mergeredSet.size();i++)
		{
			ordinals.add(mergeredSet.get(i).getSuit().ordinal());
			Collections.sort(ordinals);
		}
		
		for(int j = 1;j<ordinals.size();j++)
		{
			
			if(ordinals.get(j-1)-ordinals.get(j)==0)
				{
					counter++;
					if(counter>=4)
					{
						result = RankingEnum.FLUSH.toString();
						return result;
					}
				} else{
					counter = 0;
				}
		
		}
			
		return result;
	}
	
	public static String isTwoPair(HashMap<String,Player> playerMap)
	{
		
		String result = null;
		List<Integer> ordinals = DeckUtil.orderedOridinalRankList(playerMap);
		int pairCount = 0;
		int Counter = 0;
		HashMap<Integer,Integer> pairs = new HashMap<Integer,Integer>();
		
		
		for(int j = 0;j<ordinals.size();j++)
		{
			pairCount = Collections.frequency(ordinals, ordinals.get(j));
			pairs.put(ordinals.get(j), pairCount);
			
		}
		
		for (HashMap.Entry<Integer, Integer> entry : pairs.entrySet()) {
			if(entry.getValue() == 2)
			{
				Counter ++;
			}
		}
		
		if(Counter>=2)
		{
			result =  RankingEnum.TWO_PAIR.toString();
			return result;
		}
		return result;
		
	}
	
	public static String isOnePair(HashMap<String,Player> playerMap)
	{
		

		String result = null;
		List<Integer> ordinals = DeckUtil.orderedOridinalRankList(playerMap);
		int pairCount = 0;
		int Counter = 0;
		HashMap<Integer,Integer> pairs = new HashMap<Integer,Integer>();
		
		
		for(int j = 0;j<ordinals.size();j++)
		{
			pairCount = Collections.frequency(ordinals, ordinals.get(j));
			pairs.put(ordinals.get(j), pairCount);
			
		}
		
		for (HashMap.Entry<Integer, Integer> entry : pairs.entrySet()) {
			if(entry.getValue() == 2)
			{
				Counter++ ;
			}
		}
		
		if(Counter==1)
		{
			result =  RankingEnum.ONE_PAIR.toString();
			return result;
		}
		return result;
	}
	
	public static List<Card> sequence(List<Card> mergedSet,Integer sequenceSize, Boolean compareSuit)
	{
		List<Card> sequenceList = new ArrayList<Card>();
		List<Card> orderedList = sequenceMerge(mergedSet);
		Card cardPrevious = null;
		
		for (Card card : orderedList) {
			if (cardPrevious != null) {
				if ((card.getRank().ordinal() - cardPrevious.getRank().ordinal()) == 1) {
					if (!compareSuit
							|| cardPrevious.getSuit().equals(card.getSuit())) {
						if (sequenceList.size() == 0) {
							sequenceList.add(cardPrevious);
						}
						sequenceList.add(card);
					}
				} else {
					if (sequenceList.size() == sequenceSize) {
						return sequenceList;
					}
					sequenceList.clear();
				}
			}
			cardPrevious = card;
		}
		
		
		return (sequenceList.size() == sequenceSize) ? sequenceList : null;
	}
	
	public static List<Card> sequenceMerge(List<Card> mergedSet)
	{
		List<Card> cards =  mergedSet;
		
		Collections.sort(cards, new Comparator<Card>() {

			public int compare(Card c1, Card c2) {
				return c1.getRank().ordinal() < c2.getRank().ordinal() ? -1 : 1;
			}

		});
		
		return cards;
	}

}
