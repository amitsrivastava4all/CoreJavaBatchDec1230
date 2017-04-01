package com.bmpl.chromegame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel {
	//JButton b = new JButton("Ok");
	private final int BOARD_WIDTH = 500;
	private final int BOARD_HEIGHT = 500;
	private final int SPACE_KEY = 32;
	private Player player;
	private Enemy firstEnemy;
	private Timer gameLoop;
	private final int FLOOR = BOARD_HEIGHT-190;
	Board(){
		//this.add(b);
		setBounds(0,0,BOARD_WIDTH,BOARD_HEIGHT);
		//setSize(500,500);
		
		setBackground(Color.BLACK);
		setFocusable(true);
		player = new Player(100,FLOOR);
		
		firstEnemy = new Enemy(BOARD_WIDTH, FLOOR);
		
		this.addKeyListener(new KeyAdapter() {
			@Override
			 public void keyPressed(KeyEvent e) {
				// System.out.println("Key Press " + e.getKeyCode()+  "   "+e.getKeyChar());
				if(e.getKeyCode() == SPACE_KEY){
					player.jump();
					System.out.println("Jump Call");
				}
			}
//			@Override
//			 public void keyTyped(KeyEvent e) {
//				System.out.println("Key Typed "+e.getKeyCode()+  "   "+e.getKeyChar());
//				
//			}
		});
		
		gameLoop = new Timer(50,(e)->{
			repaint();  // Call PaintComponent in every 100 ms
		});
		gameLoop.start();
	}
	private Image bgImage = new ImageIcon(Board.class.getResource("background.jpg")).getImage();
	private void drawBackGround(Graphics2D g){
		g.drawImage(bgImage,0,0,500,500,null);
	}
	
	private void drawPlayer(Graphics2D g){
		g.drawImage(player.getImage(),player.getX(),player.getY(),player.getWidth(),player.getHeight(),null);
	}
	
	private void drawEnemy(Graphics2D g){
		g.drawImage(firstEnemy.getImage(),firstEnemy.getX(),firstEnemy.getY(),firstEnemy.getWidth(),firstEnemy.getHeight(),null);
	}
	
	
	
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D twoD = (Graphics2D)g;
		drawBackGround(twoD);
		drawPlayer(twoD);
		drawEnemy(twoD);
		player.pullGravity();
		System.out.println("Paint Call");
		firstEnemy.move();
		Toolkit.getDefaultToolkit().sync();  //Smooth Paint
		if(checkCollision(player, firstEnemy)){
			gameLoop.stop();
			JOptionPane.showMessageDialog(this, "Game Over");
//			twoD.setColor(Color.RED);
//			twoD.setFont(new Font("Arial",Font.BOLD,32));
//			twoD.drawString("Game Over", HEIGHT/2, WIDTH/2);
			
		}
	}
	
	private boolean checkCollision(Player playerObject, Enemy enemyObject){
		
		return playerObject.getRectangle().intersects(enemyObject.getRectangle());
		
	}
	
}
