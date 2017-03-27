package com.bmpl.chromegame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Board extends JPanel {
	//JButton b = new JButton("Ok");
	Board(){
		//this.add(b);
		setBounds(0,0,500,500);
		setSize(500,500);
		
		setBackground(Color.BLACK);
	}
	private Image bgImage = new ImageIcon(Board.class.getResource("background.jpg")).getImage();
	private void drawBackGround(Graphics2D g){
		g.drawImage(bgImage,0,0,500,500,null);
	}
	
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D twoD = (Graphics2D)g;
		drawBackGround(twoD);
		System.out.println("Paint Call");
	}
}
