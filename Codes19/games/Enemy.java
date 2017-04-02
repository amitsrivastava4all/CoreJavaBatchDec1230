package com.bmpl.games;

import javax.swing.ImageIcon;

public class Enemy extends Sprite {
	private int speed = -4;
	public Enemy(){
		this.x = GameConstants.BOARD_WIDTH;
		this.y = GameConstants.FLOOR;
		this.width = this.height = 50;
		
		this.image = new ImageIcon(Player.class.getResource("en.png")).getImage();
	}
	public void move(){
		this.x = this.x + this.speed;
		if(this.x<=0){
			this.x = GameConstants.BOARD_WIDTH;
		}
	}
}
