package com.bmpl.chromegame;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Enemy {
	
	private int x;
	private int y;
	private int width ;
	private int height;
	private Image image;
	private final int SPEED  = -3;
	public Enemy(int x, int y){
		this.x = x;
		this.y = y;
		this.width = this.height = 100;
		this.image = new ImageIcon(Enemy.class.getResource("en.png")).getImage();
	}
	
	public Rectangle getRectangle(){
		return new Rectangle(this.x, this.y, this.image.getWidth(null), this.image.getHeight(null));
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
	
	public void move(){
		this.x = this.x  + this.SPEED;
		
	}
	

}
