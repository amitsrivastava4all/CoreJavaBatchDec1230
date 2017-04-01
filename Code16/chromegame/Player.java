package com.bmpl.chromegame;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Player {
	private int x;
	private int y;
	private int width;
	private int height;
	private Image image;
	private int veleocity ;
	private int gravity;
	private boolean isJumpStart;
	public Player(int x, int y){
		this.x = x;
		this.y = y;
		this.width= this.height = 100;
		this.veleocity = 0;
		this.gravity = 1;
		//this.isJumpStart = false;
		this.image = new ImageIcon(Player.class.getResource("mariostill.png")).getImage();
	}
	
	
	
	
	public int getVeleocity() {
		return veleocity;
	}




	public void setVeleocity(int veleocity) {
		this.veleocity = veleocity;
	}




	public int getGravity() {
		return gravity;
	}




	public void setGravity(int gravity) {
		this.gravity = gravity;
	}




	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public int getY() {
		return y;
	}



	public void setY(int y) {
		this.y = y;
	}



	public int getWidth() {
		return width;
	}



	public void setWidth(int width) {
		this.width = width;
	}



	public int getHeight() {
		return height;
	}



	public void setHeight(int height) {
		this.height = height;
	}



	public Image getImage() {
		return image;
	}



	public void setImage(Image image) {
		this.image = image;
	}


	
	public void jump(){
		if(!isJumpStart){
		veleocity = -20;
		gravity = 1;
		this.y = 500-190;
		System.out.println("Now Jump is "+veleocity + " "+this.y);
		}
		isJumpStart = true;
	}
	
	
	public Rectangle getRectangle(){
		return new Rectangle(this.x, this.y, this.image.getWidth(null), this.image.getHeight(null));
	}
	
	
	public void pullGravity(){
		final int FLOOR = 500-190;
		if(this.y<=FLOOR){
		this.veleocity = this.veleocity + this.gravity;
		this.y = this.y + this.veleocity;
		isJumpStart = false;
		}
		
		
	}
	
	
	
	
	
	
}
