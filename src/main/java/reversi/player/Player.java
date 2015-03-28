package main.java.reversi.player;

import main.java.reversi.board.Board;
import main.java.reversi.move.Move;

public abstract class Player {
	
	private final COLOR color;
	
	public Player(COLOR color) {
		this.color = color;
	}
	
	public final COLOR getColor(){
		return color;
	}
	
	public abstract Move makeMove(Board board);
	
	
	
	
	public static enum COLOR {
		WHITE,
		BLACK
	}
	
}
