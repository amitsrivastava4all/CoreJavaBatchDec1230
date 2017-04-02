package com.bmpl.games;

import static com.bmpl.games.GameConstants.BOARD_HEIGHT;
import static com.bmpl.games.GameConstants.BOARD_WIDTH;
import static com.bmpl.games.GameConstants.DELAY;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel {
	private Timer gameLoop;
	private Player player;
	private Enemy enemy;
	public Board(){
		setBackground(Color.CYAN);
		setBounds(0,0,BOARD_WIDTH, BOARD_HEIGHT);
		
		setFocusable(true);
		gameLoop = new Timer(DELAY,(e)->{
			repaint();  //it call paintCompoent
		});
		gameLoop.start();
		player = new Player();
		enemy = new Enemy();
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e){
			if(e.getKeyCode() == KeyEvent.VK_SPACE){
				player.jump();
				
			}
		}
		});
	}
	
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g); 
		Graphics2D twoD = (Graphics2D) g;  // Downcast
		drawBackGround(twoD);
		drawPlayer(twoD);
		drawEnemy(twoD);
		enemy.move();
		player.fall();
		Toolkit.getDefaultToolkit().sync();
		// it initalize the Graphics g object internally (Get the Handle)
		//g.drawString("Hello", 100, 100);
		//g.drawOval(x, y, width, height);
	}
	
	private void drawBackGround(Graphics2D g){
		Image backGround = new ImageIcon(Board.class.getResource("bg.gif")).getImage();
		g.drawImage(backGround,0,0,BOARD_WIDTH,BOARD_HEIGHT,null);
	}
	
	private void drawPlayer(Graphics2D g){
		g.drawImage(player.getImage(),player.getX(),player.getY(),player.getWidth(),player.getHeight(),null);
	}
	
	private void drawEnemy(Graphics2D g){
		g.drawImage(enemy.getImage(),enemy.getX(),enemy.getY(),enemy.getWidth(),enemy.getHeight(),null);
		
	}
}
