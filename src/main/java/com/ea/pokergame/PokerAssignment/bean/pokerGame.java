package com.ea.pokergame.PokerAssignment.bean;

import java.util.List;

import com.ea.pokergame.PokerAssignment.enums.RankingEnum;

public class pokerGame {
    private List<Player> players;
    private String winner;
	private RankingEnum rankingEnum = null;
	public List<Player> getPlayers() {
		return players;
	}
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	public String getWinner() {
		return winner;
	}
	public void setWinner(String winner) {
		this.winner = winner;
	}
	public RankingEnum getRankingEnum() {
		return rankingEnum;
	}
	public void setRankingEnum(RankingEnum rankingEnum) {
		this.rankingEnum = rankingEnum;
	}
	
	
	
 
	
}
