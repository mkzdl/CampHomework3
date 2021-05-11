package campHomework3.gamer;

import campHomework3.members.Members;

public class Gamer extends Members{
	private int gameId;
	private String game;
	private int memberId;
	
	public Gamer() {
		
	}
	
	public Gamer(int gameId, String game, int memberId) {
		super();
		this.gameId = gameId;
		this.game = game;
		this.memberId = memberId;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
}
