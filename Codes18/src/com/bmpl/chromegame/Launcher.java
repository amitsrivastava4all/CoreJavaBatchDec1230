package com.bmpl.chromegame;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Launcher extends JFrame {
	
	Launcher(){
		this.getContentPane().setLayout(null);
		Board board = new Board();
		this.getContentPane().add(board);
		this.setResizable(false);
		//this.add(board);
		//this.getContentPane().add(board,BorderLayout.CENTER);
		setSize(500,500);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Launcher launcher = new Launcher();
		

	}

}
