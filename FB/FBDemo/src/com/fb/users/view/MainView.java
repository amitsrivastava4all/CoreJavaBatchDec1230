package com.fb.users.view;

import java.util.Scanner;

public class MainView {
	public void mainMenu(){
		while(true){
		System.out.println("1. Add User");
		System.out.println("2. Login User");
		System.out.println("3. Exit");
		Scanner scanner= new Scanner(System.in);
		int choice = scanner.nextInt();
		if(choice ==1){
			RegisterView rv = new RegisterView();
			rv.doRegister();
		}
		else
		if(choice == 2){	
			new LoginView().doLogin();
		}
		else
		if(choice ==3){	
			System.out.println("Thanks For Using...");
			System.exit(0);
		}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainView().mainMenu();
		

	}

}
