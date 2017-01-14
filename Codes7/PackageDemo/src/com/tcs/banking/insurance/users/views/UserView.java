package com.tcs.banking.insurance.users.views;

import java.util.Scanner;

import com.tcs.banking.insurance.users.dto.UserDTO;
import com.tcs.banking.insurance.users.helper.UserHelper;

public class UserView {
	public void doLogin(){
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Userid");
		String userid = scanner.nextLine();
		System.out.println("Enter the Password");
		String password = scanner.nextLine();
		UserDTO userDTO = new UserDTO();
		userDTO.setUserid(userid);
		userDTO.setPassword(password);
		UserHelper helper = new UserHelper();
		userDTO = helper.isUserExist(userDTO); // 44
		System.out.println(userDTO.getMessage());
		scanner.close();
	}
	public static void main(String[] args) {
		UserView view = new UserView();
		view.doLogin();
	}
}
