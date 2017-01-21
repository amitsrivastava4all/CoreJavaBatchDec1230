package com.fb.users.view;

import java.util.Scanner;

import com.fb.users.dto.UserDTO;
import com.fb.users.helper.UserHelper;

public class RegisterView {
	public void doRegister(){
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Userid ");
		String userid = scanner.next();
		System.out.println("Enter the Password");
		String password  = scanner.next();
		System.out.println("Enter the Phone");
		String phone = scanner.next();
		UserDTO userDTO = new UserDTO();
		userDTO.setUserid(userid);
		userDTO.setPassword(password);
		userDTO.setPhone(phone);
		UserHelper helper = new UserHelper();
		String message = helper.doRegister(userDTO);
		System.out.println(message);
	}
}
