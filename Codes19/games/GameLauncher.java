package com.bmpl.games;

import javax.swing.JFrame;

public class GameLauncher extends JFrame {
	Board board = new Board();
	public GameLauncher(){
		this.getContentPane().setLayout(null);
		this.getContentPane().add(board);
		setTitle("Game-2017");
		setSize(GameConstants.BOARD_WIDTH, GameConstants.BOARD_HEIGHT);
		setLocationRelativeTo(null);
		setResizable(false);
	}

	public static void main(String[] args) {
		GameLauncher gameLauncher = new GameLauncher();
		gameLauncher.setVisible(true);
		

	}

}
