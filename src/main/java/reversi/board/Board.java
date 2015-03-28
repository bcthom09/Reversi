package main.java.reversi.board;

import main.java.reversi.player.Player.COLOR;

public class Board {
	
	private final COLOR[][] board;
	
	public Board(){
		this.board = new COLOR[8][8];
		
		board[4][3] = board[4][3] = COLOR.WHITE;
		board[3][3] = board[4][4] = COLOR.BLACK;
	}
	
	

}
