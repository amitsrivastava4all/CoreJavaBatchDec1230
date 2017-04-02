package com.bmpl.games;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Player extends Sprite {
	private int gravity ;
	private int veleocity;
	private boolean isJump = false;
	public Player(){
		this.x = 100;
		this.y = GameConstants.FLOOR;
		this.width = this.height = 50;
		
		this.image = new ImageIcon(Player.class.getResource("mario.gif")).getImage();
	}
	
	public void jump(){
		if(!isJump){
			isJump = true;
		gravity = 1;
		veleocity = GameConstants.FORCE;
		this.y = this.y + this.veleocity;
		}
	}
	public void fall(){
		if(this.y<GameConstants.FLOOR){
			this.veleocity = this.veleocity + this.gravity;
			this.y = this.y + this.veleocity;
		}
		if(this.y>=GameConstants.FLOOR){
			isJump = false;
		}
	}
	
}
