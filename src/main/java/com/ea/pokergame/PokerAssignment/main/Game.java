package com.ea.pokergame.PokerAssignment.main;

import java.util.HashMap;

import com.ea.pokergame.PokerAssignment.bean.Player;
import com.ea.pokergame.PokerAssignment.enums.RankingEnum;
import com.ea.pokergame.PokerAssignment.util.DeckUtil;
import com.ea.pokergame.PokerAssignment.util.RankingUtil;

public class Game {
	
	public static void main(String[] args)
	{
		Player p1 = new Player(DeckUtil.handle(DeckUtil.prepareDeck()));
		Player p2 = new Player(DeckUtil.handle(DeckUtil.prepareDeck()));
		
		HashMap<String,Player> playerMap = new HashMap<String,Player>();
		playerMap.put("p1", p1);
		playerMap.put("p2", p2);
		
		String RankValue = checkRank(playerMap);
		
		System.out.println(RankValue);

			
	}
	
	public static String checkRank(HashMap<String,Player> playerMap)
	
	{
		String rank = RankingEnum.HIGH_CARD.toString();
		
		String royalFlush = RankingUtil.isRoyalFlush(playerMap);
		if(royalFlush!=null)
		{
			rank = RankingEnum.ROYAL_FLUSH.toString();
			return rank;
		}
		
		String straightFlush = RankingUtil.isStraightFlush(playerMap);
		if(straightFlush!=null)
		{
			rank = RankingEnum.STRAIGHT_FLUSH.toString();
			return rank;
		}
		
		String fourOfKind = RankingUtil.isFourOfKind(playerMap);
		if(fourOfKind!=null)
		{
			rank = RankingEnum.FOUR_OF_A_KIND.toString();
			return rank;
		}
		
		String fullHouse = RankingUtil.isFullHouse(playerMap);
		if(fullHouse!=null)
		{
			rank = RankingEnum.FULL_HOUSE.toString();
			return rank;
		}
		
		String flush = RankingUtil.isFlush(playerMap);
		if(flush!=null)
		{
			rank = RankingEnum.FLUSH.toString();
			return rank;
		}
		
		String straight = RankingUtil.isStraight(playerMap);
		if(straight!=null)
		{
			rank = RankingEnum.STRAIGHT.toString();
			return rank;
		}
		
		String threeOfKind = RankingUtil.isThreeOfKind(playerMap);
		if(threeOfKind!=null)
		{
			rank = RankingEnum.THREE_OF_A_KIND.toString();
			return rank;
		}
		
		String twoPair = RankingUtil.isTwoPair(playerMap);
		if(twoPair!=null)
		{
			rank = RankingEnum.TWO_PAIR.toString();
			return rank;
		}
		
		String onePair = RankingUtil.isOnePair(playerMap);
		if(onePair!=null)
		{
			rank = RankingEnum.ONE_PAIR.toString();
			return rank;
		}

		return rank;
	}

}
